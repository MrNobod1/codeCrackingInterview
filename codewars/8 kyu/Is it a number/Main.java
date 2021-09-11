public class Main {

    public static void main(final String... args) {
        java.util.Arrays.asList("3", "  3  ", "-3.23", "3-4", "  3  5", "3 5", "zero")
            .stream().map(Main::isDigit).forEach(System.out::println);
    }

    public static boolean isDigit(String s) {
        if (s == null || s.trim().isEmpty()) return false;
        boolean isFloat = false;
        s = s.trim();
        if (s.startsWith("-")) s = s.substring(1);
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 46) if (isFloat) return false; else isFloat = true;
            else if (s.charAt(i) < 48 || s.charAt(i) > 57) return false;
        }
        return true;
    }

}