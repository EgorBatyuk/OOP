import java.util.Scanner;

public class zad2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int count = 0;
        int sum = 0;

        while (true) {
            int num = in.nextInt();

            if (num == 999){
                break;
            }

            count++;
            sum += num;
        }

        System.out.println("Количество значений: " + count);
        System.out.println("Сумма значений: " + sum);
    }
}
