
/**
* Developer - Logan Laine Class - CMIS 141/6382 Date 11SEP2022	Instructor - Professor Rowson
* Program created to calculate and display how many calories have been burnt per step climbed.
*/

import java.util.Scanner;

public class LaineLogan_DiscWeek5 {

	public static void main(String[] args) {

		Scanner stdin = new Scanner(System.in);
		int N;

		System.out.print("Enter number of steps climbed: ");
		N = stdin.nextInt();

		for (int i = 1; i <= N; i++) {
			/*
			 * 
			 * Edit made by @Kenneth Mathenge
			 * If N is an even number the burnt calories per step is
			 * calculated by * 0.20 else it's calculated by * 0.17
			 * 
			 */
			double burntPerStep;
			if (N % 2 == 0) {
				System.out.print("Calculating calories burnt for an even number of steps...\n");
				burntPerStep = i * 0.20;
			} else {
				System.out.print("Calculating calories burnt for an odd number of steps...\n");
				burntPerStep = i * 0.17;
			}
			System.out.print("After climbing " + i + " steps, you burnt ");
			System.out.printf("%.2f", +burntPerStep);
			System.out.println(" calories!");
		}
		stdin.close();
	}
}
