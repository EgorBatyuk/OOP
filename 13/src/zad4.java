public class zad4 {
    public static void main(String[] args) {

        for (int i = 1; i < 75+1; i++) {
            int sum = 0;

            for (int j = 1; j < i+1; j++) {

                if (i % j == 0) {
                    sum += j;
                }
            }

            System.out.printf("%d сумма делителей %d\n", i, sum);
        }
    }
}
