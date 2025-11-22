
package ea;

import java.util.Scanner;

public class NewClass2 {
    public static void main(String[] args) {
        Scanner u = new Scanner(System.in);
        System.out.print("masukan nama 1 = ");
        String nama1 = u.nextLine();
        System.out.print("Masukan nama 2 = ");
        String nama2 = u.nextLine();
        System.out.print("Masukan kalimat jika perlu = ");
        String kalimatisi = u.nextLine();
        System.out.print("Masukan kalimat jika perlu = ");
        String kalimatkososng = u.nextLine();
        
        //1. equals()
        System.out.println("1.equals()");
        if(nama1.equals(nama2)){
            System.out.println("equals() = nama sama persis");
            
      }else{
            System.out.println("equalse() = nama tdk sama");
            
            //2.equalsIgnoreCase()
            System.out.println("2.equalsIgnoreCase()");
            if (nama1.equalsIgnoreCase(nama2)) {
                System.out.println("equalsIgnoreCase() = nama sama ");
            } else {
                System.out.println("equalsIgnoreCase() = nama tdk sama");
                 //3.contains()
                    System.out.println("3.contains()");
                    if (kalimatisi.contains(kalimatkososng)) {
                        System.out.println("contains() = kalimat kata pertama");  
                    }else{
                        System.out.println("contains() = kalimat tdk mengandung kata pertama");
                //4.isEmpty
                System.out.println("3.isEmpty()");
                if (kalimatkososng.isEmpty()) {
                    System.out.println("isEmpty() = kalimat kosong");
                }else{
                    System.out.println("isEmpty() = kalimat terisi ");
                   
                    }
                }
            }
        }
         
    }
}
