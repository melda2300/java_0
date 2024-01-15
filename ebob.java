public class ebob {
    public static void main(String[] args) {
        int n1 = 27, n2 = 153, ebob = 1;

        for (int i = 1; i <= n1 && i <= n2; ++i) {
            if (n1 % i == 0 && n2 % i == 0)
                ebob = i;
        }

        System.out.printf("%d ve %d sayılarının EBOB'u %d", n1, n2, ebob);

    }

}
