package mhetod;
public class NewClass1 {
    public static void menu() {
        System.out.println("MENU MKANAN MAHASIGMA");
        
    }
    public static void garis() {
        System.out.println("============================");
    }
    public static void makanan(String nama, int harga , String rp) {
        System.out.println(" "+ nama);
        System.out.println("Harga "+harga+ " rp");
        
    }
    public static void main(String[] args) {
        menu();
        garis();
        makanan("ayam ", 20000 ,"rp");
        garis();
        makanan("kopi ", 50000 ,"rp");
        garis();
        makanan("nasgor ", 70000 ,"rp");
    }
    }
