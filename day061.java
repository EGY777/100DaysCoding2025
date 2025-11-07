
package pkg61;
import java.util.Scanner;
public class NewClass1 {
    public static void main(String[] args) {
        Scanner u = new Scanner(System.in);
        System.out.print("Angka N = ");
         int N = u.nextInt();
         System.out.print("Kelipatan M = ");
         int M = u.nextInt();
         
         for (int i = 1; i < N; i++) {
             int K = M*i;
             if (K <= N) {
                 System.out.println(K);
             }else{
                 
             }
        }
    }
 }  
