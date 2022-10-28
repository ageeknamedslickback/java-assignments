/*
 * @author Kenneth Mathenge
 * 
 * Java program that models a class that represents a real life
 * organization entity with departments and number of employees.
 * 
 * This discussion implements data encapsulation with getter and setter
 * methods to provide access.
 */
public class Organization {
    private String department;
    private int numberOfEmployees;

    // Organization class constructor
    public Organization(String department, int numberOfEmployees) {
        if (numberOfEmployees > 0) {
            this.department = department;
            this.numberOfEmployees = numberOfEmployees;
        }
    }

    /*
     * A method to return a department's name in the organization.
     * Provides read-only access.
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
     * Provides read-only access.
     * 
     * @param None
     * 
     * @return int numberOfEmployees
     */
    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }

    /*
     * A method to set a department in an organization
     * Provides write-only access.
     * 
     * @return None
     * 
     * @params String department
     */
    public void setDepartment(String department) {
        this.department = department;
    }

    /*
     * A method to set the number of employees in a department
     * Provides write-only access.
     * 
     * @return None
     * 
     * @params int numberOfEmployees
     */
    public void setNumberOfEmployees(int numberOfEmployees) {
        if (numberOfEmployees > 0) {
            this.numberOfEmployees = numberOfEmployees;
        }
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
