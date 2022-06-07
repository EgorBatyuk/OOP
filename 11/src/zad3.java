import java.util.Random;

public class zad3 {
    public static void main(String[] args) {
        Random rd = new Random();

        int max_sum = 0;

        for (int i = 0; i<21; i++){
            int num = rd.nextInt(10, 99);

            max_sum = Math.max(max_sum, ((num/10)+(num%10)));
        }
        System.out.println(max_sum);
    }
}
