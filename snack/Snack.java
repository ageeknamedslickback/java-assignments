/*
 * @author Kenneth Mathenge
 */
public class Snack {
    private String ID;
    private double price;
    private String size;

    /**
     * Snack constructor
     * 
     * @param ID
     * @param price
     * @param size
     */
    public Snack(String ID, double price, String size) {
        this.ID = ID;
        this.price = price;
        this.size = size;
    }

    /**
     * A method to return a snack object's ID (combination of numbers and letters)
     * 
     * @return
     */
    public String getID() {
        return ID;
    }

    /**
     * A method to return a snack object's size (S, M or L)
     * 
     * @return
     */
    public String getSize() {
        return size;
    }

    /**
     * A method to set a snack's size (S, M or L)
     * 
     * @param size
     */
    public void setSize(String size) {
        this.size = size;
    }

    /**
     * A method to return a snack object's price
     * 
     * @return
     */
    public double getPrice() {
        return price;
    }

    /**
     * A method to set a snack's price
     * 
     * @param price
     */
    public void setPrice(double price) {
        this.price = price;
    }
}
