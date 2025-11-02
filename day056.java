package pkg20;

import java.util.Scanner;

public class NewClass1 {
    public static void main(String[] args) {
        Scanner u = new Scanner(System.in);
        int angka;
        
        do {
            System.out.print("Masukan angka (1) untuk keluar dari game = ");
            angka =  u.nextInt();
            
            System.out.println("Anda memasukan angka ("+angka+")");
            
        } while (angka != 1);
        
        System.out.println("Anda keluar dari Game");
                
    }
}
