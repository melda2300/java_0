import java.util.Scanner;
public class tek_Mİ {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int sayac = 0;
        int[] dizi = new int[10];
        int[] tek = new int[10];

        for (int i = 0; i < 10; i++) {
            System.out.print("Dizinin " + (i + 1) + ". elemanını giriniz: ");
            dizi[i] = scan.nextInt();
            if (dizi[i] % 2 == 1) {
                tek[sayac] = dizi[i];
                sayac++;
            }
        }
        System.out.println("Tek sayılar");
        for (int i = 0; i < sayac; i++) {
            System.out.println("Tek sayilar = " + tek[i]);
        }
    }
}