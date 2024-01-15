import java.util.Scanner;
public class ücgenler {
    public static void main(String[] args) {
        int bkenar,ikenar;
        double hipo;
        Scanner input= new Scanner(System.in);
        System.out.print("Birinci Kenarı Giriniz:");
        bkenar=input.nextInt();
        System.out.print("İkinci Kenarı Giriniz:");
        ikenar=input.nextInt();
        hipo =Math.sqrt((bkenar*bkenar)+(ikenar*ikenar));
        //Bu kod, ipo hesaplamak için bokenar ve ikenar değerlerini kullanır.
        // Sonuç, hesaplanan ipo uzunluğu olarak verilir.
        System.out.println("Üçgenin hipotenüsü: "+hipo);
        double cevre=bkenar+ikenar+hipo;
        double alan= (double) (bkenar * ikenar) /2;
        System.out.println("Üçgenin çevresi:"+cevre);
        System.out.println("Üçgenin alanı:"+alan);

    }
}
