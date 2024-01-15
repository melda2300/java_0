import java.util.Scanner;
public class LokumProjesi {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        String[] isim = {"fatih", "esma"};
        String[] ders = {"mat", "türkçe", "ingilizce"};
        int[][] puan = new int[isim.length][ders.length];

        System.out.println("puan hesaplama sistemi ");
        for (int i = 0; i < isim.length; i++) {
            for (int j = 0; j < ders.length; j++) {
                System.out.print(isim[i] + " için " + ders[j] + " notunu giriniz: ");
                puan[i][j] = scr.nextInt();
            }
        }
        System.out.println("Not ortalaması:");
        for (int i = 0; i < isim.length; i++) {
            int num = 0;
            for (int a = 0; a < ders.length; a++) {
                num += puan[i][a];
            }
            double ortalama = (double) num / ders.length;
            System.out.println(isim[i] + "  : " + ortalama);
        }
        System.out.println("ders ortalaması:");
        for (int i = 0; i < ders.length; i++) {
            int num = 0;
            for (int a = 0; a < isim.length; a++) {
                num += puan[a][i];
            }
            double ortalama = (double) num / ders.length;
            System.out.println(ders[i] + "  : " + ortalama);
        }

            System.out.println("sınıf ortalaması");

        int sınıf1= 0;
        for (int i = 0; i < isim.length; i++) {
            for (int j = 0; j < ders.length; j++) {
                sınıf1 += puan[i][j];
            }
        }
        double sınıfortalaması= (double) sınıf1/(isim.length* ders.length);
        System.out.println("sınıf ortalaması: "+sınıfortalaması);
    }
}
