public class zad7 {

    public static void main(String[] args) {
        int min = 10;
        int max = 99;

        int start = min + (int) (Math.random() * (max - min + 1));
        min = start;
        int end = min + (int) (Math.random() * (max - min + 1));

        min = start;
        max = end;

        System.out.printf("От %d до %d \n", min, max);

        System.out.println(min + (int) (Math.random() * (max - min + 1)));
        System.out.println(min + (int) (Math.random() * (max - min + 1)));
        System.out.println(min + (int) (Math.random() * (max - min + 1)));
    }
}
