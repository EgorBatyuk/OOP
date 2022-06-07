import java.util.Scanner;

public class zad8 {

    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        System.out.print("Введите сумму: ");
        int sum = in.nextInt();

        if (sum / 100 > 0) {
            System.out.println("100 * " + sum / 100);
        }

        sum %= 100;

        if (sum / 50 > 0) {
            System.out.println("50 * " + sum / 50);
        }

        sum %= 50;

        if (sum / 10 > 0) {
            System.out.println("10 * " + sum / 10);
        }

        sum %= 10;

        if (sum % 10 != 0) {
            System.out.println("В единицах не возможно");
        }
    }

}

