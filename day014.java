package pkg014;
public class Main {
    public static void main(String[] args) {
        String nama = "Egy Saputra";
        String umur1 = "19";
        String tanggal2 = "08";
        String bulan3 = "05";
        String tahun4 = "2006";
        String tb5 = "178.9f";
        String bb6= "66.4";
        String sehat7 = "true";
        String gender8 = "L";
        
        
        //Tipe data primitif
        byte umur = Byte.parseByte(umur1);
        short tanggal = Short.parseShort(tanggal2);
        int bulan = Integer.parseInt(bulan3);
        long tahun = Long.parseLong(tahun4);
        float tinggiBadan = Float.parseFloat(tahun4);
        double BeratBadan = Double.parseDouble(bb6);
        boolean KeSehatan = Boolean.parseBoolean(sehat7);
        char Gender = gender8.charAt(0);
        
        
        
        //Hasil
        System.out.println("=========DATA MAHASIGMA===========");
        System.out.println("Nama : "+ nama);
        System.out.println("Umur : " + umur1 +"th.");
        System.out.println("tanggal lahir : "+ tanggal2);
        System.out.println("Bulan lahir : "+ bulan3);
        System.out.println("Tahun lahir : "+ tahun4);
        System.out.println("Tinggi badan : "+ tb5 + ".cm");
        System.out.println("Berat badan : "+ bb6 + "kg");
        System.out.println("Riwayat kesehatan : "+ sehat7);;
        System.out.println("Gender : "+ Gender);;

    }
    
}
