/*
 * @author Vazquez, Juliana
 * CMIS 242/7381
 * Date: 10/16/22
 * Description: Discussion 1
 * Notes, comments: tests the capabilities of the Keurig class.
 * 
 */

public class VazquezJuliana_Disc1 {

	public static void main(String[] args) {

		// header
		System.out.println("Vazquez, Juliana\tCMIS 242/7381\t10/16/22\n");

		// initialize Keurig variable
		Keurig keu = new Keurig(10);

		// try to start a brew without turning keurig on
		keu.brewingSize(10);

		// turn on keurig
		keu.turnOn();

		// try to start brew without putting keurig cup in
		keu.brewingSize(10);

		// put keurig cup in
		keu.addKeurigCup("Caramel Coffee");

		// start a brew of 10oz
		keu.brewingSize(10);

		// try to start brew without enough water
		keu.brewingSize(8);

		// try to add more water than keurig can hold
		keu.refillKeurig(12);

		// add more water to keurig
		keu.refillKeurig(10);

		System.out.println("\nEdits made by Jonathan Weaver\n");

		// break Keurig
		keu.breakKeurig();

		// fix Keurig
		keu.fixKeurig();
	}

}
