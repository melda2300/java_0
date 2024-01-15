import java.util.Scanner;

public class KuvvetBulan {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.print(" x in değerini giriniz: ");
        int x = scr.nextInt();

        System.out.print(" y nin değerini giriniz:");
        int y = scr.nextInt();
        // i =i;i+=n  ="i" değerleri "y" değerinin küçük veya eşit olana kadar yazdırılacaktır.
        for (int i = 1; i <= y; i += x) {
            System.out.println(i);
        }
    }
}
