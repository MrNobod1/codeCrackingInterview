public class Main {
    
    public static void main(final String... args) {
        java.util.stream.Stream.of(args).map((String s) -> digPow(Integer.parseInt(s.split(",")[0]), Integer.parseInt(s.split(",")[1]))).forEach(System.out::println);
    }

    public static long digPow(int n, int p) {
        java.util.List<Integer> integerList = transformToList(n);
        int len[] = new int[] { integerList.size()-1 };
        long r = integerList.stream().mapToLong((Integer i) -> (long) Math.pow((double ) i, (double) (p + len[0]--))).sum();
        return r % n == 0 ? r / n : -1;
    }

    public static java.util.List<Integer> transformToList(int n) {
        java.util.List<Integer> integerList = new java.util.ArrayList<>();
        while (n > 0) {
            integerList.add(n % 10);
            n /= 10;
        }
        return integerList;
    }

}
