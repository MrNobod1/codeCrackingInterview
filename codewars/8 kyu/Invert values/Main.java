public class Main {

    public static void main(final String... args) {
        System.out.println(java.util.Arrays.toString(invert(new int[]{1, 2, 3, -4, -5})));
    }

    public static int[] invert(int[] array) {
        return java.util.Arrays.stream(array).map(i -> -i).toArray();
    }

}