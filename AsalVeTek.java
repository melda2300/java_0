import java.util.Scanner;
public class AsalVeTek {
    public static void main(String[] args) {
        int i=0;
         int num = 0;
         int num1 = 0;
        int[] arr = new int[4];
        Scanner sc = new Scanner(System.in);
        System.out.print("4 Sayı Girin :");
        for (i = 0; i < 4; i++) {
            arr[i] = sc.nextInt();
        }
        for (i = 0; i < 4; i++) {
            if (arr[i] % 2 == 0) {
                num = num + arr[i];
            } else {
                num1 = num1 + arr[i];
            }
        }
        System.out.print("\nÇift Sayılar :" + num);
        System.out.print("\nTek Sayılar :" + num1);
    }
}
