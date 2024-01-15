import java.util.Scanner;
public class ÜstSayı {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.print("üstü alınacak sayıyı giriniz: ");
        int sayı = scr.nextInt();

        System.out.print("üstü giriniz: ");
        int üst = scr.nextInt();
        int sonuc = 1;

        int i = 1;
        while (i <= üst) {
            sonuc *= sayı;
            i++;

        }
        System.out.print("sonuç= " + sonuc);


    }
}
