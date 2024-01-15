public class Üçgenyapımı {
    public static void main(String[] args) {
        // Ters üçgen
        int satırlar = 10;
        for (int i = 0; i <= satırlar; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" ");
            }
            for (int k = 0; k <= satırlar - 1 - i; k++) {
                System.out.print("*" + " ");
            }
            System.out.println();
        }
        // kare
        int satır1 = 10;
        for (int i = 0; i <= satır1; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            for (int k = 0; k <= satır1-i; k++) {
                System.out.print("*" + "");
            }
            System.out.println();
        }
    }
}
