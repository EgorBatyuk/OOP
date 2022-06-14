import java.util.Random;

public class zad2 {
    public static void main(String[] args) {
        int[][] arr = new int[6][14];
        add_array(arr);
        print_arr(arr);
    }

    public static void add_array(int[][] arr) {
        Random rd = new Random();

        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 14; j++) {
                arr[i][j] = rd.nextInt(30, 125);
            }
        }
    }

    public static void print_arr(int[][] arr) {
        for (int i = 0; i < 6; i++){
            for (int j = 0; j < 14; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
