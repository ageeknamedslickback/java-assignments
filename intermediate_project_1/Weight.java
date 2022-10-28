/*
 * @author Kenneth Mathenge
 */
public class Weight {
    private int pounds;
    private double ounces;
    private static final double OUNCES_IN_A_POUND = 16;

    /**
     * Weight class constructor
     */
    public Weight(int pounds, double ounces) {
        this.pounds = pounds;
        this.ounces = ounces;
        this.normalize();
        System.out.println(
                "Created weight with " + this.pounds + " pounds and " + String.format("%.2f", this.ounces) + " ounces");
    }

    /*
     * A method to return the total number of ounces
     * 
     * @params None
     * 
     * @return double total number of ounces
     */
    private double toOunces() {
        double totalOunces = (this.pounds * OUNCES_IN_A_POUND) + this.ounces;
        return totalOunces;
    }

    /*
     * A method to ensure that the number of ounces is less than the number of
     * ounces in a pound
     * 
     * @params None
     * 
     * @return None
     */
    private void normalize() {
        if (ounces >= OUNCES_IN_A_POUND) {
            this.pounds += (int) (this.ounces / OUNCES_IN_A_POUND);
            this.ounces = this.ounces % OUNCES_IN_A_POUND;
        }
    }

    /*
     * A method to determine if the object is greater or less than the initialized
     * values
     * 
     * @params weight Weight class object
     * 
     * @return boolean less than
     */
    public boolean lessThan(Weight weight) {
        if (this.toOunces() < weight.toOunces()) {
            return true;
        } else {
            return false;
        }
    }

    /*
     * A method to add the object’s weight values to the initialized values
     * 
     * @params weight Weight class object
     * 
     * @return None
     */
    public void addTo(Weight weight) {
        this.ounces += weight.toOunces();
        this.normalize();
    }

    /*
     * A method to divide the weight by a given divisor that is not zero
     * 
     * @params int divisor
     * 
     * @return None
     */
    public void divide(int divisor) {
        if (divisor != 0) {
            this.ounces = (this.toOunces() / divisor);
            this.pounds = 0;
            this.normalize();
        }
    }

    /*
     * A method to return a string of type "x pounds and y ounces" where ounces are
     * displayed in two decimal places
     * 
     * @params None
     * 
     * @return String
     */
    @Override
    public String toString() {
        return this.pounds + " pounds and " + String.format("%.2f", this.ounces) + " ounces";
    }
}