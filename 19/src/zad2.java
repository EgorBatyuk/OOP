import java.util.Scanner;

public class zad2 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        String surname = in.nextLine();

        for(int i = 0; i < surname.length(); i++) {
            System.out.print(surname.charAt(i) + " ");
        }
    }
}
