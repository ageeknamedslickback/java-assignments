import java.util.Random;
import java.util.Scanner;

/*
 * 
 * @author Kenneth Mathenge
 * 
 * This program generates a random selection of between 1 - 5 movies
 * to watch during your free time.
 * 
 */
public class Movies {
    public static void main(String... args) {
        String[] movies = {
                "The Shawshank Redemption (1994)",
                "The Godfather (1972)",
                "The Dark Knight (2008)",
                "The Godfather Part II (1974)",
                "12 Angry Men (1957)",
                "Schindler's List (1993)",
                "The Lord of the Rings: The Return of the King (2003)",
                "Pulp Fiction (1994)",
                "The Lord of the Rings: The Fellowship of the Ring (2001)",
        };

        System.out
                .print("\nEnter a random number between 1 - 5 and we'll surprise you with a good movie(s) to watch: ");
        try (Scanner input = new Scanner(System.in)) {
            int number = input.nextInt();
            if (number < 1 || number > 5) {
                System.out.println("Input number should be between 1 and 5");
                return;
            }
            System.out.println("\n");
            for (int i = 1; i <= number; i++) {
                Random rand = new Random();
                int randomMovie = rand.nextInt(movies.length);
                System.out.println("Iter " + i + ": " + movies[randomMovie]);
            }
            System.out.println("\n");
        }
    }
}
