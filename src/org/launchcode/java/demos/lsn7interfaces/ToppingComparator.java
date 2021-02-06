package org.launchcode.java.demos.lsn7interfaces;

import java.util.Comparator;

public class ToppingComparator implements Comparator<Topping> {

    @Override
    public int compare(Topping o1, Topping o2) {
        return o1.getTastiness() - o2.getTastiness();
        // or if you want to sort through highest to lowest you would swap o2.getTastiness() - o1.getTastiness
    }
}
