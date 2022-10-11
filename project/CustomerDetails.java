import java.util.Arrays;
import java.util.Scanner;

/*
 * @author Kenneth Mathenge
 * 
 * @date Oct 2, 2022
 * 
 * This program tracks customers and order data. The program helps a company to
 * determine the purchasing behavior of its customers. All order
 * data is based on the total sales amounts (revenue) for each customer.
 * 
 * The program should output the menu with corresponding methods to solve the logic:
 *  1. Add multiple new customers
 *  2. Add single new customer
 *  3. Display all customers
 *  4. Retrieve specific customer's data
 *  5. Retrieve customers with total sales based on the range
 *  9. Exit
 */

public class CustomerDetails {

    // Allowable number of new customers the system can hold
    static int numberOfNewCustomers = 100;

    // Arrays to hold the various customer information
    static String[] customerNames = new String[numberOfNewCustomers];
    static int[] customerIDs = new int[numberOfNewCustomers];
    static float[] totalSales = new float[numberOfNewCustomers];

    /*
     * A method that displays the program's menu
     * 
     * @param None
     * 
     * @return None
     */
    public void menu() {
        System.out.println(
                "\n\tMENU\n" +
                        "1: Add multiple new customers\n" +
                        "2: Add single new customer\n" +
                        "3: Display all customers\n" +
                        "4: Retrieve specific customer's data\n" +
                        "5: Retrieve customers with orders based on range\n" +
                        "9: Exit program");
    }

    /*
     * A method that adds a customer or more than one customers
     * 
     * @param numberOfCustomers, the number of customers to be created
     * 
     * @param input, Scanner input passed from the main method
     * 
     * @return None
     * 
     */
    public void addNewCustomers(int numberOfCustomers, Scanner input) {
        for (int i = 0; i < numberOfCustomers; i++) {
            if (i > 0) {
                System.out.println("\nEnter the details of another customer");
            }

            System.out.print("What is the name of the customer: ");
            String customerName = input.next();

            System.out.print("What is the ID of the customer: ");
            int customerID = input.nextInt();
            // Customer ID should have 5 digits
            if (String.valueOf(customerID).length() != 5) {
                System.out.println("\nCustomer ID should be a 5 digit number. Try creating them again\n");
                return;
            }

            System.out.print("What is the customer's total sales: ");
            float customerTotalSales = input.nextFloat();

            // Insert elements to the array
            customerNames = Arrays.copyOf(customerNames, customerNames.length + 1);
            customerNames[customerNames.length - 1] = customerName;

            customerIDs = Arrays.copyOf(customerIDs, customerIDs.length + 1);
            customerIDs[customerIDs.length - 1] = customerID;

            totalSales = Arrays.copyOf(totalSales, totalSales.length + 1);
            totalSales[totalSales.length - 1] = customerTotalSales;
        }
    }

    /*
     * A method that gets all the customers added in the program for the current
     * session
     * 
     * @param None
     * 
     * @return None
     */
    public void getAllCustomers() {
        System.out.println("\nList of customers in your system");
        for (int i = 0; i < customerNames.length; i++) {
            if (customerNames[i] != null) {
                System.out.println(
                        "\nCustomer ID:\t" + customerIDs[i] + "\nCustomer Name:\t" + customerNames[i]
                                + "\nTotal Sales:\t"
                                + totalSales[i]);
            }
        }
    }

    /*
     * A method that gets all the customers added in the program for the current
     * session using their customer ID
     * 
     * @param customerID, the ID of the customer we want to fetch
     * 
     * @return None
     */
    public void getCustomerByID(int customerID) {
        System.out.println("\nFound customer with ID " + customerID);
        for (int i = 0; i < customerIDs.length; i++) {
            if (customerID == customerIDs[i]) {
                System.out.println(
                        "\nCustomer ID:\t" + customerIDs[i] + "\nCustomer Name:\t" + customerNames[i]
                                + "\nTotal Sales:\t"
                                + totalSales[i]);
                return;
            }
        }
        System.out.println("Customer with ID " + customerID + " does not exist\n");
    }

    /*
     * A method that gets all the customers added in the program for the current
     * session whose total sales fall within an inputted lower and higher price
     * bound
     * 
     * @param input, Scanner input passed form the main method to prompt and collect
     * the lower and upper price bound
     * 
     * @return None
     */
    public void getCustomersWithTotalSalesInRange(Scanner input) {
        System.out.print("Enter your sales lower bound range: ");
        int lowerRange = input.nextInt();
        System.out.print("Enter your sales higher bound range: ");
        int higherRange = input.nextInt();

        System.out.println(
                "\nList of customers in your system with total sales between " + lowerRange + " and " + higherRange);
        for (int i = 0; i < totalSales.length; i++) {
            if (totalSales[i] >= lowerRange && totalSales[i] <= higherRange) {
                System.out.println(
                        "\nCustomer ID:\t" + customerIDs[i] + "\nCustomer Name:\t" + customerNames[i]
                                + "\nTotal Sales:\t"
                                + totalSales[i]);
            }
        }
    }

    /*
     * A method to exit the program
     * 
     * @param None
     * 
     * @return boolean
     */
    public boolean exitProgram() {
        System.out.println("\nExiting the program . . .\n");
        return true;
    }

    public static void main(String... args) {
        CustomerDetails customerDetails = new CustomerDetails();
        boolean exit = false;
        int numberOfCustomers = 0;
        try (Scanner input = new Scanner(System.in)) {
            while (!exit) {
                // Display the program's menu
                customerDetails.menu();
                System.out.println("");

                // Enter selection and do the corresponding action
                System.out.print("Enter your selection : ");
                int selection = input.nextInt();
                switch (selection) {
                    case 1:
                        // Add a specified number of customers
                        System.out.print("How many customers do you want to be loaded: ");
                        numberOfCustomers = input.nextInt();
                        customerDetails.addNewCustomers(numberOfCustomers, input);
                        break;

                    case 2:
                        // Add a single customer
                        numberOfCustomers = 1;
                        customerDetails.addNewCustomers(numberOfCustomers, input);
                        break;

                    case 3:
                        // Get all the customers in the current session
                        customerDetails.getAllCustomers();
                        break;

                    case 4:
                        // Get a customer by their customer ID
                        System.out.print("Enter your customer's ID: ");
                        int customerID = input.nextInt();
                        customerDetails.getCustomerByID(customerID);
                        break;

                    case 5:
                        // Get customers whose total sales fall within a specified range
                        customerDetails.getCustomersWithTotalSalesInRange(input);
                        break;

                    case 9:
                        // Gracefully exit program
                        exit = customerDetails.exitProgram();
                        break;

                    default:
                        // Wrong menu option
                        System.out.println("\nWrong menu input, try again\n");
                        break;
                }
            }
        }
    }
}