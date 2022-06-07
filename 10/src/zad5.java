import java.util.Random;

public class zad5 {
    public static void main(String[] args) {

        Random rd = new Random();

        for (int i = 0; i < 16; i++){
            System.out.println(rd.nextInt(-25, 25));
        }
    }
}
