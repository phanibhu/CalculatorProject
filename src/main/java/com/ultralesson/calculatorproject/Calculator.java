package com.ultralesson.calculatorproject;

import operations.*;

import java.util.List;

public class Calculator {
    private CalculatorHistory calculatorHistory;

    public Calculator(){
        this.calculatorHistory = new CalculatorHistory();
    }
    public int addNumbers(int num1, int num2) {
        try {
            return new Addition().add(num1, num2);
        } catch (Exception e) {
            System.out.println("An error occurred while adding numbers: " + e.getMessage());
            return 0;
        }
    }

    public int subtractNumbers(int num1, int num2) {
        try {
            return new Substraction().subtract(num1, num2);
        } catch (Exception e) {
            System.out.println("An error occurred while subtracting numbers: " + e.getMessage());
            return 0;
        }
    }

    public int multiplyNumbers(int num1, int num2) {
        try {
            return new Multiplication().multiply(num1, num2);
        } catch (Exception e) {
            System.out.println("An error occurred while multiplying numbers: " + e.getMessage());
            return 0;
        }
    }

    public int divideNumbers(int num1, int num2) {
        // try {
        return new Division().divide(num1, num2);
        // } catch (Exception e) {
        //System.out.println("An error occurred while dividing numbers: " + e.getMessage());
        //  return 0;
        //}
    }

    public double addMultipleNumbers(double[] numbers) {
        try {
            return new Addition().addMultipleNumbers(numbers);
        } catch (Exception e) {
            System.out.println("An error occurred while adding multiple numbers: " + e.getMessage());
            return 0.0;
        }
    }

    public double subtractMultipleNumbers(double[] numbers) {
        try {
            return new Substraction().subtractMultipleNumbers(numbers);
        } catch (Exception e) {
            System.out.println("An error occurred while subtracting multiple numbers: " + e.getMessage());
            return 0.0;
        }
    }

    public double multiplyMultipleNumbers(double[] numbers) {
        try {
            return new Multiplication().multiplyMultipleNumbers(numbers);
        } catch (Exception e) {
            System.out.println("An error occurred while multiplying multiple numbers: " + e.getMessage());
            return 0.0;
        }
    }

    public double divideMultipleNumbers(double[] numbers) {
        try {
            return new Division().divideMultipleNumbers(numbers);
        } catch (Exception e) {
            System.out.println("An error occurred while dividing multiple numbers: " + e.getMessage());
            return 0.0;
        }
    }


    public List<Calculation> getHistory(CalculatorHistory calculatorHistory){
        return calculatorHistory.getHistory();
    }
    public Calculation performOperation(double a, double b, Operation operation) {
        Calculation calculate = operation.calculate(a, b);
        calculatorHistory.addCalculation(calculate);
        return calculate;
    }

}
