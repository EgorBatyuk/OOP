import java.util.Random;

public class zad7 {
    public static void main(String[] args) {
        int row = 4, cow = 3;

        int[][] arr = new int[row][cow];
        add_int(arr, row, cow);
        print_arr(arr, row, cow);
        info(arr, row, cow);
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

    public static void info(int[][] arr, int row, int cow) {
        int min = Integer.MAX_VALUE;
        int[] minPosition = {0, 0};
        int max = Integer.MIN_VALUE;
        int[] maxPosition = {0, 0};

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < cow; j++) {
                if (arr[i][j] > max) {
                    max = arr[i][j];
                    maxPosition[0] = i;
                    maxPosition[1] = j;
                }

                if (arr[i][j] < min) {
                    min = arr[i][j];
                    minPosition[0] = i;
                    minPosition[1] = j;
                }
            }
        }

        System.out.printf("min=%d, position: [%d, %d]\n", min, minPosition[0], minPosition[1]);
        System.out.printf("max=%d, position: [%d, %d]", max, maxPosition[0], maxPosition[1]);
    }
}
