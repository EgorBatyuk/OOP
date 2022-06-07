public class zad5 {
    public static void main(String[] args) {
        int count = 0;
        int sum = 0;

        for (int i = 100; i < 999; i++) {
            if (i % 2 != 0) {
                count += 1;
                sum += i;
                System.out.print(i + " ");
            }
        }

        System.out.println();
        System.out.println("Кол-во чисел: " + count);
        System.out.println("Сумма чисел: " + sum);
    }
}
