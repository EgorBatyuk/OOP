import java.util.Scanner;

public class zad1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();

        int f,s;

        f = num / 10;
        s = num % 10;

        if (f>s){
            System.out.println("Первая цифра больше второй");
        }


    }
}
