package operations;

import com.ultralesson.calculatorproject.Calculation;

public class Division implements Operation{
    public int divide(int a, int b) {

        return a/b;
    }
    @Override
    public Calculation calculate(double a, double b) {
        Calculation calculation = new Calculation("Division", a / b);
        return calculation;
    }
    public double divideMultipleNumbers(double[] numbers){
        double value = numbers[0];
        for(int i=1; i<numbers.length;i++){
            value = value / numbers[i];
        }
        return value;

    }
}
