package day035;
import java.util.Scanner;
public class Day035 {
    public static void main(String[] args) {
        Scanner u = new Scanner(System.in);
        
        System.out.print("masukan umur anda : ");
        int umur = u.nextInt();
        
        if (umur >= 17) {
            System.out.println("selamat umur anda sudah cukup untuk membuat KTP");
        } else {
            System.out.println("umur anda belum cukup untuk membuat KTP");
        }
    
    }
    
}
