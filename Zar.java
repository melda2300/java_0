import java.util.Scanner;

// zarın 6 kösesi kac defa gelir onu heseplama
public class Zar {
    public static void main(String[] args) {
        int[] zar = new int[6];
        Scanner scanner = new Scanner(System.in);
        System.out.print("kac defa zar atılsın sayıyı giriniz = ");
        int zar1 = scanner.nextInt();
        for (int a = 0; a < zar1; a++) {
            int ks = (int) (Math.random() * 6);
            zar[ks]++;
        }
        for (int b = 1; b < zar.length; b++) {
            System.out.println("zar " + b + " = " + zar[b] + " defa geldi");
        }
    }
}
