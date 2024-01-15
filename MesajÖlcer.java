import java.util.Scanner;
public class MesajÖlcer {
    public static void main(String[] args) {
        Scanner scr=new Scanner(System.in);
        System.out.println("mesajı yazınız:  ");
        String mesaj= scr.nextLine();
        System.out.println("sayıyı yazın");
        int mesaj1= scr.nextInt();
        double smsUzunluğu = (double) mesaj.length() / 900;
        double sayıUzunluğu = (double) String.valueOf(mesaj1).length() / 100;
        // valueOf yöntemi, String türünden veriye dönüştürmek için kullanılır.
        System.out.println("Mesaj uzunluğu: " + mesaj.length());
        System.out.println("Sayı uzunluğu: " + String.valueOf(mesaj1).length());

    }
}
