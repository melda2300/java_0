public class düzüçgen6 {
    public static void main(String[] args) {
        int n = 5;
        for (int a = 1; a <= n; a++) {
            for (int b = 1; b <= (n-a); b++) {
                System.out.print(" ");
            }
            for (int c = 1; c <= (2 * a)-a; c++) {
                System.out.print(" *");
            }
            System.out.println();
        }
    }
}
