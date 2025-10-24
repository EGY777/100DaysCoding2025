package ya;
import java.util.Scanner;
public class Ya {
    public static void main(String[] args) {
        Scanner u = new Scanner(System.in);
        System.out.println("Masukan angka (1-7) untuk menentukan hari ");
        System.out.print("Masukan angka : ");
         int hari = u.nextInt();
         
         switch (hari){
             case 1:
                 System.out.println("Hari senin");
                 break;
             case 2:
                 System.out.println("Hari selasa");
                 break;
             case 3:
                 System.out.println("Hari rabu");
                 break;
             case 4:
                 System.out.println("hari kamis");
                 break;
             case 5:
                 System.out.println("Hari jumat");
                 break;
             case 6:
                 System.out.println("Hari sabtu");
                 break;
             case 7:
                 System.out.println("Hari minggu");
                 break;
           default:
               System.out.println("Angka yang anda masukan valid karna bukan 1-7");
           }      
         }
    }
    
