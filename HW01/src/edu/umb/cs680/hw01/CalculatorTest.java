package edu.umb.cs680.hw01;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    @Test
    public void multiply3By4() {
        Calculator c = new Calculator();
        float actual = c.multiply(3,4);
        float expected = 12;
        assertEquals(actual, expected);
    }

    @Test
    public void divide5By2() {
        Calculator c = new Calculator();
        float actual = c.divide(5,2);
        float expected = 2.5f;
        assertEquals(actual, expected);
    }

    @Test
    public void divide6By0() {
        Calculator c = new Calculator();
        try {
            c.divide(5,0);
            fail("Division by zero");
        } catch(IllegalArgumentException e) {
            assertEquals("division by zero", e.getMessage());
        }
    }
}
