public class zad3 {
    public static void main(String[] args) {
        int x = -9+(int)(19*Math.random());
        int y = -9+(int)(19*Math.random());
        System.out.println(x);
        System.out.println(y);

        System.out.println("наибольшее число: " + Math.max(x,y));
        System.out.println("наименьшее число: " + Math.min(x,y));
    }
}
