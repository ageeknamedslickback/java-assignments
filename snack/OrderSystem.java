import java.util.Random;
import java.util.Scanner;

/*
 * @author Kenneth Mathenge
 */
public class OrderSystem {

    final static double SMALL_SNACK_FLAT_FEE = 19.99;
    final static double MEDIUM_SNACK_FLAT_FEE = 29.99;
    final static double LARGE_SNACK_FLAT_FEE = 39.99;

    final static double SALTY_SNACK_ADDITIONAL_FEE = 4.50;
    final static double FRUIT_SNACK_ADDITIONAL_FEE = 5.99;

    static Snack snack;

    /**
     * A method to calculate the base prices of a snack given it's size
     * 
     * @param size
     * @return price
     */
    private static double calculatePrice(String size) {
        double price = 0;
        if (size.equalsIgnoreCase("S")) {
            price += SMALL_SNACK_FLAT_FEE;
        }
        if (size.equalsIgnoreCase("M")) {
            price += MEDIUM_SNACK_FLAT_FEE;
        }
        if (size.equalsIgnoreCase("L")) {
            price += LARGE_SNACK_FLAT_FEE;
        }

        return price;
    }

    /**
     * A method to order a snack
     * 
     * @param in
     */
    private static void orderASnack(Scanner in) {
        System.out.print("Do you want Fruit Snack (1) or Salty Snack (2): ");
        int snackType = in.nextInt();

        System.out.print("What size do you want: S, M, or L: ");
        String size = in.next();

        // Generate random order number
        Random random = new Random();
        int orderNumber = random.nextInt(100);

        boolean include;
        switch (snackType) {
            case 1:
                System.out.print("Do you want citrus fruit included? true/false: ");
                include = in.nextBoolean();
                double fruitSnackPrice = calculatePrice(size);
                if (include) {
                    fruitSnackPrice += FRUIT_SNACK_ADDITIONAL_FEE;
                }
                snack = new FruitSnack("FRUIT-SNK-" + orderNumber, fruitSnackPrice, size, include);
                System.out.println(snack.toString() + "\n");
                break;

            case 2:
                System.out.print("Do you want nut snack included? true/false: ");
                include = in.nextBoolean();
                double saltySnackPrice = calculatePrice(size);
                if (include) {
                    saltySnackPrice += SALTY_SNACK_ADDITIONAL_FEE;
                }
                snack = new SaltySnack("SALTY-SNK-" + orderNumber, saltySnackPrice, size, include);
                System.out.println(snack.toString() + "\n");
                break;

            default:
                System.out.println("invalid snack type");
                break;
        }
    }

    /**
     * @param args
     */
    public static void main(String[] args) {
        try (Scanner in = new Scanner(System.in)) {
            while (true) {
                System.out.println("MENU\n1: Order a Snack\n2: Exit program");
                System.out.print("Enter your selection: ");
                int menuItem = in.nextInt();
                switch (menuItem) {
                    case 1:
                        orderASnack(in);
                        break;

                    case 2:
                        System.out.println("Thank you for using the program. Goodbye!");
                        System.exit(0);
                        break;

                    default:
                        System.out.println("Invalid input");
                        break;
                }
            }
        }

    }
}
