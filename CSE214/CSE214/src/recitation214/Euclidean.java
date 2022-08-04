package recitation214;

public class Euclidean {
    private static int GCDPos1(int a, int b) {
        //subtraction based
        if(a < b) {
        	return GCDPos1(b-a, a);
        }else if(b < a) {
        	return GCDPos1(a-b, b);
        }else return a;
    }
    private static int GCDPos2(int a, int b) {
        //remainder based
    	if(a == 0) {
    		return b;
    	}else if(b == 0) {
    		return a;
    	}else if(a > b) {
    		return GCDPos2(a % b, b);
    	}else if(a < b) {
    		return GCDPos2(a, b % a);
    	}else return a;
    }

    public static int GCD1(int a, int b) {
        a = a < 0 ? -a : a;
        b = b < 0 ? -b : b;
        return GCDPos1(a, b);
    }
    public static int GCD2(int a, int b) {
        a = a < 0 ? -a : a;
        b = b < 0 ? -b : b;
        return GCDPos2(a, b);
    }
    public static void main(String[] args) {
        //if(args.length == 2) {
    	{
    		int a = Integer.parseInt("24");
            int b = Integer.parseInt("15");
            System.out.println("GCD1: " + GCD1(a, b));
            System.out.println("GCD2: " + GCD2(a, b));
        }
    }
}