package recitation214;

public class BinaryNumber {

    public static String toBinary(int n) {
        //TODO: the last bit is 0 if n & 1 == 0; otherwise it is 1
        //      n >>> 1 will shift n to the right by 1 bit
        //      using these operators, implement toBinary recursively
    	
    	if(n == 0)
    		return "";
    	return toBinary(n >>> 1) + ((n & 1) == 0 ? "0" : "1");
    }
    
    public static void main(String[] args) {
        System.out.println(toBinary(1));
        System.out.println(toBinary(-1));
        
        System.out.println(toBinary(5));
        System.out.println(toBinary(-5));
    }
}
