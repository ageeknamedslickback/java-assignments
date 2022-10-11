import java.text.DecimalFormat;
import java.util.Scanner;

/*
 * @author Kenneth Mathenge
 * @date 18/08/2022
 * 
 * This program calculates the total amount a customer pays for an order.
 * It accepts the following inputs:
 *      1. The customer ID
 *      2. The unit price of the product
 *      3. The number of products (quantity)
 *      4. The product description
 *      5. A discount value
 * 
 * From the unit price and the quantity supplied, we calculate the total order
 * amount before discount. Using the unit price, quantity and discount supplied,
 * we calculate the total order amount after discount.
 * 
 * The program outputs the customer added information and the calculated totals.
 */

/*
 * Order class holds the states (fields) pertaining a customer's product order.
 */
public class Order {

    /**
     * This is the main method which calculates the order totals.
     * 
     * @param args Unused
     * @return Nothing
     */
    public static void main(String... args) {
        // ID of the customer placing an order
        int customerID = 0;

        // The unit price of the item being ordered
        double unitPrice = .0;

        // The number of products a customer wants to order
        int quantity = 0;

        // A good description of the product for more clarification
        String productDescription;

        // Discount that is applicable to the order
        double discount = .0;

        // Wrap scanner in a try block to accept inputs
        try (Scanner input = new Scanner(System.in)) {
            // Accept customer ID input
            System.out.println("Enter customer id: ");
            customerID = input.nextInt();

            // Accept decimal unit price
            System.out.println("Enter unit price in decimal format (e.g. 3.5): ");
            unitPrice = input.nextDouble();

            // Accept a quantity
            System.out.println("Enter quantity: ");
            quantity = input.nextInt();

            // Accept the product description
            System.out.println("Enter product description:");
            input.skip("\\R?");
            productDescription = input.nextLine();

            // Accept decimal discount
            System.out.println("Enter discount in decimal format (e.g. .05): ");
            discount = input.nextDouble();
        }

        // Calculate the order total before discount
        double orderBeforeDiscount = 0;
        orderBeforeDiscount = unitPrice * quantity;

        // Calculate the order total after discount
        double orderAfterDiscount = 0;
        orderAfterDiscount = (unitPrice * quantity * 1) - (unitPrice * quantity * discount);

        // Aggregate and display the system output
        System.out.println("\nORDER DATA");
        System.out.println("Customer id: " + customerID);
        System.out.println("Unit price: " + unitPrice);
        System.out.println("Quantity: " + quantity);
        System.out.println("Product Description: " + productDescription);
        System.out.println("Discount: " + discount);

        // Format decimal to 2 decimal places and print out the computed total values
        DecimalFormat decimalFormat = new DecimalFormat("#.##");
        System.out
                .println("\nOrder total BEFORE discount: " + Double.valueOf(decimalFormat.format(orderBeforeDiscount)));
        System.out.println("Order total AFTER discount: " + Double.valueOf(decimalFormat.format(orderAfterDiscount)));
    }
}
