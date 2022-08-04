package Lab4;

public class Tuition {

	public static void main(String[] args) {
		
	double current_tuition = 10000;
	double riserate = 1.07;
	int year = 0;
	
	while ( current_tuition < 20000) {
	current_tuition = current_tuition * riserate;
	year++;
	}
	System.out.println(year + " years.");
	}

}