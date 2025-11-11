package kic;
import java.util.Scanner;
public class Day65 {
    public static void main(String[] args) {
        Scanner u = new Scanner(System.in);
        System.out.print("Masukkan angka : ");
        int angka = u.nextInt();
      
        int tot = 1;
        for (int i = 1; i <= angka; i++) {
            tot *= i;
        }
        System.out.println("Faktorial dari " + angka + " adalah : " + total);
    }
}
