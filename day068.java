package king;
import java.util.Scanner;
public class King {
    public static void main(String[] args) {
        Scanner u = new Scanner(System.in);
        System.out.print("Masukan angka = ");
        int angka = u.nextInt();
        for (int i = 1; i < angka; i++) {
            for (int j = 1; j < angka; j++) {
                System.out.println("*");
            }
            System.out.println("");
            
        }
    }
    
}
