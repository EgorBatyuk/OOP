public class zad6 {

    public static void main(String[] args) {
        int min = 10;
        int max = 99;

        int num = min + (int) (Math.random() * (max - min + 1));
        min = num;

        int num1 = min + (int) (Math.random() * (max - min + 1));
        int num2 = min + (int) (Math.random() * (max - min + 1));
        int num3 = min + (int) (Math.random() * (max - min + 1));

        System.out.println(num);
        System.out.println("===");
        System.out.println(num1);
        System.out.println(num2);
        System.out.println(num3);

    }

}
