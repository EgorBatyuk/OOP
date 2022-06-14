import java.util.Random;

public class zad5 {
    public static void main(String[] args) {
        int row = 3, cow = 3;

        int[][] arr = new int[row][cow];
        add_int(arr, row, cow);
        print_arr(arr, row, cow);
        System.out.println("Сумма столбца k равна " + sum_k(arr, row,cow, 0));
        max_sum(arr, row, cow);
    }

    public static void add_int(int[][] arr, int row, int cow) {
        Random rd = new Random();

        for (int i = 0; i < row; i++){
            for (int j = 0; j < cow; j++){
                arr[i][j] = rd.nextInt(1, 9);
            }
        }
    }

    public static void max_sum(int[][] arr, int row, int cow) {
        int max = Integer.MIN_VALUE;
        int k = 0;

        for (int i = 0; i < row; i++) {
            if (sum_k(arr, i, row, cow) > max) {
                max = sum_k(arr, i, row,cow);
                k = i;
            }
        }

        System.out.println("Больше всего столбец с номером " + k);
    }

    public static int sum_k(int[][] arr, int row, int cow, int k) {
        int sum = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cow; j++) {
                if (i == k) {
                    sum += arr[i][j];
                }
            }
        }

        return sum;
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
