public class Basketball {
    // attributes
    private int age;
    private String ageGroup;
    private String gender;
    private int location;
    private String material;
    private String location2;

    /*
     * @author Jonathan Weaver reply.
     * 
     * Introduce a height range(short, medium, tall) to determine the player's
     * best suited position
     */
    private String position;

    public Basketball(String gender, int age, int location) {
        // age error validation, must be five or older to use
        if (age < 5) {
            System.out.println("You must be at least five or older to use this program.");
            System.exit(1);
        }
        // set values
        this.ageGroup = ageGroup;
        this.gender = gender;
        this.age = age;
        this.location = location;

    } // end Basketball

    // Accessors
    public String getGender() {
        return gender;
    }// end getGender

    public int getAge() {
        return age;
    } // end getAge

    public String getAgeGroup() {
        return ageGroup;
    } // end getAgeGroup

    public int getLocation() {
        return location;
    }

    public String getMaterial() {
        return material;
    }

    /*
     * A method to return the position a player fits in
     * Provides read-only access.
     * 
     * @author Jonathan Weaver
     * 
     * @param None
     * 
     * @return String position
     */
    public String getPosition() {
        return position;
    }

    // Mutators
    public void setGender(String gender) {
        this.gender = gender;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setAgeGroup(String gender, int age) {
        // takes the age and gender and selects the correct size
        if (age >= 5 && age <= 8) {
            this.ageGroup = "Size 4 (25.5\") - Youth";
        } else if (age >= 9 && age <= 11) {
            this.ageGroup = "Size 5 (27.5\") - Youth";
        } else if (age >= 12 && age <= 14 && gender.equals("male") || age >= 12 && gender.equals("female")) {
            this.ageGroup = "Size 6 (28.5\") - Women's";
        } else if (age >= 15 && gender.equals("male")) {
            this.ageGroup = "Size 7 (29.5\") - Men";
        }
    }

    public void setLocation(int location) {
        this.location = location;
    }

    public void setMaterial(int location) {
        if (location == 1) {
            this.location2 = "Indoor Court";
            this.material = "Leather";
        } else if (location == 2) {
            this.location2 = "Outdoor Concrete Court";
            this.material = "Composite Leather";
        } else if (location == 3) {
            this.location2 = "Outdoor Dirt Court";
            this.material = "Rubber";
        } else {
            System.out.print("Invalid Selection");
        }
    }

    /*
     * A method to set the position a player fits in
     * Provides write-only access.
     * 
     * @author Jonathan Weaver
     * 
     * @param heightRange
     * 
     * @return None
     */
    public void setPosition(int heightRange) {
        switch (heightRange) {
            case 1:
                this.position = "Point Guard";
                break;

            case 2:
                this.position = "Shooting Guard, Small Forward";

            case 3:
                this.position = "Power Forward, Center";

            default:
                break;
        }
    }

    public String toString() {
        String out = "---------:Details:--------- \n" +
                "Gender: " + gender + " \n" +
                "Age: " + age + " \n" +
                "Location: " + location2 + "\n" +
                "Position(s): " + getPosition() + "\n" +
                "Based on the details listed above, the recommended ball for you is: \n" +
                "A " + ageGroup + " " + material + " ball. ";
        return out;
    } // end toString
}