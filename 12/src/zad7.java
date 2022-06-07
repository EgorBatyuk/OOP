public class zad7 {
    public static void main(String[] args) {

        for (int i =99; i>10; i--){
            int f = i/10;
            int s = i%10;

            if (s == 0){
                continue;
            }

            if (i % (f * s) == 0){

                System.out.println(i);
                break;

            }
        }

    }
}
