
import calculator.Calculator;
import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {
    private static final double DELTA = 1e-15;
    Calculator calculator = new Calculator();

    @Test
    public void sqrootTruePositive(){
        assertEquals("Finding square root for True Positive", 2, calculator.sqroot(4), DELTA);
        assertEquals("Finding square root for True Positive", 1, calculator.sqroot(1), DELTA);
    }

    @Test
    public void sqrootFalsePositive(){
        assertNotEquals("Finding square root for False Positive", 1, calculator.sqroot(3), DELTA);
        assertNotEquals("Finding square root for False Positive", 0, calculator.sqroot(4), DELTA);

    }

    @Test
    public void factorialTruePositive(){
        assertEquals("Finding factorial of a number for True Positive", 120, calculator.factoral(5), DELTA);
        assertEquals("Finding factorial of a number for True Positive", 24, calculator.factoral(4), DELTA);
    }

    @Test
    public void factorialFalsePositive(){
        assertNotEquals("Finding factorial of a number for False Positive", 120, calculator.factoral(6), DELTA);
        assertNotEquals("Finding factorial of a number for False Positive", 24, calculator.factoral(3), DELTA);
    }
}
