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

    @Test
    public void moveFromGToTop() {
        String expectedResult = "up";
        String actualResult = liftcontrol.moveDirection("G","TOP");
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void moveFromGToGPlusOne() {
        String expectedResult = "up";
        String actualResult = liftcontrol.moveDirection("G","G+1");
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void moveFromGToTopMinusOne() {
        String expectedResult = "up";
        String actualResult = liftcontrol.moveDirection("G","TOP-1");
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void moveFromGPlusOneToTop() {
        String expectedResult = "up";
        String actualResult = liftcontrol.moveDirection("G+1","TOP");
        assertEquals(expectedResult, actualResult);
    }

    @Test
    public void moveFromGPlusOneToTopMinusOne() {
        String expectedResult = "up";
        String actualResult = liftcontrol.moveDirection("G+1","TOP-1");
        assertEquals(expectedResult, actualResult);
    }
}