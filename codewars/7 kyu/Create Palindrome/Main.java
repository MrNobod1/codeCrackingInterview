import java.util.Arrays;
import java.util.stream.IntStream;

public class Main {

    public static void main(String[] args) {
        print();
        System.out.println(122 - 97);
        System.out.println((122 - 97) % 26);
        Arrays.asList("adfa", "bd", "abaazaba", "st", "bcefgh", "abc")
            .stream()
            .map(Main::solve).forEach(System.out::println);
    }

    public static boolean solve(String str) {
        int max = str.length() / 2;
        for (int i = 0; i < max; i++) {
            int temp = Math.abs(str.charAt(i) - str.charAt(str.length() - i - 1)) % 26;
            if (temp > 2 && temp != 1) {
                return false;
            }
        }
        return true;
    }

    public static void print() {
        // 97 - 122
        IntStream.rangeClosed(0, 25).map(i -> 97 + i).forEach(i -> System.out.println((char) i + " - " + i));
    }
    
}