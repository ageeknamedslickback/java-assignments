/* Basketballs come in many shapes and sizes which differ for age and gender. 
This program will display which ball size is recommended to use based on those categories*/
// Michael Scott | CMIS 242 | 10/21/2022

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("What is your age?: ");
        int m_Age = scan.nextInt();
        System.out.print("What is your gender? (male/female): ");
        String m_Gender = scan.next();
        System.out.print("""
                Which location will you be playing?\s
                 1. Indoor Court:\s
                 2. Outdoor Court (Concrete):\s
                 3. Outdoor Court (Dirt):\s
                 Please Make a selection (1,2,or 3):\s""");
        int m_location = scan.nextInt();
        System.out.print("""
                What is your estimated height range?\s
                 1. Short (from 5 feet 10 inches (1.78 m) to 6 feet 4 inches (1.93 m)):\s
                 2. Medium (from 6 feet 4 inches (1.93 m) to 6 feet 9 inches (2.04 m)):\s
                 3. Tall (over 6 feet 8 inches (2.01 m)):\s
                 Please Make a selection (1, 2,or 3):\s""");
        int heightRange = scan.nextInt();
        Basketball b1 = new Basketball(m_Gender, m_Age, m_location);
        b1.setGender(m_Gender);
        b1.setAge(m_Age);
        b1.setLocation(m_location);
        b1.setMaterial(m_location);
        b1.setAgeGroup(m_Gender, m_Age);
        // set position
        b1.setPosition(heightRange);
        System.out.println(b1.toString());
        scan.close();
    }
}
