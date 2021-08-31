public class Main {
    
    public static void main(final String... args) {
        java.util.stream.Stream.of(args).map(Long::parseLong).map((Long l) -> l + " -> " + persistence(l.longValue())).forEach(System.out::println);
    }

    public static int persistence(long n) {
        int result = 0;
        while (n >= 10) {
            n = mutliplyEachDigit(n);
            result++;
        }
        return result;
    }

    public static long mutliplyEachDigit(long n) {
        long r = 1L;
        while (n > 0) {
            long temp = n % 10;
            n /= 10;
            r *= temp;
        }
        return r;
    }

}
