import java.util.Random;
import java.util.Scanner;

/*
 *
 * @author Kenneth Mathenge
 * @date Oct 1, 2022
 * 
 * This program generates random pet names for the different
 * pet species/type that have been specified. It accepts at least 
 * five species of animals/pets.
 * 
 */
public class PetNames {
    /*
     * A method that generates a random pet name for each of the pet type passed
     * 
     * @param petTypes The `array` of pet types to generate names for
     */
    public static void randomPetNames(String[] petTypes) {
        // Array of names in our data store
        String[] names = {
                "PRESCOTT",
                "HUGHY",
                "TEALA",
                "GISELLE",
                "KLOOSKA",
                "LOULOUTE",
                "WILFREDO",
                "YUYU",
                "DIETRICH",
                "NIKA",
        };

        // For each pet type passed, generate a random name from the above list
        // and assign a name to the pet type
        System.out.println("\nYour pet(s) can be called:");
        for (int i = 0; i < petTypes.length; i++) {
            Random rand = new Random();
            int randomNameIndex = rand.nextInt(names.length);
            petTypes[i] = "\t" + petTypes[i] + " - " + names[randomNameIndex];
            System.out.println(petTypes[i]);
        }
        System.out.println();
    }

    public static void main(String... args) {
        try (Scanner input = new Scanner(System.in)) {
            // Output a menu of allowable pet types
            System.out.println(
                    "List of pet species to choose from\n\t1. Cat\n\t2. Dog\n\t3. Bird\n\t4. Rabbit\n\t5. Guinea Pig\n\t6. Fish\n\t7. Reptile\n\t8. Ferret\n");

            System.out.print("How many pet types would you like their names suggested (should be at least 5): ");
            int numberOfPets = input.nextInt();

            // Ensure there are at least 5 pet types added
            if (numberOfPets < 5 || numberOfPets > 8) {
                System.out.println("The program accepts a minimum of 5 and a maximum of 8 pet types");
                return;
            }
            System.out.print(
                    "Select the " + numberOfPets + " pet types you'd like to be recommended names (e.g 1 2 3 6 8 4): ");

            String[] petTypes = new String[numberOfPets];
            int count = 0;
            while (count < numberOfPets) {
                int petMenuNumber = input.nextInt();
                for (int i = count; i < numberOfPets; i++) {
                    // Substitute the menu option numbers, to the actual pet types
                    // and add the pet names to an array that will be manipulated later
                    switch (petMenuNumber) {
                        case 1:
                            petTypes[i] = "Cat";
                            break;
                        case 2:
                            petTypes[i] = "Dog";
                            break;
                        case 3:
                            petTypes[i] = "Bird";
                            break;
                        case 4:
                            petTypes[i] = "Rabbit";
                            break;
                        case 5:
                            petTypes[i] = "Guinea Pig";
                            break;
                        case 6:
                            petTypes[i] = "Fish";
                            break;
                        case 7:
                            petTypes[i] = "Reptile";
                            break;
                        case 8:
                            petTypes[i] = "Ferret";
                            break;

                        default:
                            break;
                    }
                }
                count++;
            }

            // Generate and assign the random pet names
            randomPetNames(petTypes);
        }
    }
}
