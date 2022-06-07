import java.util.Random;

public class zad3 {
    public static void main(String[] args) {
        int[] testArray = new int[10];

        printArray(fillArray(testArray));
    }

    public static int[] fillArray(int[] array)
    {


        for (int i = 0; i < array.length; i++) {
                array[i] = add_array();
        }
        return array;
    }

    public static int add_array(){
        Random rd = new Random();
        int num = rd.nextInt(10, 99);
        if (num / 10 == num % 10){
                    return num;
        }
        else return add_array();
    }

    public static void printArray(int[] array)
    {
        for (int i = 0; i < array.length; i++){
            System.out.print(array[i] + " ");
        }
    }
}
