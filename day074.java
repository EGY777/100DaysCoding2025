import java.util.Scanner;
public class Day74 {
    public static void main(String[] args) {
        Scanner l = new Scanner(System.in);
        
        int pilihan;

        do {
            System.out.println("===== MENU KALKULATOR =====");
            System.out.println("1. Perkalian");
            System.out.println("2. Pembagian");
            System.out.println("3. Keluar");
            System.out.print("Pilih menu: ");
            pilihan = l.nextInt();

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan angka pertama: ");
                    double a = l.nextDouble();
                    System.out.print("Masukkan angka kedua: ");
                    double b = l.nextDouble();
                    System.out.println("Hasil kali: " + (a * b));
                    break;

                case 2:
                    System.out.print("Masukkan angka pertama: ");
                    double c = l.nextDouble();
                    System.out.print("Masukkan angka kedua: ");
                    double d = l.nextDouble();

                    if (d != 0) {
                        System.out.println("Hasil bagi: " + (c / d));
                    } else {
                        System.out.println("Error: Pembagi tidak boleh 0!");
                    }
                    break;
            }
                    } while (pilihan != 3);
    }
}
