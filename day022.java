
package day022;

import java.util.Scanner;

public class Day022 {
    public static void main(String[] args) {
        Scanner u = new Scanner(System.in);
        
        int S,L;
        System.out.print("masukan sisi : ");
        S = u.nextInt();
        L = S*S;
        
        System.out.println("luas = sisi x sisi : ");
        System.out.println("luas = "+ S+" x "+S+ " = ");
        System.out.println("luas persegi = "+L);
        
        
    }
    
}
