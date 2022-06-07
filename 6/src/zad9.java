import java.util.Scanner;

public class zad9 {


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int num = in.nextInt();

        int num1 = num / 100;
        int num2 = (num / 10) % 10;
        int num3 = num % 10;

        if (num2 > num1 && num2 > num3) {
            System.out.println("Число гора");
        } else {
            System.out.println("Число не гора");
        }
    }
}
