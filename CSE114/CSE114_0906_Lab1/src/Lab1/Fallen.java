package Lab1;

public class Fallen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int time1 = 3;
		double distance1 = fallenDistance(time1);
		System.out.println("In 3 seconds, the object has fallen " + distance1 + " meters.");
		
		int time2 = 10;
		double distance2 = fallenDistance(time2);
		System.out.println("In 10 seconds, the object has fallen " + distance2 + " meters.");
	}
	public static double fallenDistance(int time) {
		
	double D;
	double g = 9.8;
	
	D = 0.5 * g * time * time;
	
	return D;
	
	}
	
}


//