package day049;
import java.util.Scanner;
public class Day049 {
    public static void main(String[] args) {
        Scanner u = new Scanner(System.in);
        System.out.print(" masukan nilai : ");
        int nilai = u.nextInt();
        String hasil = nilai >= 75 ? "lulus ":"tidak lulus ";
        System.out.println(" nilai : " + nilai);
        System.out.println(" keterangan : " + hasil);
    }
}
