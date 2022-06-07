import java.util.Scanner;

public class zad1 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int count = 0;

        for (int i = 0; i<10; i++){
            int num = in.nextInt();

            if (num > 0 ){
                count +=1;
            }
        }

        System.out.println(count);

    }
}
