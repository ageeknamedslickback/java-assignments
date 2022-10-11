import java.util.Scanner;

/*
 * @author Kenneth Mathenge
 * @date 23/08/2022
 * 
 * This program prompts a user to enter two numbers between 200 and 1000 and a symbol
 * of operation such as +, -, * or /. With the given operation input,
 * perform the operation on the two numbers and output the results.
 * 
 */
public class Calculator {
    public static void main(String... args) throws Exception {
        // Minimum allowed number constant
        final int MINIMUM_NUMBER = 200;
        // Maximum allowed number constant
        final int MAXIMUM_NUMBER = 1000;

        try (Scanner scan = new Scanner(System.in)) {
            // Accept the two number inputs provided by the user that are separated by a
            // space
            System.out.println(
                    "Enter two numbers between 200 and 1000 separated by a space: ");
            // Get the first number input
            int firstNumber = scan.nextInt();
            // Get the second number input
            int secondNumber = scan.nextInt();
            // Check if the first and the second number are between 200 and 1000. Output a
            // good error message and return if the condition is not met
            if ((firstNumber < MINIMUM_NUMBER || firstNumber > MAXIMUM_NUMBER)
                    || (secondNumber < MINIMUM_NUMBER || secondNumber > MAXIMUM_NUMBER)) {
                System.out.println("Both the first and the second number provided should be between 200 and 1000");
                return;
            }

            // Prompt the user to input an operation
            System.out.println("Enter operation symbol (+, -, *, /): ");
            // Get the operation symbol for evaluation
            String operation = scan.next();

            // Defines the variable to store the results of the specified operation
            double operationResult = 0.0;
            switch (operation) {
                // If the operation is "+" perform a summation of the numbers given
                case "+":
                    operationResult = firstNumber + secondNumber;
                    break;

                // If the operation is "-" perform a subtraction of the numbers given
                case "-":
                    operationResult = firstNumber - secondNumber;
                    break;

                // If the operation is "*" perform a multiplication of the numbers given
                case "*":
                    operationResult = firstNumber * secondNumber;
                    break;

                // If the operation is "/" perform a division of the numbers given
                case "/":
                    operationResult = firstNumber / (double) secondNumber; // Avoid integer division
                    break;

                // If the operation is not any of the specified ones, return an error message
                // and return
                default:
                    System.out.println("Not valid operation symbol");
                    return;
            }

            // Output the numbers, operation and evaluation results
            System.out.println(
                    "Evaluation: " + firstNumber + " " + operation + " " + secondNumber + " = " + operationResult);
        }
    }
}