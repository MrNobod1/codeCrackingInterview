public class Main {

    public static void main(final String... args) {

    }

    public static int getAverage(int[] marks) {
        return java.util.Arrays.stream(marks).sum() / marks.length;
    }

}