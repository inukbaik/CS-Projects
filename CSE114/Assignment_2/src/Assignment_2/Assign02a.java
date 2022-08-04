package Assignment_2;

// CSE 114, Assignment 2
//  Name: Inuk Baik
//  SBU ID number: 112493042
//  SBU email: inuk.baik@stonybrook.edu

public class Assign02a {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		runTests();
		System.out.println("[Done]");
	}

	// Define calculatePay() : public static double calculatePay(String employeeName, int hoursWorked, double hourlyRate)
	public static double calculatePay(String employeeName, int hoursWorked, double hourlyRate) {
		double payCheck = 0;
		
		if(hoursWorked <= 40) {
			payCheck = hoursWorked * hourlyRate;
			System.out.println(employeeName + " : Paycheck amount: $" + payCheck);
		}
		else if(hoursWorked <= 50) {
			payCheck = 40 * hourlyRate + (hoursWorked - 40) * hourlyRate * 1.5; 
			System.out.println(employeeName + " : Paycheck amount: $" + payCheck);
		}
		else if(hoursWorked > 50) {
			payCheck = 40 * hourlyRate + 10 * hourlyRate * 1.5 + (hoursWorked - 50) * hourlyRate * 2;
			System.out.println(employeeName + " : Paycheck amount: $" + payCheck);
		}
		
		return payCheck;
		
	}
	
	public static void runTests() {
		double finalPayReturned;
		double eps = 0.0001;
		
		finalPayReturned = calculatePay("Joseph Cool", 39, 30.50);
		if ((Math.abs(finalPayReturned - 1189.50)) < eps) {
			// pass
			System.out.println("Test case 1 : Pass");
		} else {
			// fail
			System.out.println("Test case 1 : Fail");
		}
		finalPayReturned = calculatePay("Sarah Jane Smith", 45, 31.50);
		if ((Math.abs(finalPayReturned - 1496.25)) < eps) {
			// pass
			System.out.println("Test case 2 : Pass");
		} else {
			// fail
			System.out.println("Test case 2 : Fail");
		}
		
		finalPayReturned = calculatePay("Rose Tyler", 52, 28.00);
		if ((Math.abs(finalPayReturned - 1652.00)) < eps) {
			// pass
			System.out.println("Test case 3 : Pass");
		} else {
			// fail
			System.out.println("Test case 3 : Fail");
		}
		
	}
}
