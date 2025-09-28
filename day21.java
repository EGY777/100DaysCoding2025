package day021;
public class Day021 {
    public static void main(String[] args) {
        int a = 50;
        int b = 40;
        
        System.out.println("====nilai variabel sebelum ditukar=====");
        System.out.println("A = "+a);
        System.out.println("B = "+b);
        
        
        a = a + b;
        b = a - b;
        a = a - b;
        
        System.out.println("=======nilai variabel setelah ditukar=======");
        System.out.println("A = "+a);
        System.out.println("b = "+b);
        
    }
    
}
