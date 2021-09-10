public class Main {

    public static void main(final String... args) {

    }

    public static String findNeedle(Object[] haystack) {
        for (int i = 0; i < haystack.length; i++)
            if (haystack[i] != null && haystack[i] instanceof java.lang.String && "needle".equals((String) haystack[i]))
                return String.format("found the needle at position %d", i); 
        return null;
    }

}