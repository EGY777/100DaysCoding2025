public class Latihan78 {
    public static void main(String[] args) {
        String teks = "Hello word";

        int panjang = teks.length();
        String besar = teks.toUpperCase();
        String kecil = teks.toLowerCase();
        String potong = teks.substring(8, 12);
        String ubah = teks.replace("Pemula", "Dasar");
        boolean cek = teks.contains("word");

        System.out.println("Teks asli       : " + teks);
        System.out.println("Panjang         : " + panjang);
        System.out.println("Huruf besar     : " + besar);
        System.out.println("Huruf kecil     : " + kecil);
        System.out.println("Potongan teks   : " + potong);
        System.out.println("Teks diganti    : " + ubah);
        System.out.println("Mengandung 'word'? " + cek);
    }
}
