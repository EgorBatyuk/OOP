import java.util.Scanner;

public class zad5 {
       public static void main(String[] args) {
           Scanner in = new Scanner(System.in);
            int count = 0;

            for (int i = 0; i < 5; i++) {
                System.out.println("Имя");
                String name = in.nextLine();
                System.out.println("Фамилия");
                String surname = in.nextLine();

                if (check(surname, name.charAt(0)) > 1) {
                    count += 1;
                }
            }

            System.out.println("count=" + count);
        }

    public static int check(String str, char symbol)
    {
        int count = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == symbol) count++;
        }

        return count;
    }
}
