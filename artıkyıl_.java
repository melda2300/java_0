import java.util.Scanner;

public class artıkyıl_ {
    public static boolean isLeapYear(int year) {

        return ((year % 4 == 0) && (year % 100 != 0)) || (year % 400 == 0);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Yıl Giriniz: ");
        int year = scanner.nextInt();

        if (isLeapYear(year)) {
            System.out.println(year + " artık yıldır.");
        } else {
            System.out.println(year + " artık yıl değildir.");
        }

        scanner.close();
    }
}
