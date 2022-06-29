import java.util.Scanner;

public class zad3 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);


        String name1 = in.nextLine();
        String name2 = in.nextLine();

        if (name1.equals(name2)) {
            System.out.println("Тёзки");
        } else {
            System.out.println("Не тёзки");
        }
    }
}
