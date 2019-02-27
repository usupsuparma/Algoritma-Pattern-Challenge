package challenge;

public class Algoritma {
    public static void main(String[] args) {
        int start = 1;
        int end = 3;
        int temp;
        for (int i = 0; i <= end - start; i++) {
            temp = start + i;
            for (int j = 0; j <= end - start; j++) {
                if (temp  > end) {
                    temp = start;
                }
                System.out.print(temp);
                temp++;
            }
            System.out.println();
        }
    }
}
