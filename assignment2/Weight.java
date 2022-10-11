import java.util.Scanner;

/*
 * @author Jonathan Weaver
 * 
 * This program, given the mass of a person and the acceleration due to gravity on earth,
 * calculates the weight of the person on earth, and what would be their weight if they
 * were on the moon.
 */

public class Weight {
    public static void main(String... args) {
        System.out.println("\nWould you like to know your weight on earth and on the moon?\n");
        try (Scanner input = new Scanner(System.in)) {
            System.out.println(
                    "Enter the value of acceleration due to gravity on earth (Hint: between 9.8 m/s^2 - 10 m/s^2)");
            double accelerationDueToGravity = input.nextDouble();

            System.out.println("Enter your approximate mass (in kilograms)");
            double mass = input.nextDouble();

            double weightOnEarth = accelerationDueToGravity * mass;
            double weightOnMoon = (weightOnEarth / accelerationDueToGravity) * 1.622;

            System.out.println(
                    "\nYour weight on earth is " + weightOnEarth + "N, which makes your weight on the moon "
                            + weightOnMoon + "N.\n");
        }
    }
}
