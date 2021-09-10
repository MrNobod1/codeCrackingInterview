public class Main {

    public static void main(final String... args) {
        System.out.println("Hello world");
    }

    public static Integer find(final int[] arr) {
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1] + 1) return arr[i];
        }
        return null;
    }

}