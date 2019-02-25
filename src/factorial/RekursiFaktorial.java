package factorial;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class RekursiFaktorial {
    public static void main(String[] args) {
        System.out.print("Masukan bilangan yang akan di FAKTORIAL kan: ");
        final int bilangan = inputData();
        System.out.println("FAKTORIAL dari "+bilangan+" adalah "+faktorial(bilangan));
    }

    private static int faktorial(int bilangan) {
        if (bilangan == 0) return 1;
        else
            bilangan = bilangan * (faktorial(bilangan-1));
        return bilangan;
    }

    private static int inputData() {
        BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
        String angkaInput = null;
        try {
            angkaInput = bfr.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }

        if (angkaInput != null) {
            return Integer.valueOf(angkaInput);
        }
        return 0;
    }
}
