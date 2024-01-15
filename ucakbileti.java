import java.util.Scanner;
public class ucakbileti {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Mesafe Giriniz (KM): ");
        int distance = scanner.nextInt();
        System.out.println("Yaş Giriniz: ");
        int age = scanner.nextInt();
        System.out.println("Yolculuk Tipi Giriniz (1: Tek Yön, 2: Gidiş-Dönüş): ");
        int tripType = scanner.nextInt();
        if (distance <= 0 || age <= 0 || (tripType != 1 && tripType != 2)) {
            System.out.println("Hatalı Veri Girdiniz !");
            scanner.close();
            return;
        }

        double ticketPrice = distance * 0.10;
        if (age <= 12) {
            ticketPrice -= ticketPrice * 0.50;
        } else if (age >= 13 && age <= 24) {
            ticketPrice -= ticketPrice * 0.10;
        } else if (age >= 65) {
            ticketPrice -= ticketPrice * 0.30;
        }
        if (tripType == 2) {
            ticketPrice -= ticketPrice * 0.20;
        }
        System.out.println("Toplam Bilet Fiyatı: " + ticketPrice + " TL");
    }
}