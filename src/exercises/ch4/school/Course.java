package exercises.ch4.school;

import java.util.ArrayList;

public class Course {
    //At least three fields
    //Name
    private String name;
    //List of Students
    private ArrayList<Student> students;
    //Worth number of credits
    private int worthNumberOfCredits;

    // Constructors (Always put them below our class variables)
    public Course (String name, int worthNumberOfCredits) { //Create a constructor that takes in the course name and number of credits
        this.name = name;
        this.worthNumberOfCredits = worthNumberOfCredits;
    }













    @Override
    public String toString() {
        return this.name + " is worth " + this.worthNumberOfCredits + " number of credits.";
    }

    @Override
    public boolean equals(Object obj) {
        if ((obj instanceof Course) == false) return false;
        Course myCourseObj = (Course) obj;
        if(myCourseObj.name.equals(this.name)) { // Remember that this ".equals" has nothing to do wih the "equals" above under @Override. That ".equals" has to do on the "name"! (And "name" is a string) Therefore, we are asking "Is this string "name" equal to our class variable .name (this.name)? If it is return "true"!
            return true;
        } else {
            return false; // Down here we are saying "If it's not equal return "false"!
        }
    }
}
