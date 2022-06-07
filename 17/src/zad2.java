import java.util.Random;

public class zad2 {
    public static void main(String[] args) {
        Random rd = new Random();
        int min = 0;
        int max = 9999;

        int oneSigns = 0;
        int twoSigns = 0;
        int threeSigns = 0;
        int fourSigns = 0;

        for (int i = 0; i < 2000; i++) {
            int randNum = rd.nextInt(0, 9999);

            if (randNum >= 0 && randNum <= 9) {
                oneSigns++;
            }

            if (randNum >= 10 && randNum <= 99) {
                twoSigns++;
            }

            if (randNum >= 100 && randNum <= 999) {
                threeSigns++;
            }

            if (randNum >= 1000 && randNum <= 9999) {
                fourSigns++;
            }
        }

        System.out.println("Кол-во однозначных чисел: " + oneSigns);
        System.out.println("Кол-во двузначных чисел: " + twoSigns);
        System.out.println("Кол-во трехзначных чисел: " + threeSigns);
        System.out.println("Кол-во четырехзначных чисел: " + fourSigns);
    }
}
