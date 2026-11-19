public record primenubers(public class PrimeNumbers {

    public static boolean isPrime(int n) {
        if (n < 2) {
            return false;
        }
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        int count = 0;
        for (int number = 0; number <= 500; number++) {
            if (isPrime(number)) {
                System.out.printf("%4d", number);
                count++;
                if (count % 10 == 0) {
                    System.out.println();
                }
            }
        }
        System.out.println();
    }
}
) {
}
