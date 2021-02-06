package exercises.technology.tests;

import exercises.technology.main.Computer;
import org.junit.Before;
import org.junit.Test;

// import static org.junit.Assert.*; The star means import all junit Asserts
import static org.junit.Assert.assertEquals;

public class ComputerTest {

    Computer myComputer;

    @Before
    public void beforeTests() {
        myComputer = new Computer(3000,3000, "2021");
    }



    @Test
    public void constructorSetsValuesTest() {
        //Computer myComputer = new Computer(3000,3000, "2021");
        assertEquals(3000, this.myComputer.getScreenWidth());
        assertEquals(3000, this.myComputer.getScreenHeight());
        assertEquals("2021", this.myComputer.getManufactureYear());
    }

    @Test
    public void twoPlusTwoReturnsFour() {
        //Computer myComputer = new Computer(3000,3000, "2021");
        int result = this.myComputer.processingTwoPlusTwo();
        assertEquals(4, result);
    }
}
