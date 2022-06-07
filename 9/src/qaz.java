import java.util.Random;

public class qaz {
    public static void main(String[] args) {
        int[] a = new int[20];
        int[] b = new int[20];
        int count = -1;

        for (int i = 0; i < a.length; i++) {
            a[i] = (int) (Math.random() * 20);
            System.out.print(a[i] + " ");
            if( a[i] % 2 == 0){
                b[i] = a[i];
            }
            System.out.print(b[i]);}
    }
}

