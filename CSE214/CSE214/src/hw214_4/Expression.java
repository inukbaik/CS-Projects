package hw214_4;

public class Expression {
    private static enum Action { Push, Pop }
    private static Action[][] act;
    
    static {
        act = new Action[128][128]; //[stack top][input token]
        act['#']['('] = act['(']['('] = act['+']['('] = act['-']['('] = act['*']['('] = act['/']['('] = Action.Push;
                        act['('][')'] = act['+'][')'] = act['-'][')'] = act['*'][')'] = act['/'][')'] = Action.Pop;
        act['#']['+'] = act['(']['+'] =                                                                 Action.Push;
                                        act['+']['+'] = act['-']['+'] = act['*']['+'] = act['/']['+'] = Action.Pop;
        act['#']['-'] = act['(']['-'] =                                                                 Action.Push;
                                        act['+']['-'] = act['-']['-'] = act['*']['-'] = act['/']['-'] = Action.Pop;
        act['#']['*'] = act['(']['*'] = act['+']['*'] = act['-']['*'] =                                 Action.Push;
                                                                        act['*']['*'] = act['/']['*'] = Action.Pop;
        act['#']['/'] = act['(']['/'] = act['+']['/'] = act['-']['/'] =                                 Action.Push;
                                                                        act['*']['/'] = act['/']['/'] = Action.Pop;
        act['#']['$'] = act['(']['$'] = act['+']['$'] = act['-']['$'] = act['*']['$'] = act['/']['$'] = Action.Pop;
    }
    
    private static boolean isOperator(char c) {
    	return c == '+' || c == '-' || c == '*' || c == '/' || c == '^' || c == '(' || c == ')';
    }
    
    public static String infixToPostfix(String expr) {
    	Stack<Character> oper = new StackByArray<Character>();
    	oper.push('#');
    	Action a;
    	String rtrString = "";
    	expr += '$';
    	
    	for(int i = 0; i < expr.length() - 1; i++) {
    		if(isOperator(expr.charAt(i))) {
    			a = act[oper.top()][expr.charAt(i)];
    			if(a == Action.Push) {
    				oper.push(expr.charAt(i));
    			}else {
    					rtrString += oper.pop();
    					oper.push(expr.charAt(i));
    					if(oper.top() == ')') {
    						oper.pop();
    						oper.pop();
    					}
    			}
    		}else {
    			rtrString += expr.charAt(i);
    		}
    	}
    	while(oper.top() != '#') {
    		a = act[oper.top()][expr.charAt(expr.length() - 1)];
    		if(a == Action.Pop) {
    			rtrString += oper.pop();
    		}
    	}
    	return rtrString;
    }
    
    public static double evalPostfixExpr(String expr) {
        Stack<Double> num = new StackByArray<Double>();
        for(int i = 0; i < expr.length(); i++) {
        	if(isOperator(expr.charAt(i))){
        		double newDbl = 0;
        		double a = num.pop();
        		double b = num.pop();
        		if(expr.charAt(i) == '+') {
        			newDbl = b + a;
        		}else if(expr.charAt(i) == '-') {
        			newDbl = b - a;
        		}else if(expr.charAt(i) == '*') {
        			newDbl = b * a;
        		}else if(expr.charAt(i) == '/') {
        			newDbl = b / a;
        		}
        		num.push(newDbl);
        	}else {
        		num.push((double)expr.charAt(i) - 48); //ASCII to double
        	}
        }
        return num.pop();
    }    
}
