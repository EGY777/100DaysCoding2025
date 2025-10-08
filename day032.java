package day032;

import java.util.Scanner;

public class Day032 {
    public static void main(String[] args) {
             Scanner input = new Scanner(System.in);

        System.out.print("Masukkan umur Anda: ");
        int umur = input.nextInt();

        System.out.print("Masukkan nilai tes Anda: ");
        int nilaiTes = input.nextInt();

        if (umur >= 18 && nilaiTes >= 80) {
            System.out.println("Anda lolos pendaftaran.");
        } else {
            System.out.println("Anda tidak memenuhi syarat.");
        }
    }
    
}
