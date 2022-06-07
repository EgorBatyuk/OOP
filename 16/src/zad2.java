import java.util.Random;

public class zad2 {
    public static void main(String[] args) {
        int[] testArray = new int[5];

        printArray(fillArray(testArray));
    }

    public static int[] fillArray(int[] array)
    {
        Random rd = new Random();
        for (int i = 0; i < array.length; i++) {
            array[i] = rd.nextInt(0, 99);
        }

        return array;
    }

    public static void printArray(int[] array)
    {
        for (int i = 0; i < array.length; i++) System.out.print(array[i] + " ");
    }
}
