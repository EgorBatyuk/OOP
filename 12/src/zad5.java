import java.util.Scanner;

public class zad5 {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int last = 0;
        int sum = 0;

        while (true) {
            int num = in.nextInt();

            if (last != num){
                sum += num;
            }
            else break;

            last = num;
        }

        System.out.println("Сумма= " + sum);
    }
}
