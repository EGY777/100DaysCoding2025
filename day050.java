package latihn08;
import java.util.Scanner;
public class Latihn08 {
    public static void main(String[] args) {
        Scanner u = new Scanner(System.in);
        System.out.print("Masukkan angka: ");
        int angka = u.nextInt();
        String hasil = (angka % 2 == 0) ? "Genap" : "Ganjil";
        System.out.println(hasil);
        }

            
    }
    
