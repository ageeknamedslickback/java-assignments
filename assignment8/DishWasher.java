/*
 * @author Kenneth Mathenge
 * 
 * Brand new dish washer home appliance system
 */
public class DishWasher {
    // Dish washer wash cycles enum
    enum WashCycle {
        LIGHT,
        NORMAL,
        HEAVY
    }

    // Attributes
    String model;
    boolean status;

    /*
     * Turn on your dish washer
     * 
     * @param None
     * 
     * @return None
     * 
     */
    public void on() {
        if (status) {
            System.out.println("Your " + model + " Dish Washer is already turned on\n");
        } else {
            status = true;
            System.out.println("Turning on your " + model + " Dish Washer . . .\n");
        }
    }

    /*
     * Turn off your dish washer
     * 
     * @param None
     * 
     * @return None
     * 
     */
    public void off() {
        if (!status) {
            System.out.println("Your " + model + " Dish Washer is already turned off\n");
        } else {
            status = false;
            System.out.println("Turning off your " + model + " Dish Washer . . .\n");
        }
    }

    /*
     * Display your dish washer's home appliance information
     * 
     * @param None
     * 
     * @return None
     * 
     */
    public void information() {
        String applianceStatus;
        if (status) {
            applianceStatus = "On";
        } else {
            applianceStatus = "Off";
        }
        System.out.println(
                "Welcome to " + model + "'s system information\n\tBrand: " + model + "\n\tStatus: "
                        + applianceStatus);
        System.out.println("\tAvailable wash cycles:");
        for (WashCycle washCycle : WashCycle.values()) {
            System.out.println("\t\t- " + washCycle);
        }
    }

    public static void main(String... args) {
        DishWasher dishWasher = new DishWasher();
        dishWasher.model = "Bosch 300 Series";

        // Turn on the dish washer and get it's information
        dishWasher.on();
        dishWasher.information();

        System.out.println();

        // Turn off the dish washer and get it's information
        dishWasher.off();
        dishWasher.information();

        System.out.println();

        // Turn on a dish washer that was already turned on
        dishWasher.status = true;
        dishWasher.on();

        // Turn off a dish washer that was already turned on
        dishWasher.status = false;
        dishWasher.off();
    }
}
