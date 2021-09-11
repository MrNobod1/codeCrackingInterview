import java.util.Map;
import java.util.HashMap;

public class Main {

    public static final Map<Character, Integer> fromHexToDecimal = new HashMap<>(){{
        put('A', 10);
        put('B', 11);
        put('C', 12);
        put('D', 13);
        put('E', 14);
        put('F', 15);
    }};

    public static void main(final String... args) {
        java.util.Arrays.asList("1", "a", "10", "FF", "-C")
            .stream().map(Main::hexToDec).forEach(System.out::println);
    }

    public static int hexToDec(final String hex) {
        String hexString = hex;
        if (hexString == null || hexString.trim().isEmpty()) return 0;
        int multiplier = 1,
            r = 0;
        if (hexString.startsWith("-")) {
            hexString = hexString.substring(1);
            multiplier *= -1;
        }
        for (int i = 0; i < hexString.length(); i++) {
            r += (Character.isDigit(hexString.charAt(i)) ? 
                Character.getNumericValue(hexString.charAt(i)) : 
                fromHexToDecimal.get(Character.toUpperCase(hexString.charAt(i)))) * (int) Math.pow(16, hexString.length()-1-i);
        }
        return r * multiplier;
    }

}