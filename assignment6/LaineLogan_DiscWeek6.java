import java.util.Scanner;

public class LaineLogan_DiscWeek6 {

	// menu method - displays options for the if else statement in main.
	public static void displayMenu() {
		System.out.println("   MENU"); // tab added to format console display.
		System.out.println("1: Determine area");
		System.out.println("3: Determine perimeter");
		System.out.println("2: Exit"); // 2 allows user to exit using the while loop.
		System.out.println(); // added for readability.

	}

	// gets input values as parameters.
	// does calculation/manipulation with input values.
	public static double convertArea(int length, int width) {
		int area;

		area = (length * width);
		return area; // method returns a result of the calculation/manipulation.

	}

	// gets input values as parameters.
	// does calculation/manipulation with input values to get the perimeter.
	public static double convertPerimeter(int length, int width) {
		int perimeter = length + width;
		return perimeter; // method returns a result of the calculation/manipulation.

	}

	public static void main(String[] args) {

		Scanner stdin = new Scanner(System.in);
		int selection = 0;
		int length = 0;
		int width = 0;

		do {
			displayMenu();

			System.out.print("Enter your selection: ");
			selection = stdin.nextInt();
			System.out.println();

			if (selection == 1) {

				System.out.print("	Enter length: ");// prompts user for first input value.
				length = stdin.nextInt();
				System.out.print("	Enter width: ");// prompts user for second input value.
				width = stdin.nextInt();
				int area = (int) convertArea(length, width); // calls conversion method

				System.out.println("	" + "Area = " + area); // prints a meaningful message along with the value
																// returned from the method.
				System.out.println(""); // added for readability.

			}

			/*
			 * 
			 * @author Kenneth Mathenge
			 * 
			 * Calculate the perimeter by adding the length and the width
			 */
			if (selection == 3) {
				System.out.print("	Enter length: ");// prompts user for first input value.
				length = stdin.nextInt();
				System.out.print("	Enter width: ");// prompts user for second input value.
				width = stdin.nextInt();
				int area = (int) convertPerimeter(length, width); // calls conversion method

				System.out.println("	" + "Perimeter = " + area); // prints a meaningful message along with the value
				// returned from the method.
				System.out.println(""); // added for readability.
			}

		} while (selection != 2); // If selection is 2 the program will end.
		stdin.close();

	}

}
