package edu.umb.cs680.hw01;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class PrimeGeneratorTest {
    @Test
    public void GeneratePrimeBetween2And7() {
        PrimeGenerator pg = new PrimeGenerator(2,7);
        pg.generatePrimes();

        Long[] expected = {2L, 3L, 5L, 7L};
        assertArrayEquals(expected, pg.getPrimes().toArray());
    }

    @Test
    public void GeneratePrimeWithNegativeLowerBound() {
        try {
            PrimeGenerator pg = new PrimeGenerator(-1,1);
            fail("Negative lower bound");
        } catch (RuntimeException e) {
            assertEquals("Wrong input values: from=-1 to=1", e.getMessage());
        }
    }

    @Test void GeneratePrimeWithDecreasingRange() {
        try {
            PrimeGenerator pg = new PrimeGenerator(10,1);
            fail("Decreasing range");
        } catch (RuntimeException e) {
            assertEquals("Wrong input values: from=10 to=1", e.getMessage());
        }
    }
}
