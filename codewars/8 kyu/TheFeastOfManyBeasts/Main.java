public class Main {

    public static void main(final String... args) {
        System.out.println("Hello world");
    }

    public static boolean feast(String beast, String dish) {
        return beast.startsWith(dish.substring(0, 1)) && beast.endsWith(dish.substring(dish.length() - 1));
    }

}