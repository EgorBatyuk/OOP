import java.util.Random;

public class zad6 {
    public static void main(String[] args) {
        int row = 4, cow = 3;

        int[][] arr = new int[row][cow];
        add_int(arr, row, cow);
        print_arr(arr, row, cow);
        int[] array = sum_line(arr, row, cow);
        System.out.println();
        for (int i = 0; i < row; i++){
            System.out.print(array[i] + " ");
        }
    }

    public static void add_int(int[][] arr, int row, int cow) {
        Random rd = new Random();

        for (int i = 0; i < row; i++){
            for (int j = 0; j < cow; j++){
                arr[i][j] = rd.nextInt(1, 9);
            }
        }
    }

    public static int[] sum_line(int[][] arr, int row, int cow) {
        int[] arr_result = new int[row];

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cow; j++) {
                arr_result[i] += arr[i][j];
            }
        }

        return arr_result;
    }

    public static void print_arr(int[][] arr, int row, int cow) {
        for (int i = 0; i < row; i++){
            for (int j = 0; j < cow; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }
}
