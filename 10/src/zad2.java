import java.util.Scanner;

public class zad2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int count_ch = 0;
        int count_n = 0;

        for (int i = 0; i < 15; i++) {
            int num = in.nextInt();

            if (num % 2 == 0) {
                count_ch += 1;
            } else count_n += 1;
        }

        System.out.println(count_ch);
        System.out.println(count_n);
    }
}
