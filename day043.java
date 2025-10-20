package pkg00000000000000000;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner u = new Scanner(System.in);
        System.out.print(" Masukan angka : ");
        int angka = u.nextInt();
        
        if(angka%3==0 && angka%5==0){
            System.out.println("Kelipatan 3 & 5");
        }else if(angka%3==0){
            System.out.println("Kelipatan 3 ");
        }else if(angka%5==0){
            System.out.println("Kelipatan 5 ");
        }else{
            System.out.println("Bukan kelipatan 3 & 5");
        }
    }
    
}
