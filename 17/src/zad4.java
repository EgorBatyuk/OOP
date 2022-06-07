import java.util.Random;

public class zad4 {
    public static void main(String[] args) {
        Random rd = new Random();
        int[] randNums = new int[20];

        for (int i = 0; i < 20; i++) {
            randNums[i] = rd.nextInt(15,45);
        }

        for (int i = 15; i <= 45; i++) {
            if (count(randNums, i) == 0) {
                System.out.printf("Число %d не разу не встречалось\n", i);
            }
        }
    }

    public static Integer count(int[] array, int elem)
    {
        int count = 0;

        for (int j : array) {
            if (j == elem) count++;
        }

        return count;
    }
}
