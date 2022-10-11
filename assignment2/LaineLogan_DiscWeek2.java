
/**
* Developer - Logan Laine Class - CMIS 141/6382 Date 24AUG2022	Instructor - Professor Rowson
* Program created to calculate the average temperature, in Fahrenheit, of two cities and 
* convert it into Celsius. 
*
*
* Response made by Kenneth Mathenge.
* The program now calculates the average temperature of three cities of the user's choice.
* It accepts a third city's temparature input, and calculates the average of the 3 cities.
*/

import java.util.Scanner; //Import scan ability 

public class LaineLogan_DiscWeek2 { // Start Class

    public static void main(String[] args) { // Start Main
        Scanner scan = new Scanner(System.in); // scan variable created for scan function

        System.out.println("Enter the temperature of three cities, separated by a space, in Fahrenheit: ");
        double fahrenheitCity1 = scan.nextInt();
        double fahrenheitCity2 = scan.nextInt();
        double fahrenheitCity3 = scan.nextInt();

        double celsius = (((fahrenheitCity1 + fahrenheitCity2 + fahrenheitCity3) / 3) - 32) * 5 / 9;

        System.out.println("Response from Kenneth Mathenge");
        System.out.println(
                "The program now calculates the average temperature of three cities of your choice. It accepts a third city's temparature input, and calculates the average of the 3 cities.");
        System.out.println("The average temperature in Celsius is: " + celsius);

        scan.close();
    }
}
