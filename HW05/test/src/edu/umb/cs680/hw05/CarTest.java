package edu.umb.cs680.hw05;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class CarTest {

    private String[] carToStringArray(Car c) {
        String[] carInfo = {c.getMake(), c.getModel(), String.valueOf(c.getYear())};
        return carInfo;
    }

    @Test
    public void verifyCarEqualityWithMakeModelYear() {
        String[] expected = {"Toyota", "RAV4", "2018"};
        Car actual = new Car("Toyota", "RAV4", 1, 2018, 1000);
        assertArrayEquals(expected, carToStringArray(actual));
    }

}
