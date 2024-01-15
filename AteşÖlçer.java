import java.util.Scanner;
public class AteşÖlçer {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.print("ateşi girimiz: ");
       int x = scr.nextInt();
        if (x >= 36 && x <= 38) {
            System.out.println("atesin normal. " + x);
        } else if (x >= 38 && x <= 39) {
            System.out.println("Hafif ateş: " + x);
        } else if (x >= 39 && x <= 39) {
            System.out.println("Orta yüksek ateş: " + x);
        } else if (x >= 40 && x <= 40) {
            System.out.println(" Yüksek ateş:" + x);
        } else if (x >= 40) {
            System.out.println("Çok yüksek ateş " + x);
        }else {
            System.out.println("hatakı giriş");
        }
    }
}
