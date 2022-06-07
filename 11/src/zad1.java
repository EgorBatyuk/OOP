import java.util.Random;

public class zad1 {
    public static void main(String[] args) {
        int minTotal = Integer.MAX_VALUE;
        int minMinutes = 0;
        int minSeconds = 0;

        Random rd = new Random();

        for (int i = 0; i < 150; i++) {
            int randMinutes = 1 + rd.nextInt(60);
            int randSeconds = 1 + rd.nextInt(60);
            int total = randMinutes * 60 + randSeconds;

            if (total < minTotal) {
                minTotal = total;
                minMinutes = randMinutes;
                minSeconds = randSeconds;
            }

            System.out.println(randMinutes +":" + randSeconds);
        }

        System.out.printf("Лучше время: %d:%d\n", minMinutes, minSeconds);
    }
}
