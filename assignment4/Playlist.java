import java.util.Random;
import java.util.Scanner;

/*
 * 
 * @author Kenneth Mathenge
 * 
 * This program generates a random playlist of between 1 - 5 songs
 * to listen to.
 * 
 */
public class Playlist {
    public static void main(String... args) {
        String[] songs = {
                "As It Was - Harry Styles",
                "Bad Habit - Steve Lacy",
                "About Damn Time - Lizzo",
                "Running Up That Hill(A Deal With God) - Kate Bush",
                "Sunroof - Nicky Youre & dazy",
                "Hold Me Closer - Elton John & Britney Spears",
                "Super Freaky Girl - Nicki Minaj",
                "I Like You (A Happier Song - Post Malone Featuring Doja Cat",
        };

        System.out.print("\nEnter a random number between 1 - 5 and we'll surprise you with a good music playlist: ");
        try (Scanner input = new Scanner(System.in)) {
            int number = input.nextInt();
            if (number < 1 || number > 5) {
                System.out.println("Input number should be between 1 and 5");
                return;
            }
            int count = 0;
            System.out.println("\n");
            while (count < number) {
                Random rand = new Random();
                int randomSong = rand.nextInt(songs.length);
                System.out.println("Iter " + count + ": " + songs[randomSong]);
                count++;
            }
            System.out.println("\n");
        }
    }
}
