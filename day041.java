import java.util.Scanner;
public class Latihan7 {
    public static void main(String[] args) {
Scanner u = new Scanner(System.in);
        int a, b;
        String predikat, keterangan;
        System.out.println("============== Program Evaluasi Mentor =============");
        System.out.print("Masukkan nilai teori = ");
        a = u.nextInt();
        System.out.print("Masukkan nilai praktik = ");
        b = u.nextInt();

        
        if (a < 0 || a > 100 || b < 0 || b > 100) {
            System.out.println("\nNilai tidak valid! Harus antara 0 - 100.");
        } else {
           
            if (a >= 90 && b >= 90) {
                predikat = "A";
                keterangan = "Lulus dengan Predikat Sangat Baik";
            } else if (a >= 80 && b >= 75) {
                predikat = "B";
                keterangan = "Lulus dengan Predikat Baik";
            } else if (a >= 70 && b >= 70) {
                predikat = "C";
                keterangan = "Lulus dengan Predikat Cukup";
            } else {
                predikat = "D";
                keterangan = "Tidak Lulus";
            }

            
            System.out.println("==============================================");
            System.out.println("Nilai Teori   : " + a);
            System.out.println("Nilai Praktik : " + b);
            System.out.println("Predikat      : " + predikat);
            System.out.println("Keterangan    : " + keterangan);
            System.out.println("==============================================");
        }

        
    }
}
