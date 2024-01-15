import java.util.Scanner;
public class Single_or_Even {
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
        System.out.print("Sayıyı giriniz: " );
        int sayı= scr.nextInt();

        for (int i = 1; i <= sayı; i++) {
            if (i % 2 == 0) {
                System.out.println("Çift sayılar: " + i + ".");
            } else {
                System.out.println("Tek sayılar: " + i + ".");

            }
        }
    }
}
