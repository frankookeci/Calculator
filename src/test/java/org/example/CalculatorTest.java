package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {
    Calculator calc = new Calculator();

    @BeforeEach
    void setUp() {

    }

    @Test
    void add() {
        assertEquals(3, calc.add(2, 1));
    }

    @Test
    void multiply() {
        assertEquals(3, calc.multiply(3, 1));
    }

    @Test
    void subtract() {
        assertEquals(3, calc.subtract(4, 1));
    }

    @Test
    void dividieren() {
        assertEquals(3, calc.dividieren(6, 2));
    }

    @Test
    void squareRoot() {
        assertEquals(5.0, calc.squareRoot(25), 0.001);
        assertEquals(3.162, calc.squareRoot(10), 0.001);
        Exception exception = assertThrows(IllegalArgumentException.class, () -> calc.squareRoot(-4));
        assertEquals("Cannot calculate square root of a negative number", exception.getMessage());
    }
}
