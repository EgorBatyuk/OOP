import java.util.Scanner;

public class zad5 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        int x = in.nextInt();

        if (x<0){
            x *=-1;
        }

        for (int i = 0; i<=x; i++){

            if (i == 0){
                System.out.print("Start" + " ");
            }

            System.out.print(i + " ");

            if (i==x){
                System.out.print("Finish");
            }
        }
    }
}
