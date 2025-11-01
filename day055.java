
package pkg20;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner u = new Scanner(System.in);
        System.out.print("Masukan angka = ");
        int angka = u.nextInt();
        String hasil = (angka % 2 == 0) ? "iyaji" : "tidakji";
        System.out.println(hasil);
        
        
    }
    
}
