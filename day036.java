package javaapplication41;

import java.util.Scanner;

public class JavaApplication41 {
    public static void main(String[] args) {
        Scanner u = new Scanner(System.in);
        System.out.print("MAsukan nama = ");
        String nama = u.nextLine();
        System.out.print("Masukan umur = ");
        int um = u.nextInt();
        
        if (nama.equalsIgnoreCase("Muh Egy Saputra Bali")){
            if (um>= 17){
                System.out.println("betul nama kamu "+ nama + " dan umur mu betul ");
            }else if (um<=17){
                System.out.println("salah kamu bukan "+nama);
            }else{
                System.out.println("eror kamu orng asing");
            }
        }
    }
    
}
