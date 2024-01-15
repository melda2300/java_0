import java.util.Scanner;
public class MaxVeMinListe {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Kaç adet sayı gireceksiniz: ");
        int n = scanner.nextInt();
        int[] list = new int[n];
        for (int i = 0; i < n; i++) {
            System.out.print((i + 1) + ". sayıyı giriniz: ");
            list[i] = scanner.nextInt();
        }
        int min = list[0];
        int max = list[0];

        for (int i : list) {
            if (i < min) {
                min = i;
            }
            if (i > max) {
                max = i;
            }
        }
        System.out.println("Minimum Değer: " + min);
        System.out.println("Maximum Değer: " + max);
    }
}
