package operations;

public class Substraction implements Operation
{
    public int subtract(int a, int b) {

        return a-b;
    }
    @Override
    public double calculate(double a, double b) {
        return a - b;
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
