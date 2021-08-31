
public class Main {
    
    public static final String NO_NAMES = "no one likes this";

    public static final String INDIVIDUAL_LIKE_MESSAGE = " likes this";

    public static final String LIKE_MESSAGE = " like this";

    public static final String OTHERS_APPEND = " and %d others";

    public static void main(final String... args) {

    }

    public static String whoLikeThis(String... names) {
        if (names.length == 0) return NO_NAMES;
        if (names.length == 1) return names[0] + INDIVIDUAL_LIKE_MESSAGE;
        String result = "";
        if (names.length >= 4) {
            result = String.join(", ", new String[]{ names[0], names[1] }) + String.format(OTHERS_APPEND, names.length - 2) + LIKE_MESSAGE;
        } else {
            result = String.join(", ", names) + LIKE_MESSAGE;
            int temp = result.lastIndexOf(",");
            result = result.substring(0, temp) + " and" + result.substring(temp+1);
        }
        return result;
    }

}