import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    Calculator calculator;

    @Before
    public void before() {
        calculator = new Calculator();
    }

    @Test
    public void canAdd() {
        assertEquals(15, calculator.add(5, 10));
    }

    @Test
    public void canSubtract() {
        assertEquals(10, calculator.subtract(25, 15));
    }

    @Test
    public void canMultiply() {
        assertEquals(35, calculator.multiply(5, 7));
    }





}
