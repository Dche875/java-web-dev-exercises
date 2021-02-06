package exercises.technology.tests;

import exercises.technology.main.Computer;
import exercises.technology.main.Laptop;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class LaptopTest {
    Laptop myLaptop;

    @Before
    public void beforeTests() {
        myLaptop = new Laptop(3000,3000, "2021", true);
    }



    @Test
    public void constructorSetsValuesTest() {
        //Computer myComputer = new Computer(3000,3000, "2021");
        assertEquals(3000, this.myLaptop.getScreenWidth());
        assertEquals(3000, this.myLaptop.getScreenHeight());
        assertEquals("2021", this.myLaptop.getManufactureYear());
        assertEquals(true, this.myLaptop.getIsIntelliJOpened());
    }


    @Test
    public void openIntelliJSetsIsIntelliJOpenedToTrue() {
        this.myLaptop.setIsIntelliJOpened(false);
        assertEquals(false, this.myLaptop.getIsIntelliJOpened());
        this.myLaptop.openIntelliJ();
        assertEquals(true, this.myLaptop.getIsIntelliJOpened());
    }
}
