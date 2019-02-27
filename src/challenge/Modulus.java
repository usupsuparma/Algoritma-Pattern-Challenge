package challenge;

public class Modulus {
    public static void main(String[] args) {
        int start = 1;
        int end = 3;
        for (int i = 0; i <= (end - start); i++) {
            for (int j = 0; j <= (end - start); j++) {
                //                          total iterasi
                System.out.print((i + j) % (end - start + 1) + start);
            }
            System.out.println();
        }
    }
}
