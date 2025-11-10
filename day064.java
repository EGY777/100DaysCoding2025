package javaapplication102;
import java.util.Scanner;
public class NewClass {
    public static void main(String[] args) {
        Scanner u = new Scanner(System.in);
        System.out.print("masukan m = ");
         int m = u.nextInt();
         System.out.print("Masukan n = ");
             int n = u.nextInt();
             
             int tot = 1;
            for (int i = 1; i < n; i++) {
             tot*=m;
                
        }
         System.out.println(m+" pangkat "+n+" = "+tot);
    }
}
