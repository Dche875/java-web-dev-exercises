package exercises.technology.main;

public class SmartPhone extends Computer {

    // Class Variables (properties)
    private boolean isConnectedTo5G;


    // Constructors
    public SmartPhone(int screenWidth, int screenHeight, String manufactureYear, boolean isConnectedTo5G) {
        super(screenWidth, screenHeight, manufactureYear);
        this.isConnectedTo5G = isConnectedTo5G;
    }


    // Methods
    public boolean getIsConnectedTo5G() { return this.isConnectedTo5G; }



    public void makePhoneCall(String number) {
        System.out.println("Calling " + number);
    }

}
