package com.kaligent.springboot.junitmockitorestapi;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    Calculator calculator;
    
    @BeforeEach
    void setUp() {
        calculator = new Calculator();
    }

    @Test
    public void testMultiply() {
        assertEquals(20, calculator.multiply(4, 5));
    }

    @Test
    public void testMultiply_DiffParameters() {
        assertEquals(20, calculator.multiply(5, 5));
    }

    @Test
    public void testDivide() {
        assertEquals(4, calculator.divide(4, 1));
    }
}
