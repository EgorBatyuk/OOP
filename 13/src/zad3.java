public class zad3 {
    public static void main(String[] args) {
        int cow_count = 0;

        for (int i = 10; i >= 1; i--) {
            if (i != 10){
                System.out.printf("%d быков %d коровы\n", i, cow_count);
            }
             cow_count += 2;
        }
    }
}

