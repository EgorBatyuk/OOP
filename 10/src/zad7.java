import java.util.Random;
import java.util.Scanner;

public class zad7 {
    public static void main(String[] args) {
        Random rd = new Random();

        int count_neg = 0;
        int count = 0;
        int sum = 0;
        float middle = 0;

        for (int i = 0; i < 31; i++){
            int mark = rd.nextInt(1, 10);

            count +=1;
            sum +=mark;

            if (mark < 4){
                count_neg +=1;
            }

            middle = sum/count;
        }

        System.out.println("Средняя арифметическая: " + middle);
        System.out.println("Число с неудовлетворительными: " + count_neg);
    }
}
