
package pkg12;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
                String nama, nim;
                String hoby;
                int umur;
                float tinggi;
                
                
                System.out.print("Nama : ");
                nama = input.nextLine();
                System.out.print("Nim : ");
                nim = input.nextLine();
                System.out.print("hoby : ");
                hoby = input.nextLine();
                System.out.print("umur : ");
                umur = input.nextInt();
                System.out.print("tinngi : ");
                tinggi = input.nextFloat();
              
                
                
             System.out.println("=======================================================");
             System.out.println(" hello nama saya " + nama + " dan nim saya di unsulbar "+ nim + " saya berumur " + umur + "th.");
             System.out.println("dan tinggi badan saya " + tinggi + " dan adapun hoby saya " + hoby);

    }
    
}
