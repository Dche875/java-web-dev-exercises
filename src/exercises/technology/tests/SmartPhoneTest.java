package exercises.technology.tests;

import exercises.technology.main.Laptop;
import exercises.technology.main.SmartPhone;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SmartPhoneTest {
    SmartPhone mySmartPhone;

    @Before
    public void beforeTests() {
        mySmartPhone = new SmartPhone(3000,3000, "2021", true);
    }



    @Test
    public void constructorSetsValuesTest() {
        //Computer myComputer = new Computer(3000,3000, "2021");
        assertEquals(3000, this.mySmartPhone.getScreenWidth());
        assertEquals(3000, this.mySmartPhone.getScreenHeight());
        assertEquals("2021", this.mySmartPhone.getManufactureYear());
        assertEquals(true, this.mySmartPhone.getIsConnectedTo5G());
    }

}
