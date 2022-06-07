import java.util.Random;

public class zad3 {
    public static void main(String[] args) {
        int min = -20;
        int max = 35;

        for (int i = 0; i < 15; i++) {
            int num = min + (int) (Math.random() * (max - min + 1));

            if (num == 0) {
                System.out.print("%" + num + "% ");
                continue;
            }

            else if (num < 0 ){
                System.out.print(num + "? ");
            }

            else System.out.print(num + " ");

        }
    }
}
