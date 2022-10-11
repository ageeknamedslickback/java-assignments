package assignment;
/*
 * 
 * @author Kenneth Mathenge
 * @date Sep 03 2022
 * 
 * This is a program that calculates a gamer's total XP score with a bonus per level.
 * The program should:
 *       1. Prompt and read user’s input for the gamer's name, Level 1 XP (L1), Level 2 XP (L2), Level 3 XP (L3), and Engagement score (ES). User Scanner to read input.
 *       2. Each XP score input should be in whole numbers between 10-100 and in increments of 5.
 *       3. The total XP score with bonuses should be calculated as follows:
 *            L1+L1*0.20+L2+L2*0.30+L3+L3*0.50+ES+ES*0.60
 *       4. Output the gamer's information and the total calculated XP score (including bonuses).
 *       5. Prompt the user as to whether they want to calculate total XP for another gamer
 *          and repeat the input/output processing
 *       6. Allow user to exit the program without inputting gamer's data
 */

import java.util.Scanner;

public class PlayerXP {
    public static void main(String... args) {
        System.out.println("\nWelcome to the Total XP calculation program!");
        boolean runLoop = true;
        try (Scanner input = new Scanner(System.in)) {
            while (runLoop) {
                // First yes/no prompt input
                System.out.println("\nDo you want to enter gamer's data? Yes/No =>");
                String response = input.next();

                // exit program
                if (response.equals("No")) {
                    System.out.println("Thank you for using the Total XP calculation program!\n");
                    runLoop = false;
                    break;
                } else if (response.equals("Yes")) {
                    // Input and read the gamer's name
                    System.out.println("Enter gamer's name =>");
                    String gamerFirstName = input.next();
                    String gamerLastName = input.next();

                    // Input and read the different levels XP and engagement score
                    System.out.println("Enter gamer's Level XP scores separated by space: L1 L2 L3 ES =>");
                    int level1XP = input.nextInt();
                    int level2XP = input.nextInt();
                    int level3XP = input.nextInt();
                    int engagementScore = input.nextInt();

                    // Check if the level XPs provided are whole numbers in increments of 5
                    if (level1XP % 5 != 0 ||
                            level2XP % 5 != 0 ||
                            level3XP % 5 != 0 ||
                            engagementScore % 5 != 0) {
                        System.out.println("Score input should be in whole numbers in increments of 5\n");
                        continue;
                    }

                    // Check if the level XPs provided are between 10 and 100
                    if ((level1XP < 10 || level1XP > 100) ||
                            (level2XP < 10 || level2XP > 100) ||
                            (level3XP < 10 || level3XP > 100) ||
                            (engagementScore < 10 || engagementScore > 100)) {
                        System.out.println("Score input should be in whole numbers between 10-100\n");
                        continue;
                    }

                    // Calculate the final XP score with bonuses
                    double finalXP = level1XP + level1XP * 0.20 + level2XP + level2XP * 0.30 + level3XP
                            + level3XP * 0.50
                            + engagementScore + engagementScore * 0.60;

                    // System prompted output that displays the final XP with bonuses
                    System.out
                            .println("Gamer Name: " + gamerFirstName + " " + gamerLastName + " L1=" + level1XP + " L2="
                                    + level2XP + " L3=" + level3XP
                                    + " ES=" + engagementScore + "\nFinal XP score with bonuses=" + finalXP);

                } else {
                    // Print out a message and a way out if the user input is neither Yes or No
                    System.out.println(response + " is not a correct input option. Try again with Yes or No");
                }
            }

        }
    }

}
