/*
 * @author Jonathan Weaver
 * 
 * Driver program to instantiate the organization class,
 * create an instance of a department with the number of employees
 * and perform some actions on the object
 */
public class Department {
    public static void main(String... args) {
        Organization organizationDept = new Organization("Finance", 10);
        System.out.println(organizationDept.toString());

        organizationDept.addEmployees(10);
        System.out.println(organizationDept.toString());
    }
}
