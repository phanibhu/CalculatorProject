package operations;

public class Division implements Operation{
    public int divide(int a, int b) {

        return a/b;
    }
    @Override
    public double calculate(double a, double b) {
        return a / b;
    }
    public double divideMultipleNumbers(double[] numbers){
        double value = numbers[0];
        for(int i=1; i<numbers.length;i++){
            value = value / numbers[i];
        }
        return value;

    }
}
