import java.util.Random;

public class zad2 {
    public static void main(String[] args) {
        Random rd = new Random();

        int max = 0;
        int min = 0;

        for (int i = 0; i < 50; i++){
            int num = rd.nextInt(-40, 40);

            max = Math.max(max, num);
            min = Math.min(min, num);
        }

        System.out.println(max);
        System.out.println(min);
    }
}
