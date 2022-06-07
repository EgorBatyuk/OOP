import java.util.Scanner;

public class zad3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        int count = 0;

        int first_num = in.nextInt();

        for (int i = 0; i < 11; i++) {
            int num = in.nextInt();

            if (num > first_num) {
                count += 1;
            }
        }
        System.out.println(count);
    }

}
