package ea;
import java.util.Scanner;
public class Ea {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        String[] huruf = {"a", "i", "u", "e", "o"};
        
        System.out.print("Cari : ");
        String b = in.nextLine();
        boolean sta = false;
        for (String n : huruf {
            if(n.equalsIgnoreCase(b)){
                sta = true;
                break;
            }
        }
        if(sta) {
                System.out.println("tersedia");
        }else{
            System.out.println("tidak tersedia");
        }
    }
}
