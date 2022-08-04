package Lab1;

public class Mod {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int num = 45628;
		
		System.out.println("The third digit from the right in 45628 is " + (num/100)%450 + ".");
		
		System.out.println("The last three digits in 45628 are: " + (num/100)%450 + ", " + (num/10)%4560 + ", and " + num%45620 + ".");
		
		
	}

}
