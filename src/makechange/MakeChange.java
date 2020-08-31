package makechange;

import java.util.Scanner;

public class MakeChange {
	public static void main(String[] args) {
		Scanner kb = new Scanner(System.in);
		// Variables to store customer input
		double price = 0.00;
		double amountGiven = 0.00;
		// Initialize variables to define currency values
		double ten = 10.00;
		double five = 5.00;
		double one = 1.00;
		double quarter = 0.25;
		double dime = 0.10;
		double nickel = 0.05;
		double penny = 0.01;
		// keepGoing allows user to continue entering purchases until they choose to
		// quit
		boolean keepGoing = true;
		// Greet the customer
		System.out.println(
				"Hello, I am Apu! Welcome to the Kwick E Mart!" + "\n" + "Convienience forever, freshness never!");

		// Prompt user for purchase price and amount tendered
		while (keepGoing) {
			System.out.print("Please enter the price of the item: ");
			price = kb.nextDouble();

			System.out.print("Please enter the amount tendered: ");
			amountGiven = kb.nextDouble();
			// Calculate change returned to customer
			double changeReturned = amountGiven - price;
			// changeReturned variable is rounded to reflect 2 digit decimal value
			changeReturned = Math.round(changeReturned * 100.00) / 100.00;
			// If exact change is given no further calculations are needed
			if (price == amountGiven) {
				System.out.println(
						"Thank you for providing exact change! Feel free to grab a free box of expired Krusty-O's on your way out.");
				// If amount tendered is less than purchase price, an error message is displayed
				// and loop is broken
			} else if (price > amountGiven) {
				System.err.println(
						"Mr. Simpson, that is not even enough to buy a Squishee. Please pay full price for your items or get out and come again!");
				break;
				// If amount given is greater than purchase price, change due amount is
				// displayed
			} else {
				System.out.printf("Your total change due is: $%.2f%n", changeReturned);
			}
			// In this section we will calculate the amount of each individual bill or
			// coin returned to customer. Double variable is cast to an Integer and
			// displayed on screen to report how many of each bill or coin will be returned

			// If changeReturned divided by each currency amount is greater than zero the
			// whole number amount of that currency is extracted and
			// stored as an integer. changeReturned is then reassigned to change returned of
			// that modulo amount.
			if ((changeReturned / ten) > 0) {
				int tensReturned = (int) (changeReturned / ten);
				// during testing it was discovered that some calculations were off due to
				// double rounding flaws, adding 0.0001 was able to correct the errors
				changeReturned = (changeReturned % ten) + 0.0001;
				// Nested if used to determine if it is necessary to print value. For better
				// output formatting
				if (tensReturned == 0) {

				} else if (tensReturned == 1) {
					System.out.println("Please give the customer " + tensReturned + " Ten dollar bill.");
				} else if (tensReturned > 1) {
					System.out.println("Please give the customer " + tensReturned + " Ten dollar bills.");

				}
			}

			if ((changeReturned / five) > 0) {
				int fivesReturned = (int) (changeReturned / five);
				changeReturned = (changeReturned % five);
				if (fivesReturned == 0) {

				} else if (fivesReturned == 1) {
					System.out.println("Please give the customer " + fivesReturned + " Five dollar bill.");

				} else if (fivesReturned > 1) {
					System.out.println("Please give the customer " + fivesReturned + " Five dollar bills.");
				}
			}

			if ((changeReturned / one) > 0) {
				int onesReturned = (int) (changeReturned / one);
				changeReturned = (changeReturned % one);
				if (onesReturned == 0) {

				} else if (onesReturned == 1) {
					System.out.println("Please give the customer " + onesReturned + " One dollar bill.");

				} else if (onesReturned > 1) {
					System.out.println("Please give the customer " + onesReturned + " One dollar bills.");
				}
			}

			if ((changeReturned / quarter) > 0) {
				int quartersReturned = (int) (changeReturned / quarter);
				changeReturned = (changeReturned % quarter);
				if (quartersReturned == 0) {

				} else if (quartersReturned == 1) {
					System.out.println("Please give the customer " + quartersReturned + " Quarter.");

				} else if (quartersReturned > 1) {
					System.out.println("Please give the customer " + quartersReturned + " Quarters.");
				}
			}

			if ((changeReturned / dime) > 0) {
				int dimesReturned = (int) (changeReturned / dime);
				changeReturned = (changeReturned % dime);

				if (dimesReturned == 0) {

				} else if (dimesReturned == 1) {
					System.out.println("Please give the customer " + dimesReturned + " Dime.");

				} else if (dimesReturned > 1) {
					System.out.println("Please give the customer " + dimesReturned + " Dimes.");
				}
			}

			if ((changeReturned / nickel) > 0) {
				int nickelsReturned = (int) (changeReturned / nickel);
				changeReturned = (changeReturned % nickel) + 0.001;
				if (nickelsReturned == 0) {

				} else if (nickelsReturned == 1) {
					System.out.println("Please give the customer " + nickelsReturned + " Nickel.");

				} else if (nickelsReturned > 1) {
					System.out.println("Please give the customer " + nickelsReturned + " Nickels.");
				}
			}

			if ((changeReturned / penny) > 0) {
				int pennyReturned = (int) (changeReturned / penny);
				changeReturned = (changeReturned % penny) + 0.001;
				if (pennyReturned == 0) {

				} else if (pennyReturned == 1) {
					System.out.println("Please give the customer " + pennyReturned + " Penny.");

				} else if (pennyReturned > 1) {
					System.out.println("Please give the customer " + pennyReturned + " Pennies.");
				}
			}

			// User is prompted to enter if they are finished or wish to continue
			System.out.print(
					"Do you have any other purchases? " + "May I suggest a discounted 3 day old hot dog? Enter Y/N: ");
			String choice = kb.next();

			// Switch is used to reflect multiple possible user inputs
			switch (choice) {
			case "Y":
			case "y":
			case "yes":
			case "Yes":
			case "YES":
				keepGoing = true;
				break;
			case "N":
			case "n":
			case "no":
			case "No":
			case "NO":
				keepGoing = false;
				System.out.println("Thank you, come again!!");
				break;
			default:
				System.out.println("Mr. Simpson, that is an invalid choice. How many Duff's have you had today?");
				keepGoing = false;
				break;
			}

		}

		kb.close();
	}
}
