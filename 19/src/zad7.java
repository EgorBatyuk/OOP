public class zad7 {
    public static void main(String[] args) {
        String[] arr = {"DgR", "yhjyjhGGhtht", "rgrgrg", "VRGXFGSRGGrh"};
        System.out.println(maxStr(arr));
    }

    public static String maxStr(String[] arr)
    {
        int max = Integer.MIN_VALUE;
        String maxStrT = "";

        for (int i = 0; i < arr.length; i++) {
            int count = 0;

            for (int j = 0; j < arr[i].length(); j++) {
                if (Character.toUpperCase(arr[i].charAt(j)) == arr[i].charAt(j)) {
                    count++;
                }

                if (count > max) {
                    max = count;
                    maxStrT = arr[i];
                }
            }
        }

        return maxStrT;
    }
}
