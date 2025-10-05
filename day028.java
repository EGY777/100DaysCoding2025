package day028;
import java.util.Scanner;
public class Day028 {
    public static void main(String[] args) {
        Scanner u = new Scanner(System.in);
        
        int a,b,c;
        System.out.print("masukan angka a = ");
         a = u.nextInt();
         System.out.print("masukan angka b = ");
         b = u.nextInt();
         System.out.print("masukan angka c = ");
         c = u.nextInt();
         
         System.out.println("======HASIL=======");
         //operator ==
         System.out.println("apakah a == b "+ (a==b));
         System.out.println("apakah a == c "+ (a==c));
         
         //operator !=
         System.out.println("apakah a != b "+ (a!=b));
         System.out.println("apakah a != b "+ (a!=c));
         
    }
    
}
