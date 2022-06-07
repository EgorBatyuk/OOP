import java.util.Arrays;
import java.util.Random;

public class zad1 {
    public static void main(String[] args) {
        int[] array = new int[10];
        Random rd = new Random();

        for (int i = 0; i<10; i++){
            array[i] = rd.nextInt(-10,10);
        }
        System.out.println(Arrays.toString(check(array)));
    }

    public static int[] check(int[] array){
        int niger = 0, zero = 0, no_niger = 0;
        int[] end = new int[3];


        for (int j : array) {
            if (j < 0) {
                niger++;
            }

            if (j == 0) {
                zero++;
            }

            if (j > 0) {
                no_niger++;
            }
        }

        end[0] = niger;
        end[1] = zero;
        end[2] = no_niger;

        return end;
    }

}
