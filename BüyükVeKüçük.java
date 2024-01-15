import java.util.Scanner;

public class BüyükVeKüçük {
    public static void main(String[] args) {
        int enBuyuk = 0;
        int enKucuk = 0;
        int[] liste = new int[6];
        Scanner imput = new Scanner(System.in);
        System.out.println("6 sayı giriiz: ");
        for (int i = 0; i < liste.length; i++) {
            liste[i] = imput.nextInt();
        }
        enBuyuk = liste[0];
        enKucuk = liste[0];
        for (int i = 0; i < liste.length; i++) {
            if (enBuyuk < liste[i]) {
                enBuyuk = liste[i];
            }
            if (enKucuk > liste[i]) {
                enKucuk = liste[i];
            }
        }
        System.out.print("En Büyük Öğe :" + enBuyuk);
        System.out.print("\nEn Küçük Öğe :" + enKucuk);


    }
}
