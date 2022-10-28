/*
 * @author Kenneth Mathenge
 * 
 * Driver program to instantiate the organization class,
 * create an instance of a department with the number of employees
 * and perform some actions on the object
 */
public class Department {
    public static void main(String... args) {
        System.out.println("");
        Organization organizationDept = new Organization("Finance", 10);
        System.out.println(organizationDept.toString());

        organizationDept.addEmployees(10);
        System.out.println(organizationDept.toString());

        // Demonstrate encapsulation
        System.out.println("");
        organizationDept.setDepartment("Engineering");
        System.out.println("You have set a new department called " + organizationDept.getDepartment());

        organizationDept.setNumberOfEmployees(12);
        System.out.println("You have set a new department called " + organizationDept.getDepartment() + " that has "
                + organizationDept.getNumberOfEmployees() + " employees.");

        System.out.println("");
        System.out.println(organizationDept.toString());
        System.out.println("");
    }
}
