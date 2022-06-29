public class zad4 {
    public static void main(String[] args) {
        System.out.println(check("qqaz", 'q'));
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
