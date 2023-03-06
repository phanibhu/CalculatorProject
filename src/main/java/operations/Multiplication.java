package operations;

public class Multiplication implements Operation {
    public int multiply(int a, int b) {

        return a*b;
    }
    @Override
    public double calculate(double a, double b) {
        return a * b;
    }
    public double multiplyMultipleNumbers ( double[] numbers){
        double value = numbers[0];
        for (int i = 1; i < numbers.length; i++) {
            value = value * numbers[i];
        }
        return value;

    }

}
