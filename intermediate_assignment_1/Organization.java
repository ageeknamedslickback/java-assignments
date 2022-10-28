/*
 * @author Jonathan Weaver
 * 
 * Java program that models a class that represents a real life
 * organization entity with departments and number of employees.
 */
public class Organization {
    String department;
    int numberOfEmployees;

    // Organization class constructor
    public Organization(String department, int numberOfEmployees) {
        this.department = department;
        this.numberOfEmployees = numberOfEmployees;
    }

    /*
     * A method to return a department's name in the organization
     * 
     * @param None
     * 
     * @return String department
     */
    public String getDepartment() {
        return department;
    }

    /*
     * A method to return the number of employees in a department
     * 
     * @param None
     * 
     * @return int numberOfEmployees
     */
    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    /*
     * A method to add the number of employees in a department
     * 
     * @param int numberOfEmployeesAdded
     * 
     * @return int currentNumberOfEmployees
     */
    public int addEmployees(int numberOfEmployeesAdded) {
        int currentNumberOfEmployees = this.getNumberOfEmployees() + numberOfEmployeesAdded;
        this.numberOfEmployees = currentNumberOfEmployees;
        return currentNumberOfEmployees;
    }

    /*
     * A method to read the organization's information
     * 
     * @param None
     * 
     * @return String string representation of an organization's department
     */
    public String toString() {
        return "The department of " + this.getDepartment() + " has " + this.getNumberOfEmployees()
                + " employees in the organization.";
    }
}
