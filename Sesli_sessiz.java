// sesli - sessiz harfleri ayıştırma
import java.util.Scanner;
public class Sesli_Sessiz {
    public static void main(String[] args) {
        char[] incesesli = {'i', 'e', 'ö', 'ü'};
        char[] kalınsesli = {'ı', 'a', 'o', 'u'};
        Scanner imput = new Scanner(System.in);
        System.out.print("harf girin = ");
        char harf = imput.nextLine().charAt(0);
        if (Character.isLetter(harf)) {
            for (int b = 0; b < incesesli.length; b++) {
                if (harf == incesesli[b]) {
                    System.out.println("ince sesli = " + harf);
                    break;
                }
            }
            for (int d = 0; d < kalınsesli.length; d++) {
                if (harf == kalınsesli[d]) {
                    System.out.println("kalın sesli = " + harf);
                    break;
                }
            }
        } else {
            System.out.println("hatalı giriş");
        }
    }
}

