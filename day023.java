package day023;

import java.util.Scanner;

public class Day023 {
    public static void main(String[] args) {
        Scanner u = new Scanner(System.in);
        int p,l,L;
        System.out.print("masukan persegi panjang : ");
        p = u.nextInt();
        System.out.print("masukan luas persegi \t: ");
        l = u.nextInt();
        L = p*l;
        System.out.println("hasil luas persegi panjang = "+L);
        
    }
    
}
