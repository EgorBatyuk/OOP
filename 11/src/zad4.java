import java.util.Random;

public class zad4 {
    public static void main(String[] args) {

        Random rd = new Random();

        int max = 0;

        for (int i = 0; i < 25; i++){

            int num = rd.nextInt(100,999);

            max = Math.max(num, max);

        }
    }
}
