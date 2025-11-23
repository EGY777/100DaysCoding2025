public class Ea {
    public static void main(String[] args) {

        String kalimat = "   Hari ini cuacanya cerah sekali di kota ini.   ";

        // hilangkan spasi di pinggir
        String trimKalimat = kalimat.trim();
        System.out.println("Trim      : " + trimKalimat);

        // ambil sebagian kata
        String bagian = trimKalimat.substring(10, 20);
        System.out.println("Substring : " + bagian);

        // ganti kata tertentu
        String diganti = trimKalimat.replace("cerah", "adem");
        System.out.println("Replace   : " + diganti);
    }
}
