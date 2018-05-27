import org.junit.Test;
import org.junit.*;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotEquals;

public class MainTest {

    @Test
    public void simpleAdditionShouldWork() {
        int a = 3;
        int b = 4;
        assertEquals("Results for 3+4", 7, Main.simpleAddition(a,b));
        assertNotEquals("Expected Failure 3+8 != 7",7, Main.simpleAddition(a,8));

    }

    @Test
    public void simpleSubtraction() {
        int a = 3;
        int b = 4;
        assertEquals("Results for 3-4 = -1", -1, Main.simpleSubtraction(a,b));
        assertNotEquals("Expected Failure 3-8 != -1",-1, Main.simpleSubtraction(a,8));
    }

    @Test
    public void simpleMultiplication() {
        int a = 3;
        int b = 4;
        assertEquals("Results for 3*4 = 12", 12, Main.simpleMultiplication(a,b));
        assertNotEquals("Expected Failure 3*8 != 12",12, Main.simpleMultiplication(a,8));
    }
}