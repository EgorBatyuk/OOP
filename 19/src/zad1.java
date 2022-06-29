public class zad1 {
    public static void main(String[] args) {
        String str = "qaz";
        info(str);
    }

    public static void info(String str) {
        System.out.println("первая: " + str.charAt(0));
        System.out.println("Последняя: " + str.charAt(str.length()-1));
    }
}
