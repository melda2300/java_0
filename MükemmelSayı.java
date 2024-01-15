import java.util.Scanner;

public class MükemmelSayı {
    public static void main(String[] args) {
        Scanner imput = new Scanner(System.in);
        System.out.println("bir sayı giriniz: ");
        int sayı = imput.nextInt();
        int toyol = 0;
        for (int i = 0; i < sayı; i++) {
            if (sayı % i == 0) {
                toyol += i;
            }
        }
        if (toyol == sayı) {
            System.out.println(sayı+" Mükemmel bir sayıdır");
        } else {
            System.out.println(sayı+"Mükemmel bir sayı deyildir");
        }
    }
}
