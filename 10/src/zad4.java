import java.util.Scanner;

public class zad4 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int laster = 0;
        int count = 0;

        for (int i = 0; i<18; i++){
            int num = in.nextInt();

            if (laster< num){
                count +=1;
            }

            laster = num;
        }
        System.out.println(count + " Чисел больше предыдущего");
    }
}
