import java.util.Scanner;
public class Hesep_Makinesi {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.print("Birinci sayıyı giriniz: ");
        int sayı1 = scr.nextInt();
        System.out.print("İkinci sayıyı giriniz:  ");
        int sayı2 = scr.nextInt();

        System.out.println("1. İŞLEM SECİNİZ ");
        System.out.println("2. Toplama ");
        System.out.println("3. Cıkarma");
        System.out.println("4. Bölme ");
        System.out.println("5. Çarpma ");
        System.out.println("6. İşleminiz sonlandırılsın mı.");
        int buton = scr.nextInt();
        if (buton == 1){
            System.out.println("toplam : " + (sayı1 + sayı2));
        } else if (buton == 2){
            System.out.println("çıkarma : " + (sayı1 - sayı2));
        } else if (buton == 3){
            System.out.println("bölme : " + (sayı1 / (double) sayı2));
        } else if (buton == 4){
            System.out.println("çarpma : " + (sayı1 * sayı2));
        } else if (buton == 5){
            System.out.println("İşlem sonlandırıldı");
        } else {
            System.out.println("Hatalı giriş yaptınız. Tekrar deneyiniz.");
        }

    }
}

