
import java.util.Scanner;
public class Day62 {
    public static void main(String[] args) {
        Scanner u = new Scanner(System.in);
        
        System.out.print("Masukkan nilai n: ");
        int angka = u.nextInt();
        int jumlah = 0;
        
        for (int i = 1; i <= angka; i++) {
            jumlah += i;
        }
        System.out.println("Jumlah dari 1 sampai " + n + " adalah: " + jumlah);
            
    }
}
