package pkg015;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        int a,b,c;
        
        System.out.print("Masukkan a : ");
        a = input.nextInt();
        System.out.print("masukkan b : ");
        b = input.nextInt();
       
        c = a + b;
        System.out.println(+ a +" + " + b + " = "+ c);
        c = a - b;
        System.out.println( + a + " - " + b + " = "+ c);
    }
    
}
