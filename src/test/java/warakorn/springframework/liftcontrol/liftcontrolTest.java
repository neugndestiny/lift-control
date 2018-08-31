package warakorn.springframework.liftcontrol;

import org.junit.Test;

import static org.junit.Assert.*;

public class liftcontrolTest {

    liftcontrol liftcontrol = new liftcontrol(100,10);

    @Test
    public void overWeight() {
        String expectedResult = "stop";
        String actualResult = null;
        liftcontrol.setWeight(200);
        if (liftcontrol.getWeight() > liftcontrol.getMaxWeight()) {
            actualResult = "stop";
        } else {
            actualResult = "pass";
        }
        assertEquals(expectedResult, actualResult);
    }
}