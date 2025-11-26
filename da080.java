import java.util.Scanner;

public class Day80 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan jumlah elemen array: ");
        int n = input.nextInt();

        int[] data = new int[n];

        System.out.println("\nMasukkan elemen array:");
        for (int i = 0; i < n; i++) {
            System.out.print("Elemen ke-" + (i + 1) + ": ");
            data[i] = input.nextInt();
        }

        System.out.println("\nIsi Array:");
        for (int i = 0; i < n; i++) {
            System.out.println("data[" + i + "] = " + data[i]);
        }
    }
}
