//Inuk Baik, SBU ID: 112493042
//inuk.baik@stonybrook.edu

package Assign01;

public class Interest {

	public static void main(String[] args) {
		
		// Compute the interest on a bank account after 7 days.

		
	double account_balance = 123.50;
	double interest = 1.5;
	double daily_interest = interest / 100 / 365;
	//Divide daily_interest by 365.
	double total_interest = 0.0;
	
	
	account_balance = account_balance * daily_interest + account_balance;
	total_interest = total_interest + daily_interest * account_balance;
	account_balance = account_balance * daily_interest + account_balance;
	total_interest = total_interest + daily_interest * account_balance;
	account_balance = account_balance * daily_interest + account_balance;
	total_interest = total_interest + daily_interest * account_balance;
	account_balance = account_balance * daily_interest + account_balance;
	total_interest = total_interest + daily_interest * account_balance;
	account_balance = account_balance * daily_interest + account_balance;
	total_interest = total_interest + daily_interest * account_balance;
	account_balance = account_balance * daily_interest + account_balance;
	total_interest = total_interest + daily_interest * account_balance;
	account_balance = account_balance * daily_interest + account_balance;
	total_interest = total_interest + daily_interest * account_balance;
	
	
	System.out.println("total_interest = " + total_interest);
	System.out.println("Final account balance = " + account_balance);
	
	}

}
