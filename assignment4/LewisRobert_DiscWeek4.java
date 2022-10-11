import java.util.Scanner;

public class LewisRobert_DiscWeek4 {
	/*
	 * This program will ask the user to input their test score.
	 * They must receive 80% or higher to receive their certificate
	 * The user will continue to input scores until they have received a grade
	 * higher than 80%
	 */
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.println("You are about to take the exam.");
		System.out
				.println("You must receive a score of at least 80% to pass this course and recieve your certificate.");

		// Initialize variables
		int examAttempt = 0;
		int examScore;

		System.out.print("\n\nPlease input your last text score: ");

		examScore = in.nextInt();

		/*
		 * do-while update done by Kenneth Mathenge
		 */
		do {
			examAttempt = examAttempt + 1;
			System.out.println("\nAttempt" + examAttempt + ": " + examScore + "%");
			System.out.println("You must achieve a score of 80% or higher on your exam.");
			System.out.print("Please take the exam again and submit your score.");
			System.out.print("\n\nPlease input your last text score: ");
			examScore = in.nextInt();
		} while (examScore < 80);

		if (examScore >= 80) {
			System.out.println("Congrats!  You have passed the course!");
		}
	}

}
