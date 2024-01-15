import java.util.Scanner;
public class Taximeter {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("KM verisini giriniz; ");
        double km = scn.nextInt();
        double price = 10 + (km * 3);
// price değişkenine, 10 + (5 * 2.30) hesaplamasının sonucu atanır.
// Bu, toplam fiyatın hesaplanması için kullanılan değerlerdir
        if (price < 20) {
            price = 20;
        }
            System.out.print("taksimetre; " + price);
    }
}

