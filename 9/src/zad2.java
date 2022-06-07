import java.util.Random;
import java.util.Scanner;

public class zad2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int min = in.nextInt();
        int max = in.nextInt();


        for (int i=1; i<21; i++){
            Random rd = new Random();
            int a = rd.nextInt(min, max);
            System.out.println(a);
        }
    }
}
