
import calculator.Calculator;
import static org.junit.Assert.*;

import org.junit.Test;

public class CalculatorTest {
    private static final double DELTA = 1e-15;
    Calculator calculator = new Calculator();

    @Test
    public void sqrootTruePositive(){
        assertEquals("Finding square root for True Positive", 4, calculator.sqroot1(16), DELTA);
        assertEquals("Finding square root for True Positive", 3, calculator.sqroot1(9), DELTA);
    }

    @Test
    public void sqrootFalsePositive(){
        assertNotEquals("Finding square root for False Positive", 2, calculator.sqroot1(3), DELTA);
        assertNotEquals("Finding square root for False Positive", 0, calculator.sqroot1(6), DELTA);

    }

    @Test
    public void factorialTruePositive(){
        assertEquals("Finding factorial of a number for True Positive", 6, calculator.factoral1(3), DELTA);
        assertEquals("Finding factorial of a number for True Positive", 24, calculator.factoral1(4), DELTA);
    }

    @Test
    public void factorialFalsePositive(){
        assertNotEquals("Finding factorial of a number for False Positive", 120, calculator.factoral1(7), DELTA);
        assertNotEquals("Finding factorial of a number for False Positive", 24, calculator.factoral1(3), DELTA);
    }

    @Test
    public void powerTruePositive(){
        assertEquals("Finding power for True Positive", 16, calculator.power1(2, 4), DELTA);
        assertEquals("Finding power for True Positive", 9, calculator.power1(3, 2), DELTA);
    }

    @Test
    public void powerFalsePositive(){
        assertNotEquals("Finding power for False Positive", 12, calculator.power1(5, 2), DELTA);
        assertNotEquals("Finding power for False Positive", -25, calculator.power1(8, 6), DELTA);
    }

    @Test
    public void logTruePositive(){
        assertEquals("Finding natural log for True Positive", 0, calculator.naturalLog1(1), DELTA);
        assertEquals("Finding natural log for True Positive", 0, calculator.naturalLog1(1), DELTA);
    }

    @Test
    public void logFalsePositive(){
        assertNotEquals("Finding natural log for False Positive", 6, calculator.naturalLog1(2.4), DELTA);
        assertNotEquals("Finding natural log for False Positive", 7.3, calculator.naturalLog1(2.1), DELTA);
    }
}
