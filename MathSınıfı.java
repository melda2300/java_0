import javax.swing.*;
import java.util.Scanner;

public class mathSinifi {
    public static void main( String[] args ) {
        Scanner scanner = new Scanner(System.in);
        int yapilacakislem, x, y;
        String yazılacakMetin;
        double z;
        baslangicMenusu(); {
            System.out.print("\n-> Yapmak İstediğiniz İşlem: ");
            yapilacakislem = scanner.nextInt();
            switch (yapilacakislem) {
                case 1:
                    x = Integer.valueOf(JOptionPane.showInputDialog("Taban Değerini Girin:"));
                    y = Integer.valueOf(JOptionPane.showInputDialog("Üs Değerini Girin:"));
                    yazılacakMetin = x + "^" + y + " işleminin sonucu " + mathPow(x, y) + "'.";
                    JOptionPane.showMessageDialog(null, yazılacakMetin, "İşlem Sonucu", JOptionPane.PLAIN_MESSAGE);
                    break;
                case 2:
                    x = Integer.valueOf(JOptionPane.showInputDialog("Karekök Alınacak Değeri Girin:"));
                    yazılacakMetin = x + " girmiş olduğunuz değerin karekök sonucu: " + mathSqrt(x);
                    JOptionPane.showMessageDialog(null, yazılacakMetin, "İşlem Sonucu", JOptionPane.PLAIN_MESSAGE);
                    break;
                case 3:
                    x = Integer.valueOf(JOptionPane.showInputDialog("Mutlak Değer Alacağınız Değer:"));
                    yazılacakMetin = "|" + x + "| Mutlak Değeri: " + mathAbs(x);
                    JOptionPane.showMessageDialog(null, yazılacakMetin, "İşlem Sonucu", JOptionPane.PLAIN_MESSAGE);
                    break;
                case 4:
                    z = Double.valueOf(JOptionPane.showInputDialog("Aşağı Yuvarlanacak Değeri Girin:"));
                    yazılacakMetin = "Girmiş Olduğunuz " + z + " değerini aşağı " + mathFloor(z) + " şeklinde yuvarladım.";
                    JOptionPane.showMessageDialog(null, yazılacakMetin, "İşlem Sonucu", JOptionPane.PLAIN_MESSAGE);
                    break;
                case 5:
                    z = Double.valueOf(JOptionPane.showInputDialog("Yukarı Yuvarlanacak Değeri Girin"));
                    yazılacakMetin = "Girmiş Olduğunuz " + z + " değerini yukarı" + mathCeil(z) + " şeklinde yuvarladım.";
                    JOptionPane.showMessageDialog(null, yazılacakMetin, "İşlem Sonucu", JOptionPane.PLAIN_MESSAGE);
                    break;
                case 6:
                    x = Integer.valueOf(JOptionPane.showInputDialog("Sorgulanacak İlk Değeri Girin:"));
                    y = Integer.valueOf(JOptionPane.showInputDialog("Sorgulanacak İkinci Değeri Girin:"));
                    yazılacakMetin = "Girmiş Olduğunuz İlk Değer: " + x + " İkinci Değer: " + y + " Bunlardan Büyük Olan " + mathMax(x, y) + " Değeridir.";
                    JOptionPane.showMessageDialog(null, yazılacakMetin, "İşlem Sonucu", JOptionPane.PLAIN_MESSAGE);
                    break;
                case 7:
                    x = Integer.valueOf(JOptionPane.showInputDialog("Sorgulanacak İlk Değeri Girin:"));
                    y = Integer.valueOf(JOptionPane.showInputDialog("Sorgulanacak İkinci Değeri Girin:"));
                    yazılacakMetin = "Girmiş Olduğunuz İlk Değer: " + x + " İkinci Değer: " + y + " Bunlardan Küçük Olan " + mathMax(x, y) + " Değeridir.";
                    JOptionPane.showMessageDialog(null, yazılacakMetin, "İşlem Sonucu", JOptionPane.PLAIN_MESSAGE);
                    break;
                case 8:
                    yazılacakMetin = "Math.Random Olarak Ürettiğim Değer: " + mathRandom();
                    JOptionPane.showMessageDialog(null, yazılacakMetin, "İşlem Sonucu", JOptionPane.PLAIN_MESSAGE);
                    break;
                default:
                    yazılacakMetin = "Hatalı Giriş Yaptınız!";
                    JOptionPane.showMessageDialog(null, yazılacakMetin, "Hatalı İşlem", JOptionPane.ERROR_MESSAGE);
                    break;
            }

        }
    }

    public static void baslangicMenusu() {
        System.out.println("------------------\n-> Java'da Math Sınıfı Örnek Kod Dizisi\n------------------\n1- Math.pow() Kullanımı\n2- Math.sqrt() Kullanımı\n3- Math.abs() Kullanımı\n4- Math.floor() Kullanımı\n5- Math.ceil() Kullanımı");
        System.out.print("6- Math.max() Kullanımı\n7- Math.min() Kullanımı\n8- Math.random() Kullanımı\n------------------");
    }

    public static int mathPow( int taban, int üs ) {
        return (int) Math.pow(taban, üs);
    }

    public static int mathSqrt( int karekök ) {
        return (int) Math.sqrt(karekök);
    }

    public static int mathAbs( int mutalk ) {
        return Math.abs(mutalk);
    }

    public static double mathFloor( double assagiyuvarla ) {
        return (int) Math.floor(assagiyuvarla);
    }

    public static double mathCeil( double yukariyuvarla ) {
        return (int) Math.ceil(yukariyuvarla);
    }

    public static int mathMax( int ilkdeger, int ikincideger ) {
        return Math.max(ilkdeger, ikincideger);
    }

    public static int mathMin( int ilkdeger, int ikincideger ) {
        return Math.min(ilkdeger, ikincideger);
    }

    public static int mathRandom() {
        return (int) (Math.random() * 10);
    }
}
