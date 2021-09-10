public class Main {

    public static void main(final String... args) {
        System.out.println(countSheeps(null));
        System.out.println(Boolean.valueOf(null));
    }

    public static int countSheeps(Boolean[] arrayOfSheeps) {
        return arrayOfSheeps == null ? 0 : (int) java.util.Arrays.stream(arrayOfSheeps).filter(Boolean::valueOf).count();
    }

}