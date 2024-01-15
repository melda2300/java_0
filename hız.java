import java.util.Scanner;

public class hız {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        int yol;
        int saat;
        System.out.print("yol mesafesini giriniz (KM)");
        yol = scr.nextInt();
        System.out.print("gitmek istediğiniz süreyi giriniz: ");
        saat = scr.nextInt();

        System.out.println("Gitmeniz gereken ortalama hız = " + (yol / saat) + "km/s dir.");
    }
}

