import java.util.Scanner;

/*
 * 
 * @author Kenneth Mathenge
 * @date Sep 20, 2022
 * 
 * Take any  three digit number and write it twice to make a six-digit number.
 *      Divide the number by 7
 *      Divide it by 13
 *      Divide it by 11
 * The answers is the three-digit number.
 * 
 */
public class InterestingMath {
    /*
     * Do a series of divisions to a six number digit for it to return the same
     * three digit number
     * 
     * @param sixDigitNumberString The `String` format number to be divided to get
     * the equivalent
     * three digit number
     * 
     * Take a 6 digit number, Divide the number by 7, Divide it by 13, Divide it by
     * 11
     * 
     */
    public int sixDigitsBecomeThree(int sixDigitNumber) {
        int result = ((sixDigitNumber / 7) / 13) / 11;
        return result;
    }

    public static void main(String... args) {
        try (Scanner input = new Scanner(System.in)) {
            // Input to accept the two three digits number
            System.out.println(
                    "Welcome to Maths is Fun\n\n\tDid you know that when you take a three-digit number \n\twritten twice to make a six-digit number, \n\tdivide/multiply it by 7, 11 and 13 in any order \n\treturns the three-digit number?\n\nLet's find out!\n");
            System.out.print("Enter any three-digit number and write it twice to make a six-digit number: ");

            // Validate that the numbers entered have just three digits for correct
            // calculations
            String firstThreeDigitNumber = input.next();
            if (String.valueOf(firstThreeDigitNumber).length() != 3) {
                System.out.println("The first number should be a three digit number\n");
                return;
            }

            // Validate that the numbers entered have just three digits for correct
            // calculations
            String secondThreeDigitNumber = input.next();
            if (String.valueOf(secondThreeDigitNumber).length() != 3) {
                System.out.println("The second number should be a three digit number\n");
                return;
            }

            // Do the math
            InterestingMath math = new InterestingMath();
            String threeSixDigits = firstThreeDigitNumber + secondThreeDigitNumber;
            int sixDigitNumber = Integer.parseInt(threeSixDigits);
            int result = math.sixDigitsBecomeThree(sixDigitNumber);
            System.out.println("The magic number is " + result);
            System.out.println();
        }
    }
}