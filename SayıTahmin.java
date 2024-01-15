import java.util.Scanner;
import java.util.Random;

// satırı, java.util.Random sınıfını, Random nesneleri oluşturmak ve
// bunlarla rastgele sayılar üretmek için kullanabileceğimiz anlamına gelir.
public class SayıTahmin {
    public static void main(String[] args) {

        Random random = new Random();
        //satırı, yeni bir Random nesnesi oluşturur ve bunu random değişkenine atar.
        // Random nesneleri, rastgele sayılar oluşturmak için kullanılır.
        int randomNumber = random.nextInt(10);
         // random.nextInt(10) = Bu yöntem, 0 ile 9 arasında rastgele bir tamsayı döndürür.
         // Bu sayı, randomNumber değişkenine atanır.
        Scanner scanner = new Scanner(System.in);
        System.out.println("1 ile 10 arasında bir sayı düşünüyorum. ");
        boolean found = false;
        while (!found) {
            System.out.print(" Tahmininizi girin: ");
            int userGuess = scanner.nextInt();
            if (userGuess == randomNumber) {
                System.out.println("Tebrikler! Doğru sayıyı tahmin ettiniz!");
                found = true;
            } else if (userGuess < randomNumber) {
                System.out.println("Çok düşük! Tekrar deneyin.");
            } else {
                System.out.println("Çok yüksek! Tekrar deneyin.");
            }
        }
    }
}