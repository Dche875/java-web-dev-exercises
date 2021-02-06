package exercises.ch4.school;

public class Student {

    public static void main(String[] args) {

        Student myself = new Student("Diana", 1, 30, 4.0);
        Student twin = new Student ("Diana", 2, 20,2.0);
        Teacher theTeacher = new Teacher();

        //String myGradeLevel = myself.getGradeLevel();
        //System.out.println(myGradeLevel);

        //myself.addGrade(3,3.0);
        //System.out.println(myself.gpa);
        //myself.addGrade(3,3.0);
        //System.out.println(myself.gpa);

        //System.out.println(myself.toString());
        //System.out.println(myself.equals(theTeacher));


        Course myFirstCourse = new Course("My First Course", 2);
        Course mySecondCourse = new Course("My First Course", 3);

        //System.out.println(myFirstCourse.equals(mySecondCourse));
        System.out.println(myFirstCourse.toString());

    }

    private static int nextStudentId = 1;
    private String name;
    private int studentId;
    private int numberOfCredits;
    private double gpa;

    public Student(String name, int studentId, int numberOfCredits, double gpa) {
        this.name = name;
        this.studentId = studentId;
        this.numberOfCredits = numberOfCredits;
        this.gpa = gpa;
    }

    public Student(String name, int studentId) {
        this(name, studentId, 0, 0);
    }

    public Student(String name) {
        this(name, nextStudentId);
        nextStudentId++;
    }

    public String studentInfo() { return (this.name + " has a GPA of: " + this.gpa); }


    public void addGrade(int courseCredits, double grade) {
        // Update the appropriate fields: numberOfCredits, gpa

        // CURRENT total quality score = gpa * numberOfCredits
        double currentTotalQualityScore = this.gpa * this.numberOfCredits;

        // quality score = letter grade (0.0-4.0) * number of credits
        double newQualityScore = grade * courseCredits;

        // Update CURRENT total quality score with the new quality score as just calculated
        double newTotalQualityScore = currentTotalQualityScore + newQualityScore;

        // Update students total number of credits
        int newTotalNumberOfCredits = this.numberOfCredits + courseCredits;
        this.numberOfCredits = newTotalNumberOfCredits;

        //gpa = (total quality score) / (total number of credits)
        double newGpa = newTotalQualityScore / newTotalNumberOfCredits;
        this.gpa = newGpa;
    }


    public String getGradeLevel() {
        // Determine the grade level of the student based on numberOfCredits
        //Freshman (0-29 credits), Sophomore (30-59 credits), Junior (60-89 credits), or Senior (90+ credits)

        //Return student's level depending on number of credits a student has
        if (this.numberOfCredits >= 0 && this.numberOfCredits <=29) {
            return "Freshmen";
        } else if (this.numberOfCredits >= 30 && this.numberOfCredits <=59) {
            return "Sophmore";
        } else if (this.numberOfCredits >= 60 && this.numberOfCredits <=89) {
            return "Junior";
        } else if (this.numberOfCredits >= 90) {
            return "Senior";
        } else {
            return null;
        }
    }

    @Override
    public String toString() {
        return this.name + ": " + this.gpa;
    }

    @Override
    public boolean equals(Object obj) {
        if ((obj instanceof Student) == false) return false;
        Student myStudentObj = (Student) obj;
        if(myStudentObj.name.equals(this.name)) { // Remember that this ".equals" has nothing to do wih the "equals" above under @Override. That ".equals" has to do on the "name"! (And "name" is a string) Therefore, we are asking "Is this string "name" equal to our class variable .name (this.name)? If it is return "true"!
            return true;
        } else {
            return false; // Down here we are saying "If it's not equal return "false"!
        }
    }

    /* getters and setters */

    public String getName() { return this.name; }
    public void setName(String name) { this.name = name; }

    public int getStudentId() { return this.studentId; }
    private void setStudentId(int studentId) { this.studentId = studentId; }

    public int getNumberOfCredits() { return this.numberOfCredits; }
    public void setNumberOfCredits(int numberOfCredits) { this.numberOfCredits = numberOfCredits; }

    public double getGpa() { return this.gpa; }
    public void setGpa(double gpa) { this.gpa = gpa; }
}
