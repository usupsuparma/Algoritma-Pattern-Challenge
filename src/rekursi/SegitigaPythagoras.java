package rekursi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class SegitigaPythagoras {
    public static void main(String[] args) {
        // write your code here
        System.out.print("Masukan tinggi segitiga Phtagoras: ");
        final int tinggi = inputData();
        triangle(tinggi);
    }

    private static int inputData() {
        BufferedReader bf = new BufferedReader(new InputStreamReader(System.in));
        String angkaInput = null;
        try {
            angkaInput = bf.readLine();
        }catch (IOException e) {
            e.printStackTrace();
        }
        int data = Integer.valueOf(angkaInput);
        return data;
    }

    private static int triangle(int tinggi) {
        int bilangan = 0;
        if (tinggi == 1) {
            bilangan = 1;
            System.out.println("Bilangan ke-"+tinggi+" adalah "+bilangan);
            return bilangan;
        } else {
            bilangan = tinggi + triangle(tinggi -1);
            System.out.println("Bilangan ke-"+tinggi+ " adalah "+bilangan);

        }
        return bilangan;
    }
}
