import java.util.Scanner;

public class zad4 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int sum1 = 0;
        int sum2 = 0;

        while (true) {
            int num1 = in.nextInt();
            int num2 = in.nextInt();

            if (num1 == num2){
                break;
            }

            sum1 += num1;
            sum2 += num2;
        }

        System.out.println("Сумма первых чисел в парах: " + sum1);
        System.out.println("Сумма вторых чисел в парах: " + sum2);
    }
}
