import java.util.Scanner;
public class Day70 {
    public static void main(String[] args) {
        Scanner u = new Scanner(System.in);
        
        System.out.print("Masukkan baris: ");
        int baris = u.nextInt();
      
        System.out.print("Masukkan kolom: ");
        int kolom = u.nextInt();
        
        for (int i = 1; i <= baris; i++) {
            for (int j = 1; j <= kolom; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
}
