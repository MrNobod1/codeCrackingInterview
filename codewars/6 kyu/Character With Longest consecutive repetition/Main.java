import java.util.Arrays;

public class Main {

    public static void main(final String... args) {
        System.out.println(Arrays.toString(longestRepetition("")));
    }

    public static Object[] longestRepetition(String s) {
        if (s.length() == 0) return new Object[]{"", 0};
        int max = 0,
            cont = 1;
        char characterMax = 'a';
        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i - 1) == s.charAt(i)) {
                cont++;
            } else {
                if (cont > max) {
                    max = cont;
                    characterMax = s.charAt(i - 1);
                }
                cont = 1;
            }
        }
        if (cont > max) {
            max = cont;
            characterMax = s.charAt(s.length()-1);
        }
        return new Object[]{""+characterMax, max};
    }

}