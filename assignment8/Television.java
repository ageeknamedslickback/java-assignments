public class Television {
	private int size;
	private String brand;

	public void displayInfo(Television tv) {
		System.out.println("Your TV is a " + size + " inch " + brand);
	} // end displayInfo method

	public void turnOn() {
		System.out.println("Turning on...");
	} // end turnOn method

	public void startMovie() {
		System.out.println("Starting movie...");
	} // end startMovie method

	public void stopMovie() {
		System.out.println("Stopping movie...");
	} // end stopMovie method

	public void turnOff() {
		System.out.println("Turning off...");
	} // end turnOff method

	/*
	 * @Kenneth Mathenge Reply
	 * 
	 * Move the main method in class Television
	 * Create an object of Television optionally excluding the constructor
	 * 
	 */
	public static void main(String[] args) {
		// create instance of Television
		Television myTV = new Television(); // creating an object of Television
		myTV.brand = "Samsung";
		myTV.size = 55;

		// display TV's info
		myTV.displayInfo(myTV);

		// turn TV on and start movie
		System.out.println();
		myTV.turnOn();
		myTV.startMovie();
		// stop movie and turn TV off
		System.out.println(); // blank line for formatting
		myTV.stopMovie();
		myTV.turnOff();

	} // end main method

} // end Television class
