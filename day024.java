package day024;
import java.util.Scanner;
public class Day024 {
    public static void main(String[] args) {
        Scanner u = new Scanner(System.in);
        final double phi = 3.14;
        double L,K,r,d;
        
        System.out.print("masukan jari jari = ");
        r = u.nextDouble();
        d = 2 * r;
        
        L = phi * r * r;
        
        
        System.out.println("Luas LIngkaran = "+L);
         
        
    }
    
}
