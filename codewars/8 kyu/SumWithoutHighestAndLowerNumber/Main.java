public class Main {

    public static void main(final String... args) {
        System.out.println("Hello world");
    }

    public static int sum(int[] numbers) {
        return numbers == null || numbers.length <= 1 ? 0 : 
            numbers.length == 2 && numbers[0] == numbers[1] ? numbers[0] : 
                java.util.Arrays.stream(numbers).sum() - java.util.Arrays.stream(numbers).min().getAsInt() - java.util.Arrays.stream(numbers).max().getAsInt();
    }

}