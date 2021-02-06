package org.launchcode.java.demos.lsn7interfaces;

import java.util.Comparator;

public class ConeComparator implements Comparator<Cone> {

    @Override
    public int compare(Cone o1, Cone o2) {
        // Positive integer if o1 is greater than o2
        // Negative integer if 01 is less than o2
        // Zero if o1 and o2 are equal

        if (o1.getCost() > o2.getCost()) {
            return 1;
        } else if (o1.getCost() < o2.getCost()) {
            return -1;
        } else {
            return 0;
        }
    }
}
