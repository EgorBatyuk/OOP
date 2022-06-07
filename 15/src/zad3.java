import java.util.Random;
import java.util.Scanner;

public class zad3 {
    public static void main(String[] args) {

        Scanner in = new Scanner(System.in);
        Random rd = new Random();

        int lenght = 0;

        System.out.print("Введите размер массива: ");
        int[] array = new int[in.nextInt()];

        for (int i = 0; i < array.length; i++) {
            array[i] = rd.nextInt(10, 99);
        }

        if (array.length % 2 != 0){
            lenght = array.length/2 + 1;
        } else {
            lenght = array.length/2;
        }

        for (int i = 0; i < lenght; i++){
            System.out.print(array[i] + " ");
        }
        System.out.println(" ");
        for (int i = array.length - 1; i >= lenght; i--){
            System.out.print(array[i] + " ");
        }

    }
}
