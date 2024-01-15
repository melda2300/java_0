import java.util.Scanner;
public class ManavSepet {
    public static void main(String[] args) {
        Scanner scr = new Scanner(System.in);
        System.out.print("hangi meyveden alırdınız ");
        String meyve = scr.next();
        System.out.println("kac klo peki:");
        double kilo = scr.nextDouble();
        double muz = (5.12 * kilo);
        double çilek = (15 * kilo);
        if (meyve.equalsIgnoreCase("muz")) {
            System.out.println("tutar= " + muz);
        } else if (meyve.equalsIgnoreCase("çilek")) {
            System.out.println("tutar= " + çilek);
        } else if (meyve.equalsIgnoreCase("muz ve çilek")) {
            System.out.println("tutar= " + (muz + çilek));
        } else {
            System.out.println("hatalı meyve girdiniz");
        }
    }
}
