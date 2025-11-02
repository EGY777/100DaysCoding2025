package pkg20;

import java.util.Scanner;

public class NewClass {
    public static void main(String[] args) {
           Scanner u = new Scanner(System.in);
        int angka;

        do {
            System.out.print("Masukkan angka (0 untuk keluar): ");
            angka = u.nextInt();

            System.out.println("Anda memasukkan: " + angka);
        } while (angka != 0);

        System.out.println("Program selesai!");
    }
}
