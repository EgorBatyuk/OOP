public class zad2 {
    public static void main(String[] args) {
        for (int i = 2; i < 99; i++) {
            for (int j = 10; j < 100; j++) {
                if (j % i == 0){
                    System.out.print(j + " ");
                }
            }

            System.out.println();
        }
    }
}
