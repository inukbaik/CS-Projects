//Inuk Baik, SBU ID: 112493042
//inuk.baik@stonybrook.edu

package Assign01;

public class RussianChange {

	public static void main(String[] args) {
		
		//calculate the change while minimizing the notes and coins returned
		
		int cost = 313;
		int change = 1000 - cost;
		int remaining_change = change % 500;
		int remaining_change2 = remaining_change % 100;
		int remaining_change3 = remaining_change2 % 50;
		int remaining_change4 = remaining_change3 % 10;
		int remaining_change5 = remaining_change4 % 5;
		
		int $10RubleBills$ = change / 1000;
		int $5RubleBills$ = ( 1000 - cost ) / 500;
		int $2RubleBills$ = remaining_change / 200;
		int $1RubleBills$ = remaining_change / 100;
		int $50KopekCoins$ = remaining_change2 / 50;
		int $10KopekCoins$ = remaining_change3 / 10;
		int $5KopekCoins$ = remaining_change4 / 5;
		
		System.out.println("Change:");
		System.out.println("10 Ruble bills: " + $10RubleBills$);
		System.out.println("5 Ruble bills: " + $5RubleBills$);
		System.out.println("2 Ruble bills: " + $2RubleBills$);
		System.out.println("1 Ruble bills: " + $1RubleBills$);
		System.out.println("50 Kopek coins: " + $50KopekCoins$);
		System.out.println("10 Kopek Coins: " + $10KopekCoins$);
		System.out.println("5 Kopek Coins: " + $5KopekCoins$);
		System.out.println("1 Kopek Coins: " + remaining_change5);
	}

}
