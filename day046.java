package javaapplication94;
import java.util.Scanner;
public class JavaApplication94 {
    public static void main(String[] args) {
        Scanner u = new Scanner(System.in);
        System.out.println("=======MENU KANTIN MAHASIGMA=======");
        System.out.println("1. AYAM BAKAR ");
        System.out.println("2. NASI GORENG ");
        System.out.println("3. MIE AYAM ");
        System.out.print("Masukan no menu yang mau di pesan : ");
        int harga = u.nextInt();
        
        int Harga;
        
        switch(harga){
            case 1 -> {
                Harga = 20000;
                System.out.println("harga pesanan anda Rp : "+Harga);
            } 
            case 2 -> {
                Harga = 15000;
                System.out.println("harga pesanan anda Rp : "+Harga);
            }
            case 3 -> {
                Harga = 40000;
                System.out.println("Harga pesanan anda Rp : "+Harga);
            }
            default ->{
                System.out.println("Menu yang anda inginkan tidak ada di dalam daftar menu");
            } 
        }
         
    }
    
}
