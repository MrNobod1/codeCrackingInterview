public class Main {

    public static void main(final String... args) {
        java.util.Arrays.asList("45385593107843568", "509321967506747", "366058562030849490134388085")
            .stream().map(Main::fakeBin).forEach(System.out::println);
    }

    public static String fakeBin(String numberString) {
        return numberString.chars()
            .map(Character::getNumericValue)
            .mapToObj((int i) -> i < 5 ? "0" : "1")
            .collect(java.util.stream.Collectors.joining(""));
    }

}