import java.util.Scanner;

/*
 * @author Kenneth Mathenge
 * @date Sep 21, 2022
 * 
 * This program will allow the user to determine the placement of robotics teams
 * participating in a regional competition based on the aggregate score from the 
 * panel of judges.
 */
public class RoboticsCompetition {

    /*
     * A method that gets integer array and uses for-loop to find the index
     * of the largest value.
     * 
     * @param teamsScores The `integer array` to get the index of the largest value
     */
    public int findIndexOfLargestValue(int[] teamsScores) {
        int largest = 0;
        for (int i = 1; i < teamsScores.length; i++) {
            if (teamsScores[i] > teamsScores[largest])
                largest = i;
        }
        return largest; // position of the first largest found.
    }

    /*
     * A method that gets integer array and uses for-loop to find the index
     * of the smallest value.
     * 
     * @param teamsScores The `integer array` to get the index of the smallest value
     */
    public int findIndexOfSmallestValue(int[] teamsScores) {
        int smallest = 0;
        for (int i = 1; i < teamsScores.length; i++) {
            if (teamsScores[i] < teamsScores[smallest])
                smallest = i;
        }
        return smallest; // position of the first smallest found.
    }

    public static void main(String... args) {
        try (Scanner input = new Scanner(System.in)) {
            // Enter the number of teams that participate in the competition
            System.out.print("\nHow many teams do you want to enter: ");
            int numberOfTeams = input.nextInt();

            // Arrays to store the names and scores
            String[] teamsNames = new String[numberOfTeams];
            int[] teamsScores = new int[numberOfTeams];

            int count = 0;
            while (count < numberOfTeams) {
                // Input the teams name and the judge's score
                System.out.println("Team " + (count + 1) + ":");
                System.out.print("\tEnter team's name: ");
                String teamFirstName = input.next();
                String teamSecondName = input.next();
                System.out.print("\tEnter team's score (400-1000): ");
                int teamScore = input.nextInt();

                // Team's score should be between 400 and 1000
                if (teamScore < 400 || teamScore > 1000) {
                    System.out.println("Team's score should be between 400 and 1000");
                    return;
                }

                // Store robotics team names and scores in separate arrays
                for (int i = count; i < numberOfTeams; i++) {
                    teamsNames[i] = "" + teamFirstName + " " + teamSecondName;
                    teamsScores[i] = teamScore;
                }

                // Increment loop counter
                count++;
            }

            // Print out the teams and their scores
            for (int i = 0; i < numberOfTeams; i++) {
                System.out.println();
                System.out.print("" + teamsNames[i] + " " + teamsScores[i]);
            }

            // Initialize the class to fetch the team results
            RoboticsCompetition competition = new RoboticsCompetition();

            int largestValueIndex = competition.findIndexOfLargestValue(teamsScores);
            int smallestValueIndex = competition.findIndexOfSmallestValue(teamsScores);

            // Program output
            System.out.println();
            System.out.println("\nThe " + teamsNames[largestValueIndex] +
                    " have the highest score => " +
                    teamsScores[largestValueIndex] +
                    " and The " +
                    teamsNames[smallestValueIndex] +
                    " have the lowest score => " +
                    teamsScores[smallestValueIndex]);
            System.out.println();
        }
    }
}
