public class recursive {
    public static void main(String[] args) {
        int a = 100;
        recursiveFunction(a);
    }

    public static void recursiveFunction(int a) {
        while (true) {
            if (a > 0 && a < 10) {
                System.out.println(a);
                return;

            }
            if (a < 10) {
                a += 10;
                break;
            }
            System.out.println(a);
            a = a - 10;
        }
    }
}
