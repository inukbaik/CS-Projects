package hw214_7;

public class Parser {
    private static class Node {
        public Integer num;
        public Character opr;
        public Node(Integer num) { this.num = num; }
        public Node(Character opr) { this.opr = opr; }
        public String toString() {
            return num != null ? num.toString()
                :  opr != null ? opr.toString()
                :  ""
                ;
        }
    }
    
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
    
    public static BinaryTree<Node> parseExpr(String expr) {
        Scanner scan = new Scanner(expr);
        Stack<LinkedBinaryTree<Node>> tree = new StackByArray<LinkedBinaryTree<Node>>();
        Stack<Character> opr = new StackByArray<Character>();
        
        
        //TODO: - parseExpr will be similar to evalExpr function that evaluates
        //        infix expressions.
        //      - Here, instead of using the operand stack, we push/pop subtrees of
        //        the parse tree to/from the tree stack.  
        //      - When popping an operator, pop two parse-trees from the tree stack; 
        //        build a parse-tree rooted at the operator; and push the resulting tree
        //        onto the tree stack
        opr.push('#');
        for(String str : scan) {
        	char curr = str.charAt(0);
        	if(Scanner.isAlpha(curr)) {
        		throw new UnsupportedOperationException("Error");
        	} else if(Scanner.isDigit(curr)) {
        		LinkedBinaryTree<Node> num = new LinkedBinaryTree<Node>();
        		num.addRoot(new Node((int) (Double.parseDouble(str))));
        		tree.push(num);
        	} else {
        		Action a;
        		while((a = act[opr.top()][curr]) == Action.Pop) {
        			char oper = opr.pop();
        			if(oper == '+' || oper == '-' || oper == '/') {
        				LinkedBinaryTree<Node> t2 = tree.pop();
        				LinkedBinaryTree<Node> t1 = tree.pop();
        				LinkedBinaryTree<Node> t = new LinkedBinaryTree<Node>();
        				Position<Node> pos = t.addRoot(new Node(oper));
        				t.attach(pos, t1, t2);
        				tree.push(t);
        			} else if(oper == '#' || oper == '(') {
        				break;
        			} else {
        				throw new UnsupportedOperationException("Error");
        			}
        		}
        		if(a == Action.Push) {
        			opr.push(curr);
        		} else if(a == null) {
        			throw new IllegalStateException("Error");
        		}
        	}
        }
        if(opr.size() != 0) {
        	throw new IllegalStateException("Error");
        }
        return tree.top();
        
    }
    public static double evalExpr(BinaryTree<Node> tree) {
        LinkedBinaryTree<Node> parseTree = (LinkedBinaryTree<Node>) tree;
        Stack<Double> num = new StackByArray<Double>();
        
        //TODO: - evalExpr will be similar to evalPostfixExpr function that evaluates
        //        postfix expressions.
        //      - While traversing the nodes of the parseTree in the post-order,
        //        evaluate the expression by pushing/popping operands to/from the stack num 
        
        for(Position<Node> pos : parseTree.postorder()) {
        	String str = pos.getElement().toString();
        	char curr = str.charAt(0);
        	if(Scanner.isDigit(curr)) {
        		num.push(Double.parseDouble(str));
        	} else {
        		double num2 = num.pop();
        		double num1 = num.pop();
        		if(curr == '+') {
        			num.push(num1 + num2);
        		}else if(curr == '-') {
        			num.push(num1 - num2);
        		}else if(curr == '*') {
        			num.push(num1 * num2);
        		}else if(curr == '/') {
        			num.push(num1 / num2);
        		}
        	}
        }
        if(num.size() != 1) {
        	throw new IllegalStateException("Error");
        }
        return num.pop();
    }
    
    public static String infixToPrefix(String expr) {
        String strExp = "";
        LinkedBinaryTree<Node> parseTree = (LinkedBinaryTree<Node>) parseExpr(expr);
        for(Position<Node> p: parseTree.preorder())
            strExp += p.getElement() + " ";
        return strExp;
    }

    public static String infixToPostfix(String expr) {
        String strExp = "";
        LinkedBinaryTree<Node> parseTree = (LinkedBinaryTree<Node>) parseExpr(expr);
        for(Position<Node> p: parseTree.postorder())
            strExp += p.getElement() + " ";
        return strExp;
    }
    
    public static String infixToInfix(String expr) {
        String strExp = "";
        LinkedBinaryTree<Node> parseTree = (LinkedBinaryTree<Node>) parseExpr(expr);
        for(Position<Node> p: parseTree.inorder())
            strExp += p.getElement() + " ";
        return strExp;
    }
}
