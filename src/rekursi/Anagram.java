package rekursi;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Anagram {
    static int size;
    static int count;
    static char[] arrChar = new char[100];

    public static void main(String[] args) {
        // mendapatkan kalimat dari pengguna
        System.out.print("Masukan kalimat: ");
        System.out.flush();
        String input = getString();
        // mendapatakan ukuran kalimat
        size = input.length();
        count = 0;
        for (int i = 0; i < size; i++) {
            // menaruh kalimat di array
            arrChar[i] = input.charAt(i);
        }
        doAnagram(size);
    }

    private static void doAnagram(int newSize) {
        // jika ukuran terlalu kecil
        if (newSize == 1)
            return;
        // untuk tiap posisi
        for (int j = 0; j < newSize; j++) {
            // sisa anagram.
            doAnagram(newSize - 1);
            // jika selesai
            if (newSize == 2)
                displayWord();
            // lakukan rotasi kalimat
            rotate(newSize);
        }
    }

    private static void rotate(int newSize) {
        int j;
        int position = size - newSize;
        // simpan huruf pertama.
        char temp = arrChar[position];
        for (j = position +1; j < size; j++)
            // geser huruf yang lain ke kiri.
            arrChar[j - 1] = arrChar[j];
        // meletakan huruf pertama ke kanan
        arrChar[j - 1] = temp;
    }

    private static void displayWord() {
        if (count < 99) {
            System.out.print(" ");
        }
        if (count < 9) {
            System.out.print(" ");
        }
        System.out.print(++count+" ");
        for (int i = 0; i < size; i++)
            System.out.print(arrChar[i]);
        System.out.print(" ");
        System.out.flush();
        if (count % 6 == 0)
            System.out.println(" ");

    }

    private static String getString() {
        String s = null;
        try {
            BufferedReader bfr = new BufferedReader(new InputStreamReader(System.in));
            s = bfr.readLine();
            return s;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return s;
    }
}
