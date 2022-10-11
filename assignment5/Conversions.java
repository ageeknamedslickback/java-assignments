import java.util.Scanner;

/*
 * 
 * @author Kenneth Mathenge
 * @date Sep 15, 2022
 * 
 * This program's core functionality is to do the following conversions:
 *  1. Covert cubic feet to U.S bushels - 1 cubic foot = 0.803564 U.S. bushel
 *  2. Convert miles to kilometers - 1 mile = 1.60934 km
 *  3. Determine the graduation with honors title give the GPA
 *          Cum Laude 3.5-3.7
 *          Magna Cum Laude 3.8-3.9
 *          Summa Cum Laude 4.0+
 * 
 * The program provides the user with a menu to select the conversion, the
 * need or exit the program when done.
 * 
 */

public class Conversions {
    /*
     * Convert cubic feet to U.S bushels using the formula 1 cubic foot = 0.803564
     * U.S. bushel
     * 
     * @param cubicFeet The cubic feet to be converted to U.S bushels
     * 
     * @return A double containing the U.S bushel conversion
     */
    public double convertCubicFeetToBushels(int cubicFeet) {
        double bushes = cubicFeet * 0.803564;
        return bushes;
    }

    /*
     * Convert miles to kilometers using the formula 1 mile = 1.60934 km
     * 
     * @param miles The int miles to be converted to kilometers
     * 
     * @return A double containing the miles to kms conversion
     */
    public double convertMilesToKilometers(int miles) {
        double kilometers = miles * 1.60934;
        return kilometers;
    }

    /*
     * Determines the graduation honours title given the GPA
     * 
     * @param gpa The GPA score the be determined
     * 
     * @return A string of the GPA's graduation title
     */
    public String graduationHonoursTitle(String gpa) {
        String title = "";
        switch (gpa) {
            case "3.5":
            case "3.6":
            case "3.7":
                title = "Cum Laude";
                break;
            case "3.8":
            case "3.9":
                title = "Magna Cum Laude";
                break;
            case "4.0+":
                title = "Summa Cum Laude";
                break;
            default:
                break;
        }
        return title;
    }

    public static void main(String... args) {
        boolean loop = true;
        try (Scanner input = new Scanner(System.in)) {
            // Do the loop until the user actively prompts the program to exit
            while (loop) {
                System.out.println(
                        "\n\t MENU \n1: Convert cubic feet to U.S. bushels\n2: Convert miles to kilometers\n3: Determine graduation title with honors\n9: Exit program\n");
                System.out.print("\nEnter your selection: ");
                int menuOption = input.nextInt();
                Conversions convert = new Conversions();
                switch (menuOption) {
                    // If the menu option is 1, we do the cubic feet to U.S bushels conversion
                    case 1:
                        System.out.print("\n\tEnter cubic feet: ");
                        int cubicFeet = input.nextInt();
                        double bushels = convert.convertCubicFeetToBushels(cubicFeet);
                        System.out.println("\t" + cubicFeet + " cubic ft. = " + bushels + " U.S. bushels");
                        break;

                    // If the menu input is 2, we do the miles to kilometers conversion
                    case 2:
                        System.out.print("\n\tEnter miles: ");
                        int miles = input.nextInt();
                        double kilometers = convert.convertMilesToKilometers(miles);
                        System.out.println("\t" + miles + " miles = " + kilometers + " km");
                        break;

                    // If the input is 3, we determine the graduation title of the GPA
                    case 3:
                        System.out.print("\n\tEnter GPA: ");
                        String gpa = input.next();
                        String graduationTitle = convert.graduationHonoursTitle(gpa);
                        System.out.println("\tCongratulations, you have graduated " + graduationTitle + "!");
                        break;

                    // If the input is 9, we gracefully exit the program
                    case 9:
                        loop = false;
                        System.out.println("Thank you for using the program. Goodbye!\n");
                        break;

                    // For any other input, do nothing
                    default:
                        break;
                }

            }
        }

    }

}
