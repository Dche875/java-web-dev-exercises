package exercises.technology.main;

public class Computer extends AbstractEntity {

// 3 properties, 2 methods, and a constructor

    // Class variables (properties)
    private int screenWidth;
    private int screenHeight;
    private String manufactureYear;

    // Constructor
    public Computer(int screenWidth, int screenHeight, String manufactureYear) {
        this.screenWidth = screenWidth;
        this.screenHeight = screenHeight;
        this.manufactureYear = manufactureYear;
    }


    //Getters always go on top of the methods

    public int getScreenWidth() { return this.screenWidth; }
    public int getScreenHeight() { return this.screenHeight; }
    public String getManufactureYear() { return this.manufactureYear; }


    // Methods
    public int processingTwoPlusTwo() {
        return 2+2;
    }

    public void tellMeAJoke() {
        System.out.println("Why did the computer show up at work late? It had a hard drive!");
    }


}
