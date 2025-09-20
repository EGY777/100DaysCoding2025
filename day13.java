
package eva13;
import java.util.Scanner;
public class Eva13 {       
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("====selamat datang di program evaluasi java====");
        String nama, nim, hobi;
        int usia;
        float tinggi;
        boolean status;

        System.out.print("nama \t: ");
        nama = in.nextLine();
        System.out.print("nim \t: ");
        nim = in.nextLine();
        System.out.print("hobi \t: ");
        hobi = in.nextLine();
        System.out.print("usia \t: ");
        usia = in.nextInt();
        System.out.print("tinggi \t: ");
        tinggi = in.nextFloat();
        System.out.print("status \t: ");
        status = in.nextBoolean();

        int tabungan = 1000000;
        System.out.println("tabungan awal : Rp " + tabungan);
        tabungan = tabungan + 500000;
        System.out.println("tabungan yang ditambah Rp500000 : Rp " + tabungan);
        tabungan = tabungan - 200000;
        System.out.println("tabungan yang dikurangi Rp200000 : Rp " + tabungan);

        double PHI = 3.14159;
        System.out.print("Masukan jari-jari = ");
        double r = in.nextDouble();
        double L;

        L = PHI * r * r;
        System.out.println("luas lingkaran = " + L);

        System.out.println("==========biodata mahasiswa===========");
        System.out.println("nama \t: " + nama);
        System.out.println("nim \t: " + nim);
        System.out.println("hobi \t: " + hobi);
        System.out.println("usia \t: " + usia + "th.");
        System.out.println("tingi \t: " + tinggi + "cm");
        System.out.println("status \t: " + status);

    }
}
