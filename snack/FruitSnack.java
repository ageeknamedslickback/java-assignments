/*
 * @author Kenneth Mathenge
 */
public class FruitSnack extends Snack {
    private boolean citrus;

    /**
     * FruitSnack constructor
     * 
     * @param ID
     * @param price
     * @param size
     * @param citrus
     */
    public FruitSnack(String ID, double price, String size, boolean citrus) {
        super(ID, price, size);
        this.citrus = citrus;
    }

    /**
     * A method to return if a fruit snack is a citrus or not
     * 
     * @return boolean
     */
    public boolean isCitrus() {
        return citrus;
    }

    /**
     * A method to set a fruit snack as citrus or not
     * 
     * @param citrus
     */
    public void setCitrus(boolean citrus) {
        this.citrus = citrus;
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
        return "You have chosen snack type = Fruit Snack, of type = " + getSize() + ", id = " + getID()
                + " and price = " + getPrice();
    }
}
