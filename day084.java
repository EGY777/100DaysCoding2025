package latihans;
import java.util.Scanner;
public class LatihaNs {
    public static void main(String[] args) {
        Scanner u = new Scanner(System.in);
        System.out.print("masukan nama  = ");
         String nama = u.nextLine();
         System.out.print("jumlah nama = ");
         int jumlah = u.nextInt();
         
         for (int i = 0; i < jumlah; i++) {
             System.out.println(nama);
        }
         System.out.println("");
    }
    
}
