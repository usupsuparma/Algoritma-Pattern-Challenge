package larik;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Larik {
    static int[] larik = new int[25];
    static int ukuranLarik;

    public static void main(String[] args) {
        System.out.print("Berapa ukuran larik? ");
        ukuranLarik = inputData();
        for (int j = 0; j < ukuranLarik; j++) {
            System.out.print("Masukan lriktke-" + (j + 1) + " ");
            larik[j] = inputData();
        }

        maxsimum();
        minimum();
        average();

    }

    private static void average() {
        double average = 0.0;
        for (int i=0; i < ukuranLarik; i++) {
            average = average + larik[i];
        }

        average = average / ukuranLarik;
        System.out.println("average: "+average);
    }

    private static void minimum() {
        int min = larik[0];
        for (int i=0; i < ukuranLarik; i++) {
            if (min > larik[i]) {
                min = larik[i];
            }
        }

        System.out.println("Nilai terkecil: "+min);
    }

    private static void maxsimum() {
        int max = larik[0];
        for (int i = 0; i < ukuranLarik; i++) {
            if(max < larik[i]) {
                max = larik[i];
            }
        }
        System.out.println("Bilangan terbesar adalah: "+max);
    }

    private static int inputData() {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        String angkaInput = null;
        try {
            angkaInput = bfr.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return Integer.valueOf(angkaInput);
    }

}
