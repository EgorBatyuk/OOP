import java.util.Random;

public class zad1 {
    public static void main(String[] args) {
        int[] array = new int[5];
        Random rd = new Random();

        for (int i = 0; i < array.length; i++){
            array[i] = rd.nextInt(0, 10);
        }

        printArray(array);
    }

    public static void printArray(int[] array)
    {
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
}
