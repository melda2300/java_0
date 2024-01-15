import java.util.Scanner;
public class BurcBulma {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.print("doğum ayınızı giriniz: ");
        int ay = scr.nextInt();
        System.out.print("dogum gününüzü: ");
        int DoğumGünü = scr.nextInt();
        if (ay > 1 && ay < 12) {
            if (ay == 1) {
                if (DoğumGünü <= 21) {
                    System.out.println("Burcunuz : oğlak");
                } else {
                    System.out.println("Burcunuz : kova");
                }
            }
        } else {
            System.out.println("hatalı tarih yada gün girdiniz");
        }
        if (ay == 2) {
            if (DoğumGünü <= 19) {
                System.out.println("Burcunuz : kova");
            } else {
                System.out.println("Burcunuz : balık");
            }

        }
        if (ay == 3) {
            if (DoğumGünü <= 20) {
                System.out.println("Burcunuz : balık");
            } else {
                System.out.println("Burcunuz : Koc");
            }
        }
        if (ay == 4) {
            if (DoğumGünü <= 21) {
                System.out.println("Burcunuz :koc");
            } else {
                System.out.println("Burcunuz :boğa");
            }
        }
        if (ay == 5) {
            if (DoğumGünü <= 21) {
                System.out.println("Burcunuz :boğa");
            } else {
                System.out.println("Burcunuz : ikizler");
            }
        }
        if (ay == 6) {
            if (DoğumGünü <= 22) {
                System.out.println("Burcunuz :ikizler");
            } else {
                System.out.println("Burcunuz :yengeç");
            }
        }
        if (ay == 7) {
            if (DoğumGünü <= 22) {
                System.out.println("Burcunuz :yengec");
            } else {
                System.out.println("Burcunuz :aslan");
            }
        }
        if (ay == 8) {
            if (DoğumGünü <= 22) {
                System.out.println("Burcunuz :aslan");
            } else {
                System.out.println("Burcunuz :başak");
            }
        }
        if (ay == 9) {
            if (DoğumGünü <= 22) {
                System.out.println("Burcunuz :başak");
            } else {
                System.out.println("Burcunuz :terazi");
            }
        }
        if (ay == 10) {
            if (DoğumGünü <= 22) {
                System.out.println("Burcunuz :terazi");
            } else {
                System.out.println("Burcunuz :akrep");
            }
        }
        if (ay == 11) {
            if (DoğumGünü <= 21) {
                System.out.println("Burcunuz :akrep");
            } else {
                System.out.println("Burcunuz :yay");
            }
        }

        if (ay == 12) {
            if (DoğumGünü <= 21) {
                System.out.println("Burcunuz :yay");
            } else {
                System.out.println("Burcunuz :oğlak");
            }
        }
    }
}
