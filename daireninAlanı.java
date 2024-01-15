import java.util.Scanner;

public class daireninAlanı {
    public static void main(String[] args) {
        int r;
        double pi = 3.14;
        Scanner imp = new Scanner(System.in);
        System.out.println("Dairenin yarı capını giriniz:");
        r = imp.nextInt();
        double alan = pi * r * r;
        double cevre = 2 * pi * r;

        System.out.println("alanı:"+alan);
        System.out.println("cevresi:"+cevre);
    }
}
