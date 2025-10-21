package pkg044;
import java.util.Scanner;
public class Main { 
    public static void main(String[] args) {
         Scanner u = new Scanner(System.in);
         int nilai;
         System.out.print("masukan angka : ");
         nilai = u.nextInt();
         
         if (nilai >=85 && nilai <=100){
         
             System.out.print("nila anda : A  ");
         
         }else if (nilai >=70 && nilai <=84){
             System.out.print("nilai anda : B  ");
         }else if (nilai >=55 && nilai <=69){
             System.out.print("nilai anda : C  ");
         }else if (nilai >=40 && nilai <=54){
             System.out.print("nilai anda  : D  ");
         }else if (nilai >=0 && nilai <=39){
              System.out.print("nilai anda : E  ");
         }else{
             System.out.println("Eror ");
         }
    }
         
         
         
    }
