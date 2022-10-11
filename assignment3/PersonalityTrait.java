import java.util.Scanner;

/*
 * @author Kenneth Mathenge
 * 
 * Based on the answers given by the user interacting with the program,
 * we are able to tell the user's Personality Traits. It can be either of:
 * Openness, Conscientiousness, Extraversion, Agreeableness and Neuroticism.
 */
public class PersonalityTrait {
    public static void main(String... args) {
        System.out
                .println("Would you like to know what is your personality trait (choose either of 1, 2, 3, 4, 5)? \n");
        try (Scanner input = new Scanner(System.in)) {
            System.out.println(
                    "Which one of the following best describes you:\n " +
                            "\n 1. I'm very creative and open to trying new things " +
                            "\n 2. Spends more time preparing and finishes important tasks right away " +
                            "\n 3. Enjoys being the center of attention and likes to start conversations " +
                            "\n 4. Has a great deal of interest in people and cares about others " +
                            "\n 5. Experiences a lot of stress and worries about different things\n");
            int personalTrait = input.nextInt();
            if (personalTrait == 1) {
                System.out.println("Your Personality Trait is Openness");
            } else if (personalTrait == 2) {
                System.out.println("Your Personality Trait is Conscientiousness");
            } else if (personalTrait == 3) {
                System.out.println("Your Personality Trait is Extraversion");
            } else if (personalTrait == 4) {
                System.out.println("Your Personality Trait is Agreeableness");
            } else if (personalTrait == 5) {
                System.out.println("Your Personality Trait is Neuroticism");
            } else {
                System.out.println("Oops! The option you have chosen does not exist");
            }
        }
    }
}
