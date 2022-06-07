import java.util.Random;
import java.util.Scanner;

public class zad2 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Random rd = new Random();

        System.out.print("Введите размер массива: ");
        int[] array = new int[in.nextInt()];

        for (int i = 0; i < array.length; i++) {
            array[i] = rd.nextInt(10,99);
            if (i % 2 == 0){
                System.out.print(array[i] + " ");
        }
        }

        System.out.println();

        for (int i = 0; i < array.length; i++) {
            if (i % 2 != 0){
                System.out.print(array[i] + " ");
            }
        }
    }

}

