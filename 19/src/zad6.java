import java.util.Scanner;

public class zad6 {
        public static void main(String[] args) {
            Scanner in = new Scanner(System.in);
            String str = in.nextLine();
            String str_reversed = "";

            for (int i = str.length() - 1; i >= 0; i--) {
                str_reversed += str.charAt(i);
            }

            if (str.equals(str_reversed)) {
                System.out.println("Паллиндром");
            } else {
                System.out.println("Не паллиндром");
        }
    }
}
