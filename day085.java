package king;
public class King {
    public static void main(String[] args) {
        int [] angka = {10,30,20,1,80,50};
        int max = angka[0];
        for (int i = 0; i < angka.length; i++) {
            if (angka[i] > max) {
                max = angka[i];
            }
        }
        System.out.println("Nilai maxsimal : " + max);
    }
}
