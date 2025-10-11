package dayo34;
public class Dayo34 {
    public static void main(String[] args) {
         boolean umurDewasa = true;  // Umur >= 18
        boolean mahasiswa = false;  // Status mahasiswa
        boolean lulusUjian = true;  // Lulus ujian
        // Operator AND (&&): True jika semua kondisi true
        boolean bolehKerja = umurDewasa && lulusUjian;
        System.out.println("Boleh kerja (umur dewasa DAN lulus ujian): " + bolehKerja);
        // Operator OR (||): True jika salah satu kondisi true
        boolean dapatBeasiswa = mahasiswa || lulusUjian;
        System.out.println("Dapat beasiswa (mahasiswa ATAU lulus ujian): " + dapatBeasiswa);
        // Operator NOT (!): Membalik nilai boolean
        boolean tidakMahasiswa = !mahasiswa;
        System.out.println("Bukan mahasiswa (NOT mahasiswa): " + tidakMahasiswa);
    }
    
}
