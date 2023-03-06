package operations;

import com.ultralesson.calculatorproject.Calculation;

public class Substraction implements Operation
{
    public int subtract(int a, int b) {

        return a-b;
    }
    @Override
    public Calculation calculate(double a, double b) {
        Calculation calculation = new Calculation("Substraction", a-b );
        return calculation;
    }
    public double subtractMultipleNumbers(double[] numbers){
        double value = numbers[0];
        for(int i=1;i<numbers.length; i++){
            if(value<numbers[i]){
                value= numbers[i]-value;

            }
            else {
                return value-numbers[i];
            }
        }
        return value;
}

}
