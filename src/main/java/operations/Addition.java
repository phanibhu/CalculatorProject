package operations;

import com.ultralesson.calculatorproject.Calculation;

public class Addition implements Operation
{
    public int add(int a, int b) {

        return a+b;
    }
    @Override
    public Calculation calculate(double a, double b) {
        Calculation calculation = new Calculation("Addtion", a+b );
        return calculation;
    }
    public double addMultipleNumbers(double[] numbers) {
        double value = 0;
        for (double number : numbers) {
            value += number;
        }
        return value;
    }

}