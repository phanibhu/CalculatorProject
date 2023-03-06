package com.ultralesson.calculatortest;

import com.ultralesson.calculatorproject.Calculator;
import org.testng.annotations.Test;

public class CalculatorExceptionTest {
    private Calculator calculator = new Calculator();

    @Test(expectedExceptions = ArithmeticException.class)
    public void divideByZeroTest() {
        calculator.divideNumbers(10,0);
    }
}
