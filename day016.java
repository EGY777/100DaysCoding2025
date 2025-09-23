package pkg016;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner angka = new Scanner(System.in);
        int a,b,c;
        
        System.out.print("masukan A = ");
        a = angka.nextInt();
        System.out.print("masukan B = ");
        b = angka.nextInt();
        
        
        c = a * b;
        System.out.println( + a + " x " + b + " = " + c);
        c = b / a;
        System.out.println(b + " / " + a + " = " + c);
    }
    
}
