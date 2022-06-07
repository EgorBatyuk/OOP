import java.util.Random;

public class zad4 {
    public static void main(String[] args) {

        Random rd = new Random();

        for (int i=0; i<20; i++){
            int a = rd.nextInt(0,9);

            if (a != 0){
                System.out.print(a + " ");
            }


            if (a == 0){
                System.out.print(a);
                System.out.print("%В окружении%");
            }
        }

    }
}
