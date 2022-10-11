import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

/**
 * Developer - Logan Laine Class - CMIS 141/6382 Date 26SEP2022 Instructor -
 * Professor Rowson
 * Program asks user for a number greater than or equal to 5, and flips a coin
 * that many times
 * then prints the random results.
 */

public class LaineLogan_DiscWeek7 {

	public static int[] randomRoll(int size) {

		Random random = new Random();
		int[] a = new int[size];
		for (int i = 0; i < a.length; i++) {
			a[i] = random.nextInt(2);

		}
		return a;
	}

	public static void main(String[] args) {
		Scanner stdin = new Scanner(System.in);
		int flips = 0;
		System.out.println("Welcome to the coin flip!");
		System.out.print("\n	How many times would you like to flip the coin? (Must be five times or more): ");
		flips = stdin.nextInt();
		/*
		 * 
		 * @author Kenneth Mathenge
		 * 
		 * Change to ensure that the number of flip are not less than 5, and always
		 * add the dynamic size of the array by 2, which will add two bonus flips
		 * to those specified by the user
		 * 
		 */
		if (flips < 5) {
			System.out.println("\nThe program accepts a minimum of 5 flips");
			stdin.close();
			return;
		}
		int sizeofArray = flips + 2;
		int[] array = randomRoll(sizeofArray);

		System.out.print("	These are your flips. We have added 2 bonus flips for the fun of it: ");

		System.out.print("{");
		for (int i = 0; i < array.length; i++) {
			if (array[i] == 0) {
				System.out.print(" heads ");
			} else if (array[i] == 1) {
				System.out.print(" tails ");
			}
		}
		System.out.print("}");
		System.out.println("\n");
		stdin.close();
	}

}
