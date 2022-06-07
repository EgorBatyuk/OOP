import java.util.Scanner;

public class zad3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();
        int i = 0;
        int sum = 0;

        while (sum < num * num) {
            i++;
            int val = num + i;
            sum += val;

            if (sum < num * num) {
                System.out.println(val);
            }
        }
    }
}
