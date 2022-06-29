public class Number {


//    public Number(String[] numbers){
//        this.numbers = numbers;
//    }

    public double add(double[] numbers){
        double result = 0;

        for (double number : numbers) {
            result += number;
        }
        return result;
    }

    public double subtraction(double[] numbers){
        double result = numbers[0];

        for (int i = 1; i < numbers.length; i++){
            result -= numbers[i];
        }

        return result;
    }

    public double multiplication(double[] numbers){
        double result = 1;

        for (double number : numbers){
            result *= number;
        }

        return result;
    }

    public double division(double[] numbers){
        double result = numbers[0];

        for (int i = 1; i < numbers.length; i++){
            result /= numbers[i];
        }

        return result;
    }

}
