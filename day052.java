package pkg8;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner u = new Scanner(System.in);
        System.out.print("Masukan angka awal = ");
        int A = u.nextInt();
        System.out.print("Masukan angka ahkhir = ");
        int B = u.nextInt();
        while(A <= B){
            System.out.println("Menghitung mundur dari "+A);
            A++;
        }
         
    }
    
}
