import java.util.Scanner;

/*
 * 
 * @author Kenneth Mathenge
 * @date Sep 10, 2022
 * 
 * This Java code prompts the user for the number of rows (e.g. 7) and output the triangle pattern 
 * of numbers using nested for-loops.
 * 
 */

public class TrianglePatternOfNumbers {
    public static void main(String... args) {
        System.out.print("Enter the number of rows you want: ");
        try (Scanner input = new Scanner(System.in)) {
            int rows = input.nextInt();
            for (int i = 1; i <= rows; ++i) {
                for (int j = 1; j <= i; ++j) {
                    System.out.print(j + " ");
                }
                System.out.println();
            }
        }
    }
}
