package org.launchcode.java.demos.lsn7interfaces;

import java.util.ArrayList;

public class Topping extends Ingredient {

    // Class Variable
    private int tastiness;



    public Topping(String aName, double aCost, ArrayList<String> someAllergens, int tastiness) {
        super(aName, aCost, someAllergens);
        this.tastiness = tastiness;
    }

    public int getTastiness() { return tastiness; }
    public void setTastiness(int tastiness) { this.tastiness = tastiness; }
}
