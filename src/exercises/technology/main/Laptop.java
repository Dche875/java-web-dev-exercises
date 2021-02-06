package exercises.technology.main;

public class Laptop extends Computer {

    // Class variables (properties)
    private boolean isIntelliJOpened;

    // Constructor
    public Laptop(int screenWidth, int screenHeight, String manufactureYear) {
        super(screenWidth, screenHeight, manufactureYear); // Always place super at the top of the constructors
        this.isIntelliJOpened = false;
    }

    public Laptop(int screenWidth, int screenHeight, String manufactureYear, boolean isIntelliJOpened) {
        super(screenWidth, screenHeight, manufactureYear); // Always pass in super no matter what constructor we're in and super is always at the top of the constructor
        this.isIntelliJOpened = isIntelliJOpened;
    }

    // Methods
    public boolean getIsIntelliJOpened() { return this.isIntelliJOpened; }
    public void setIsIntelliJOpened(boolean isIntelliJOpened) { this.isIntelliJOpened = isIntelliJOpened; }



     public void openIntelliJ() {
        this.isIntelliJOpened = true;
         System.out.println("IntelliJ is now opened!");
     }
}
