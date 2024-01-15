import java.util.Scanner;

public class OddAndEven {
    public static void main(String[] args) {
        int i, se = 0, sod = 0;
        int[] arr = new int[5];
        Scanner sc = new Scanner(System.in);
        System.out.print("5 Sayı Girin :");
        for (i = 0; i < 5; i++) {
            arr[i] = sc.nextInt();
        }
        for (i = 0; i < 5; i++) {
            if (arr[i] % 2 == 0) {
                se = se + arr[i];
            } else {
                sod = sod + arr[i];
            }
        }
        System.out.print("\nÇift Sayılar : " + se);
        System.out.print("\nTek Sayılar : " + sod);
    }
}
