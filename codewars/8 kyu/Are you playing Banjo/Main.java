public class Main {

    public static void main(final String... args) {
 
    }

    public static String areYouPlayingBanjo(String name) {
        return name.toLowerCase().charAt(0) == 'r' ? name + " plays banjo" :
            name + " does not play banjo";
    }

}