public class Main {

    public static void main(final String... args) {
        System.out.println("Hello world");
    }

    public static int quarterOf(int month) {
        return (int) Math.ceil(month / 3.0);
    }

}