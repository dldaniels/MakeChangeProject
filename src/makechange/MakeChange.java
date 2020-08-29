package makechange;

import java.util.Scanner;

public class MakeChange {
	public static void main(String[] args) {

		Scanner kb = new Scanner(System.in);

		double price = 0.00;
		double amountGiven = 0.00;

		System.out.print("Please enter the price of the item: ");
		price = kb.nextDouble();

		System.out.print("Please enter the amount tendered: ");
		amountGiven = kb.nextDouble();

		double changeReturned = amountGiven - price;
		changeReturned = Math.round(changeReturned * 100.00) / 100.00;

		if (price == amountGiven) {
			System.out.println("Thank you for providing exact change!");
		} else if (price > amountGiven) {
			System.err.println("Whoops, looks like that is not enough to cover the price. Please try again.");
		} else {

			System.out.printf("Your total change due is: $%.2f%n", changeReturned);
		}

		double ten = 10.00;
		double five = 5.00;
		double one = 1.00;
		double quarter = 0.25;
		double dime = 0.10;
		double nickel = 0.05;
		double penny = 0.01;

		// do {
		if ((changeReturned / ten) > 0) {
			int tensReturned = (int) (changeReturned / ten);
			changeReturned = (changeReturned % ten) + 0.0001;
			System.out.println("You should give back " + tensReturned + " Ten dollar bill/bills.");
		}

		if ((changeReturned / five) > 0) {
			int fivesReturned = (int) (changeReturned / five);
			changeReturned = (changeReturned % five);
			System.out.println("You should give back " + fivesReturned + " Five dollar bill/bills.");
		}

		if ((changeReturned / one) > 0) {
			int onesReturned = (int) (changeReturned / one);
			changeReturned = (changeReturned % one);
			System.out.println("You should give back " + onesReturned + " One dollar bill./bills");
		}

		if ((changeReturned / quarter) > 0) {
			int quartersReturned = (int) (changeReturned / quarter);
			changeReturned = (changeReturned % quarter);
			System.out.println("You should give back " + quartersReturned + " Quarters.");
		}

		if ((changeReturned / dime) > 0) {
			int dimesReturned = (int) (changeReturned / dime);
			changeReturned = (changeReturned % dime);
			System.out.println("You should give back " + dimesReturned + " Dimes.");
		}

		if ((changeReturned / nickel) > 0) {
			int nickelsReturned = (int) (changeReturned / nickel);
			changeReturned = (changeReturned % nickel) + 0.001;
			System.out.println("You should give back " + nickelsReturned + " Nickels.");
		}

		if ((changeReturned / penny) > 0) {
			int pennyReturned = (int) (changeReturned / penny);
			changeReturned = (changeReturned % penny) + 0.001;
			System.out.println("You should give back " + pennyReturned + " Pennies.");
		}

		// }while (changeReturned > 0);

		kb.close();

		/*
		 * switch(changeReturned) { case changeReturned % 20 > 0:
		 */

		// }

	}
}

//Make Change (Cash Register)
//Overview
//In the cash register we will calculate the amount of change returned to a customer based on the purchase price and the amount tendered. We will also notify the attendant how many of each piece of currency ($20 ,$10 ,$5 ,$1, .25c, .10c, .05c, .01c) is needed to make the change for the customer. Change should be provided using the largest bill and coin denominations as possible. Denominations that are not used should not be displayed.
//
//Hint: Mod operator
//
//User Story #1
//The user is prompted asking for the price of the item.
//
//User Story #2
//The user is then prompted asking how much money was tendered by the customer.
//
//User Story #3
//Display an appropriate message if the customer provided too little money or the exact amount.
//
//User Story #4
//If the amount tendered is more than the cost of the item, display the number of bills and coins that should be given to the customer.
//
//Grading
//This is a graded project. You are expected to have your project completed by the start of class on Monday morning.
//
//You will be given either a pass or fail based on whether your code works given all of the following test conditions:
//
//Amount: .67, Tendered: .50, Result: Error message
//Amount: .67, Tendered: 1.00, Result: 1 quarter, 1 nickel, 3 pennies.
//Amount: .59, Tendered: 1.00, Result: 1 quarter, 1 dime, 1 nickel, 1 penny.
//Amount: 3.96, Tendered: 20.00, Result: 1 ten dollar bill, 1 five dollar bill, 1 one dollar bill, 4 pennies.
//Amount: any amount less than 20.00, Tendered: anything greater than amount: correct denominations for correct change.
//If the project does work with all of the above test conditions, you will be given a 1 for this week's project.
//
//If the project does not work with the above test conditions, you will be given a 0 for this week's project.
//
//If you get a zero on the project, you can upgrade to a score of .5 if you turn in a working project by the start of class on the following Monday morning AND notify an instructor that you wish to get partial credit.
//
//To turn in a project, you must push it to GitHub. You must include a README.md that describes how to run your program.