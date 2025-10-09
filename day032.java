package day000;
public class Day000 {
    public static void main(String[] args) {
        int umur = 16;
        boolean lolos = true;
        
        // menggunakan operator OR (||) dalam if-else
        if (umur >= 18 || lolos){
            System.out.println("anda lolos pendaftaran");
        } else {
            System.out.println("anda tidak lolos pendaftaran");
        }
    }
    
}
