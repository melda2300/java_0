import java.util.Scanner;

public class Kütüphane {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.print("Hoşgeldiniz kitaplara bakmak iistermisiniz:");
        String kitap = scr.next();
        if (kitap.equalsIgnoreCase("evet")) {
            System.out.println(" elimizde ki kitaplar bunlar ; ");
            String[] aksiyon = {"acımasızlar", "Rönesans", "Ateşin Şarkısı"};
            String[] roman = {"bal porsuğu", "vade turtası ", " ince memed 1"};
            String[] fanatik = {"Cennet", "Kraliçelerin Laneti", "pas"};
            System.out.println("roman olarak =" + roman[0] + " , " + roman[1] + " , " + roman[2]);
            System.out.println("aksiyon olarak = " + aksiyon[0] + " , " + aksiyon[1] + " , " + aksiyon[2]);
            System.out.println("fantastik olarak =" + fanatik[0] + " , " + fanatik[1] + " , " + fanatik[2]);
            System.out.print("istediğiniz kitabı giriniz :");
            String kitap2 = scr.next();
            for (int i = 0; i < aksiyon.length; i++) {
                if (kitap2.equalsIgnoreCase(aksiyon[i])) {
                    System.out.println("aksiyon rafının = " + i + ". sırada");
                    break;
                } else {
                    System.out.println("bulunamadı ");
                    break;
                }
            }
            for (int x = 0; x < roman.length; x++) {
                if (kitap2.equalsIgnoreCase(roman[x])) {
                    System.out.println("roman rafının = " + x + ". sırada");
                    break;
                } else {
                    System.out.println("bulunamadı ");
                    break;
                }
            }
            for (int y = 0; y < fanatik.length; y++) {
                if (kitap2.equalsIgnoreCase(fanatik[y])) {
                    System.out.println("fantastik rafının = " + y + ". sırada");
                    break;
                } else {
                    System.out.println();
                    break;
                }
            }


        } else if (kitap.equalsIgnoreCase("hayır")) {
            System.out.println("cıkış işlemleri başlatılıyor.....");


        } else {
            System.out.println("Geçersiz yanıt!");

        }
    }
}