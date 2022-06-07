import java.util.Scanner;

public class zad4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();
        int min = 1;

        System.out.println(min + (int) (Math.random() * (num - min)));
        System.out.println(min + (int) (Math.random() * (num - min)));
        System.out.println(min + (int) (Math.random() * (num - min)));

    }
}
