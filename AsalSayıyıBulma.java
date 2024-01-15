import java.util.Scanner;
public class AsalSayıyıBulma {
    public static void main(String[] args) {
        int i, s, j, p;
        int[] arr = new int[4];
        Scanner sc = new Scanner(System.in);
        System.out.print("Dizi Uzunluğu Girin :");
        s = sc.nextInt();
        System.out.print("Dizi Elamanlarını Girin :");
        for (i = 0; i < s; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("Dizideki tüm asal sayılar :");
        for (i = 0; i < s; i++) {
            j = 2;
            p = 1;
            while (j < arr[i]) {
                if (arr[i] % j == 0) {
                    p = 0;
                    break;
                }
                j++;
            }
            if (p == 1) {
                System.out.println(", " + arr[i]);
            }
        }
    }
}
