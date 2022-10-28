/*
 * @author Vazquez, Juliana
 * CMIS 242/7381
 * Date: 10/16/22
 * Description: Discussion 1
 * Notes, comments: program will create a class to mimic keurig. program will allow users to add keurig cup, 
 * brew a certain amount, and refill the machine. 
 * 
 */

public class Keurig {

	// attributes
	private int waterLevel; // how much water the Keurig can hold
	private int waterLeft; // how much water i
	private boolean isOn; // determines if the Keurig is on
	private boolean cupIn; // determine if a Keurig cup is in the Keurig

	// Edit made by @Jonathan Weaver
	boolean isOperational; // determines if a Keurig cup works

	// constructor
	public Keurig(int waterLevel) {
		this.waterLevel = waterLevel;
		this.isOperational = true; // Sets a new Keurig as operational
		waterLeft = waterLevel; // sets start of how much water is in Keurig
		isOn = false; // sets Keurig to off
		cupIn = false; // starts Keurig off with no cup
	}

	// method 1: Makes sure Keurig is on
	public void turnOn() {
		System.out.println("\nThe Keurig is on.");
		isOn = true; // sets Keurig to on
	}

	// method 2: add Keurig cup.
	public void addKeurigCup(String keurigCup) {
		System.out.println("\nYou put a " + keurigCup + " cup into the Keurig.");
		cupIn = true; // confirms a cup is in Keurig
	}

	// method 3: pick a brew size
	public void brewingSize(int brewSize) {
		if (!isOn) { // does not brew if Keurig is not on
			System.out.println("\nThe Keurig is not on...");
		} else if (!cupIn) { // does not brew if Keurig has no cup in it
			System.out.println("\nYou have not put a Keurig cup in yet...");
		} else if (brewSize > waterLeft) { // does not brew if Keurig does not hav enough water left in it
			System.out.println(
					"\nThe Keurig does not have enough water to make this brew. Please refill the water first.");
		} else { // brews drink
			System.out.println("\nBrew size has been set to " + brewSize + " oz.");
			System.out.println("Now brewing. Please wait....");
			System.out.println("Your drink is now ready!");
			waterLeft -= brewSize;
		}
	}

	/*
	 * A method to break a Keurig - change it operation status to false
	 * 
	 * @param None
	 * 
	 * @return None
	 */
	public void breakKeurig() {
		isOperational = false;
		System.out.println("\nYour Keurig is not operational");
	}

	/*
	 * A method to fix a Keurig - change it operation status to true
	 * 
	 * @param None
	 * 
	 * @return None
	 */
	public void fixKeurig() {
		if (isOperational) {
			System.out.println("Your Keurig is very operational.");
			return;
		}

		isOperational = true;
		System.out.println("\nYour Keurig is now fixed and operational\n");
	}

	// method 4: refill the Keurig
	public void refillKeurig(int refill) {
		if ((refill + waterLeft) > waterLevel) { // does not add if too much water is being added
			System.out.println("\nThat's too much water! Please pick a different amount.");
		} else { // refills the water in tank
			System.out.println("\n" + refill + " oz of water have been add to the Keurig.");
			waterLeft += refill;
		}
	}

}
