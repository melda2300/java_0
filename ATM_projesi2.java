import java.util.Scanner;
public class ATM_projesi2 {
    public static void main(String[] args) {
        int bakiye = 1000;
        Scanner scr = new Scanner(System.in);
        System.out.println("merhabalar güncel bakiyeniz:" + bakiye + "TL");


        while (bakiye > 0) {
            System.out.println("1. para yatır");
            System.out.println("2. para cek");
            System.out.println("3. bakiye sorgula");
            System.out.println("4. cıkış yap");
            System.out.print(" yapmak istediğiniz secimi yapınız: ");
            bakiye = scr.nextInt();

            if (bakiye == 1) {
                System.out.print("yatırmak isyediğiniz bakiyeniz:");
                bakiye = scr.nextInt();
                bakiye += bakiye;
            } else if (bakiye == 2) {
                System.out.print("ne kadar cekmek istiyorsunuz: ");
                bakiye = scr.nextInt();
                if (bakiye > bakiye) {
                    System.out.println("yetersiz bakiye ");
                } else {
                    bakiye-= bakiye;
                }
            } else if (bakiye == 3) {
                System.out.println("bakiyeniz"+ bakiye + "TL");
            } else if (bakiye == 4) {
                System.out.println("gecersiz bir işlem girdiniz");
                break;
            }
        }
        System.out.println("tekrar bekleriz");

    }
}

