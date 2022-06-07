import java.util.Scanner;

public class zad6 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int x = in.nextInt();

        int count_equals = 0;
        int count_smaller = 0;

        for (int i = 0; i < 30; i++){
            int num = in.nextInt();

            if (x == num){
                count_equals +=1;
            }

            if (x < num){
                count_smaller +=1;
            }
        }

        System.out.println(count_equals + "Равные");
        System.out.println(count_smaller + "Меньше");
    }
}
