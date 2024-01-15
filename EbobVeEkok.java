import java.util.Scanner;

public class EbobVeEkok {
    public static void main(String[] args) {
        int a, b, i, max, min;
        int Ebob = 1, Ekok = 1;
        Scanner sayı = new Scanner(System.in);
        System.out.println("EBOB ve EKOK hesabı");
        System.out.print("İlk değeri giriniz = ");
        a = sayı.nextInt();
        System.out.print("İkinci değeri giriniz = ");
        b = sayı.nextInt();
        max = Math.max(a, b);
        min = Math.min(a, b);
        for (i = max; i >= min; i--) {
            if ((min % i == 0) && (max % i == 0)) {
                Ebob = Ebob * i;
            }
            Ekok = (a * b) / Ebob;
        }
        System.out.println("EBOB = " + Ebob );
        System.out.println("EKOK = " + Ekok );
    }
}