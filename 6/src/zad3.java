import java.util.Scanner;

public class zad3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();

        int x3 = num /100;
        int x2 = num % 100/10;
        int x1 = num % 10;

        if ((x1+x2+x3) % 2 == 0 && num % 2 ==0){
            System.out.println("Число дважды чётное");
        }
    }
}
