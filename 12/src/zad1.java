import java.util.Scanner;

public class zad1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        while (true) {
            int num = in.nextInt();

            if (num == 0) break;

            if (num > 0) System.out.println("Плюс");
            else System.out.println("Минус");
        }

    }
}