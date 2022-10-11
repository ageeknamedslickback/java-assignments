// Name: Haggard, Harrison		//Class: CMIS 141/6382		Date: 09/02/2022

import java.util.Scanner;

/* this program will take user input, and calculate pay of an mlb player
 */

public class HaggardHarrison_Discussion3 {

	public static void main(String[] args) {

		// establishing variables
		Scanner in = new Scanner(System.in);
		int numWksPlayd, baseHit;
		double weeklyPay, basePay, bonusPayLow, bonusPayMed, bonusPayHigh;
		String playerName, performanceIncentive;
		int incentiveAmountLow = 1000; // the amount in dollars the player receives extra for each base hit over 24
		int incentiveAmountMed = 1500; // the amount in dollars the player receives extra for each base hit over 49
		int incentiveAmountHigh = 2000; // the amount in dollars the player receives extra for each base hit over 99

		// getting user input
		System.out.print("Enter the players name: ");
		playerName = in.nextLine();
		System.out.print("How many games did " + playerName + " play this season?: ");
		numWksPlayd = in.nextInt();
		System.out.print("How much does " + playerName + " make per game?: ");
		weeklyPay = in.nextDouble();
		System.out.print("Did " + playerName + " receive a performance incentive this season? " +
				"(making more than 25 base hits) yes or no: ");
		in.nextLine();
		performanceIncentive = in.nextLine();

		basePay = numWksPlayd * weeklyPay; // calculating the "base pay" for a player

		if (performanceIncentive.equalsIgnoreCase("no")) { // amount received if the player didn't get an incentive
			System.out.printf(playerName + " received $%.2f", basePay);
			System.out.print(" this season.");
		} else if (performanceIncentive.equalsIgnoreCase("yes")) { // if the player did get an incentive
			System.out.print("How many base hits did " + playerName + " make?: ");
			baseHit = in.nextInt();
			/*
			 * 
			 * @author Kenneth Mathenge
			 * 
			 * Edit made by Kenneth Mathenge to cap base hits at 200 to avoid over budgeting
			 * 
			 */
			if (baseHit >= 200) {
				System.out.println("\n**This run the code added by Kenneth Mathenge**\n");
				int maxBaseHits = 200;
				bonusPayHigh = maxBaseHits * incentiveAmountHigh;
				System.out.printf(playerName + " received $%.2f", (basePay + bonusPayHigh));
				System.out.print(" this season.\n");
			} else if (baseHit >= 100) { // if the player received the high incentive (100+ passes)
				bonusPayHigh = baseHit * incentiveAmountHigh;
				System.out.printf(playerName + " received $%.2f", (basePay + bonusPayHigh));
				System.out.print(" this season.");
			} else if (baseHit >= 50) { // if the player received the medium incentive (50-99 passes)
				bonusPayMed = baseHit * incentiveAmountMed;
				System.out.printf(playerName + " received $%.2f", (basePay + bonusPayMed));
				System.out.print(" this season.");
			} else if (baseHit >= 25) { // if the player received the low incentive (25-49 passes)
				bonusPayLow = baseHit * incentiveAmountLow;
				System.out.printf(playerName + " received $%.2f", (basePay + bonusPayLow));
				System.out.print(" this season.");
			} else { // if the player did not actually receive an incentive
				System.err.println(
						"Player did not make more than 24 base hits and therefore did not receive any incentive amount.");
			}
		} else { // if the user does not input correctly
			System.err.println("Please enter yes or no.");
		} // end of if statements
	} // end of main()
}
// end of class HaggardHarrison_Discussion3
