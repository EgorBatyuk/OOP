public class zad5 {
    public static void main(String[] args) {
        int min = 10;
        int num = 10 + (int) (Math.random() * 100);

        System.out.println(num);

        System.out.println(min + (int) (Math.random() * (num - min)));
        System.out.println(min + (int) (Math.random() * (num - min)));
        System.out.println(min + (int) (Math.random() * (num - min)));
    }
}
