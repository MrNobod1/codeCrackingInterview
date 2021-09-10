// https://www.quora.com/Whats-the-best-algorithm-to-check-if-a-number-is-prime
public class Main {

    public static void main(final String... args) {

    }

    public static boolean isPrime(int num) {
        if (num <= 1)
            return false;
        int max = (int) Math.sqrt((double) num);
        for (int i = 2; i <= max; i++) {
            if (num % i == 0)
                return false;
        }
        return true;
    }

}
