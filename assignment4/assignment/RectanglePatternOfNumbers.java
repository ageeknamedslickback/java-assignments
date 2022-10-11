import java.util.Scanner;

/*
 * 
 * @author Kenneth Mathenge
 * @date Sep 10, 2022
 * 
 * This Java code prompts the user for a number n and output the rectangular pattern 
 * with inner reducing numbers using nested for-loops.
 * 
 */

public class RectanglePatternOfNumbers {
    public static void main(String... args) {
        // Accept the user input to compute and print the rectangular pattern
        System.out.print("Enter the value of n: ");
        try (Scanner input = new Scanner(System.in)) {
            int n = input.nextInt();
            int sizeOfPattern = 2 * n - 1;
            int row = 0;
            int column = sizeOfPattern - 1;
            int a[][] = new int[sizeOfPattern][sizeOfPattern];

            // The value of n forms the outer most layer. It reduces by 1 to form the inner
            // most layer and repeats until the value of n reduces to 1
            while (n != 0) {
                for (int i = row; i <= column; i++) {
                    for (int j = row; j <= column; j++) {
                        if (i == row || i == column || j == row || j == column)
                            // The value of n forms the outer-most rectangular box layer
                            a[i][j] = n;
                    }
                }
                ++row;
                --column;
                --n; // reduce the value of n by 1 to form the inner rectangular box layer
            }

            // Compose and print out the pattern
            for (int i = 0; i < sizeOfPattern; i++) {
                for (int j = 0; j < sizeOfPattern; j++) {
                    System.out.print(a[i][j]);
                }
                System.out.println();
            }
        }
    }
}
