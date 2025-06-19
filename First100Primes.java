public class First100Primes {
    public static void main(String[] args) {
        int count = 0;    // Number of primes found
        int number = 2;   // Number to test for primality

        while (count < 100) {
            if (isPrime(number)) {
                System.out.println(number);
                count++;
            }
            number++;
        }
    }

    // Helper method to check if a number is prime
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        if (n == 2) return true;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }

        return true;
    }
}
