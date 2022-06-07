import java.util.Scanner;

public class zad5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();

        if (num > 500){

            int x3 = num % 1000/100;
            int x2 = num % 100/10;
            int x1 = num % 10;

            num = (x1*100+x2*10+x3);
            System.out.println(num);


        }

        else {
            int x3 = num % 1000 / 100;
            int x2 = num % 100 / 10;
            int x1 = num % 10;

            num = (x3 * 100 + x1 * 10 + x2);
            System.out.println(num);
            System.out.println("qaz");
        }
    }
}
