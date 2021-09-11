public class Main {

    public static void main(final String... args) {
        System.out.println("Hello world");
    }

    public static String toAlternativeString(String string) {
        return string.chars()
            .map((int i) -> Character.isLowerCase(i) ? Character.toUpperCase(i) : Character.toLowerCase(i))
            .mapToObj(Character::toString)
            .collect(java.util.stream.Collectors.joining());
    }

}