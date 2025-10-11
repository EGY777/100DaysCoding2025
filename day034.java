package dayo34;
import java.util.Scanner;
public class Dayo34 {
    public static void main(String[] args) {
         Scanner u = new Scanner(System.in);
        // Input umur dari pengguna
        System.out.print("Masukkan umur Anda: ");
        int umur = u.nextInt();
        boolean umurDewasa = (umur >= 18);  // Cek umur >= 18
        
        // Input status mahasiswa (true/false)
        System.out.print("Apakah Anda mahasiswa? : ");
        String statusMahasiswa = u.next().toLowerCase();
        boolean mahasiswa = statusMahasiswa.equals("ya");
        
        // Input status lulus ujian (true/false)
        System.out.print("Apakah Anda lulus ujian? : ");
        String statusLulus = u.next().toLowerCase();
        boolean lulusUjian = statusLulus.equals("ya");
        
        // Operator AND (&&): True jika semua kondisi true
        boolean bolehKerja = umurDewasa && lulusUjian;
        System.out.println("\nBoleh kerja (umur dewasa DAN lulus ujian): " + bolehKerja);
        
        // Percabangan if-else untuk bolehKerja
        if (bolehKerja) {
            System.out.println("Anda boleh kerja!");
        } else {
            System.out.println("Anda tidak boleh kerja. Pastikan umur >= 18 dan lulus ujian.");}
        
            
        }

    }
