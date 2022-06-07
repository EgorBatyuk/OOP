import java.util.Random;

public class zad3 {
    public static void main(String[] args) {
        Random rd = new Random();

        int[] nums = new int[100];

        for (int i = 0; i < 100; i++) {
            nums[i] = rd.nextInt(0,9);
        }

        for (int i = 0; i < 100; i++) {
            System.out.printf("Число %d встречалось %d раз\n", nums[i], count(nums, nums[i]));
        }
    }

    public static int count(int[] array, int elem)
    {
        int count = 0;

        for (int j : array) {
            if (j == elem){
                count++;
            }
        }

        return count;
    }
}
