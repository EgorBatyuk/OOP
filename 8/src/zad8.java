public class zad8 {
    public static void main(String[] args) {
        int min = 10;
        int max = 99;

        int num1 = min + (int) (Math.random() * (max - min + 1));
        int num2 = min + (int) (Math.random() * (max - min + 1));
        int num3 = min + (int) (Math.random() * (max - min + 1));
        int num4 = min + (int) (Math.random() * (max - min + 1));
        int num5 = min + (int) (Math.random() * (max - min + 1));

        System.out.println(num1 / 10 * 10);
        System.out.println(num2 / 10 * 10);
        System.out.println(num3 / 10 * 10);
        System.out.println(num4 / 10 * 10);
        System.out.println(num5 / 10 * 10);
    }
}
