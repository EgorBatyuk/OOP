import java.util.Scanner;

public class zad2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int num = in.nextInt();

        int x3 = num % 1000/100;
        int x2 = num % 100/10;
        int x1 = num % 10;

        if (x3 == x1){
            System.out.println("Число симетричное");
        }
    }
}
