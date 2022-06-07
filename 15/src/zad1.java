import java.util.Random;
import java.util.Scanner;

public class zad1 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Random rd = new Random();

        System.out.print("Введите размер массива: ");
        int[] array = new int[in.nextInt()];

        for (int i = 0; i < array.length; i++) {
            array[i] = rd.nextInt(100, 999);
            System.out.print(array[i] + " ");
        }
    }
}
