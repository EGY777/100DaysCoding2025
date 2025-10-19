package solo;
import java.util.Scanner;
public class Solo {
    public static void main(String[] args) {
        Scanner u = new Scanner(System.in);
        System.out.println("=============MENGHITUNG GAJi BERSIH=============");
        System.out.print(" Masukan gaji pokok \t= ");
        double p = u.nextDouble();
        
        System.out.print(" Masukan gaji tunjangan = ");
        double t = u.nextDouble();
        
        System.out.print(" Masukan potongan gaji \t= ");
        double po = u.nextDouble();
        
        double b = p + t - po;
        
        System.out.println("================================================");
        System.out.println(" gaji pokok \t= " + p);
        System.out.println(" gaji tunjangan = " + t);
        System.out.println(" potongan gaji \t= " + po);
        System.out.println("================================================");
        System.out.println(" gaji bersih \t= " + b);
        
    }
    
}
