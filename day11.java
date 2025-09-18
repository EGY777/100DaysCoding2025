package pkg111;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        
        System.out.print("NAma saya : ");
        String nama =  input.nextLine();
        
        System.out.print("jurusan saya : ");
        String jurusan = input.nextLine();
        
        System.out.println("===================================");        
        System.out.println("Hello nama saya " + nama + " dan jurusan saya di unsulbar adalah " + jurusan);        
    }
    
}
