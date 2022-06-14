import java.util.Random;

public class zad4 {
    public static void main(String[] args) {
        int row = 3, cow = 3;

        int[][] arr = new int[row][cow];
        add_int(arr,row, cow);
        print_arr(arr,row, cow);
        System.out.printf("Сумма = %d", sum(arr, row, cow));
    }

    public static void add_int(int[][] arr, int row, int cow) {
        Random rd = new Random();

        for (int i = 0; i < row; i++){
            for (int j = 0; j < cow; j++){
                arr[i][j] = rd.nextInt(1, 9);
            }
        }
    }

    public static void print_arr(int[][] arr, int row, int cow) {
        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cow; j++) {
                System.out.print(arr[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static int sum(int[][] arr, int row, int cow)
    {
        int sum = 0;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cow; j++) {
                sum += arr[i][j];
            }
        }

        return sum;
    }
}
