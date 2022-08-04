package Lab3;

public class Height {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int feet1 = 5;
		int inches1 = 11;
		int feet2 = 6;
		int inches2 = 5;
		int value = (inches1 + inches2) / 12;
		int feet3 = feet1 + feet2 + value;
		int inches3 = (inches1 + inches2) % 12;
		
		System.out.println("feet 1 = " + feet1 + " inches 1 = " + inches1);
		System.out.println("feet 2 = " + feet2 + " inches 2 = " + inches2);
		System.out.println("feet 3 = " + feet3 + " inches 3 = " + inches3 + " (result)");
		
	}

}
