public class Main {
    public static void main(String[] args) {

        Real num = new Real();

        Number numb = new Number();

        double num1 = num.create(5f, 3f);
        double num2 = num.create(3f, 5f);

        double[] sum = {num1, num2};

        double res_sum = num.add(sum);
        double res_sub = num.subtraction(sum);
        double res_mul = num.multiplication(sum);
        double res_div = num.division(sum);

        System.out.printf("Сложение = %f\n", res_sum);
        System.out.printf("Вычитание = %f\n", res_sub);
        System.out.printf("Усножение  = %f\n", res_mul);
        System.out.printf("Деление = %f\n", res_div);



    }
}
