
package pkg58;
import java.util.Scanner;
public class NewClass {
    public static void main(String[] args) {
        Scanner u = new Scanner(System.in);
        System.out.print("Masukan angka n = ");
         int n = u.nextInt();
         System.out.println("Ganjil");
         for (int i = n; i > 0; i--) {
             if (i %2 == 1){
                 System.out.print(i+""); 
             }
         }
           System.out.println("");
             System.out.println("Genap");
             for (int j = n; j > 0; j--) {
                 if ( j %2 == 0) {
                     System.out.print(j+"");
                 
                 
             }
        }
         
    }
} 
