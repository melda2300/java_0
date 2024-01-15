public class numbers {
    public static void main(String[] args) {
        for (int number = 2; number <= 100; number++) {
            if (isPrime(number)) {
                System.out.println(number);
            }
        }
    }

    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false;
        }
        if (number == 2) {
            return true;
        }
        if (number % 2 == 0) {
            return false;
        }
        int limit = (int) Math.sqrt(number) + 1;
        for (int i = 3; i < limit; i += 2) {
            if (number % i == 0) {
                return false;
            }
        }
        return true;
    }
}
