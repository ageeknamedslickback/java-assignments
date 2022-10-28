/*
 * @author Kenneth Mathenge
 */
public class SaltySnack extends Snack {

    private boolean nutSnack;

    /**
     * SaltySnack constructor
     * 
     * @param ID
     * @param price
     * @param size
     * @param nutSnack
     */
    public SaltySnack(String ID, double price, String size, boolean nutSnack) {
        super(ID, price, size);
        this.nutSnack = nutSnack;
    }

    /**
     * A method to set a salty snack as a nut snack
     * 
     * @param nutSnack
     */
    public void setNutSnack(boolean nutSnack) {
        this.nutSnack = nutSnack;
    }

    /**
     * A method to return if a salty snack is a nut snack or not
     * 
     * @return
     */
    public boolean isNutSnack() {
        return nutSnack;
    }

    /*
     * (non-Javadoc)
     * 
     * @see Snack#getPrice()
     */
    @Override
    public double getPrice() {
        return super.getPrice();
    }

    @Override
    public String toString() {
        return "You have chosen snack type = Salty Snack, of type = " + getSize() + ", id = " + getID()
                + " and price = " + getPrice();
    }
}
