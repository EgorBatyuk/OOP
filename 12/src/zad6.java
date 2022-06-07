import java.util.Scanner;

public class zad6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int i = 0;
        int max_i = i;
        int max_sum = Integer.MIN_VALUE;

        while (i < 15) {
            int num = in.nextInt();
            int num1 = num;
            int sum = 0;

            while (num1 != 0) {
                sum += num1 % 10;
                num1 = num1 / 10;
            }

            if (sum > max_sum) {
                max_sum = sum;
                max_i = i;
            }

            System.out.printf("Сумма цифр числа %d = %d\n", num, sum);
            i++;
        }

        max_i++;

        System.out.println("Порядковый номер = " + max_i);
    }
}
