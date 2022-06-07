import java.util.Scanner;

public class zad7 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);

        int num = in.nextInt();

        if (num == 12 || num == 1 || num == 2){
            System.out.println("Зима");
        }

        if (num == 3 || num == 4 || num == 5){
            System.out.println("Весна");
        }

        if (num == 6 || num == 7 || num == 8){
            System.out.println("Лето");
        }

        if (num == 9 || num == 10 || num == 11){
            System.out.println("Осень");
        }

    }
}
