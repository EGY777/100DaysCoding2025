package array;
public class NewClass {
    public static void main(String[] args) {
        int [] a = {10,15,20,25,30,35};
        int tot = 0;
        
        for (int i = 0; i < a.length; i++) {
            tot += a[i];
        }
        System.out.println("jumlah elemen array = "+tot);
    }
  
}
