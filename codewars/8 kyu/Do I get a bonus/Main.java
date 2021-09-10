public class Main {

    public static void main(final String... args) {
        System.out.println("Hello world");
    }

    public static String bonusTime(final int salary, final boolean bonus) {
        return String.format("\u00A3%d", bonus ? salary * 10 : salary);
    }

}