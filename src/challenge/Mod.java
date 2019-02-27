package challenge;

public class Mod {
    public static void main(String[] args) {
        int start = 1;
        int end = 5;
        for (int i= start; i<=end; i++) {
            for (int j = 0; j<end; j++) {
                int r = i+j;
                if (r > end) {
                    System.out.print(r-end);
                }else {
                    System.out.print(r);
                }
            }
            System.out.println();
        }
    }
}
