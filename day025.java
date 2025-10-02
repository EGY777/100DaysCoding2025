package day025;

import java.util.Scanner;

public class Day025 {
    public static void main(String[] args) {
        Scanner u = new Scanner(System.in);
        
        int a,b;
        
        System.out.println("=== Increment (penambahan) ===");
        System.out.print("masukan nilai increment = ");
        a = u.nextInt();
        
        
        System.out.println("Nilai awal a = " + a);
        System.out.println("Pre-increment (++a) = " + (++a)); 
        System.out.println("\nPost-increment (a++) = " + (a++)); 
        System.out.println("Nilai akhir a = " + a);

        System.out.println("\n=== Decrement (pengurangan) ===");
        System.out.print("masukan nilai decrement = ");
        b = u.nextInt();

        System.out.println("Nilai awal b = " + b);
        System.out.println("Pre-decrement (--b) = " + (--b)); 
        System.out.println("\nPost-decrement (b--) = " + (b--)); 
        System.out.println("Nilai akhir b = " + b);
    }
}
