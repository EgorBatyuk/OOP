import java.util.Random;
import java.util.Scanner;

public class zad1 {
    public static void main(String[] args) {

        Random rd = new Random();

        int array[][] = new int[5][5];

        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++){
                array[i][j] = rd.nextInt(1, 10);
            }
        }
        for (int i = 0; i < array.length; i++){
            for (int j = 0; j < array.length; j++){
                System.out.print(array[i][j]+ " ");
            }
            System.out.println("");
        }

        System.out.println(sum(array));


    }
    public static int sum(int array[][]){
        int sum = 0;
        for (int i = 0; i < array.length; i++){
            for (int j = array.length-1; j > 0; j--){
                sum += array[i][j];


            }
        }
        return sum;
    }
}
