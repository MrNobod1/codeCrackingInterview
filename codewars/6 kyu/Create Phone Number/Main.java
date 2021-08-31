public class Main {
    
    public static void main(final String... args) {
        System.out.println(createPhoneNumber(new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 0}));
    }

    public static String createPhoneNumber(int[] numbers) {
        // (123) 456-7890
        return String.format("(%d%d%d) %d%d%d-%d%d%d%d",
            java.util.Arrays.stream(numbers).boxed().toArray(Object[]::new));
    }

}
