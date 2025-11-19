package ea;
import java.util.Scanner;
public class Ea {
    public static void main(String[] args) {
        Scanner u = new Scanner (System.in);
        int total = 0;
        int angka = 0;
        while (angka >= 0){
            System.out.print("Masukan angka = ");
            angka = u.nextInt();           
            if (angka >= 0) {
            total += angka;
            }
        }
        System.out.println("total angka = " + total);

    }
}
