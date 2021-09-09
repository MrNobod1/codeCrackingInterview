import java.util.regex.Pattern;
import java.util.regex.Matcher;
import java.util.Arrays;

public class Main {

    private static final Pattern RANGE_PATTERN = Pattern.compile("(\\(|\\[)(-?\\d+),(-?\\d+)(\\)|\\])");

    public static void main(final String... args) {
        Arrays.asList(interval(new int[] {1,2,3,4,5}, "[2,5)"),
            interval(new int[] {1,2,3,4,5}, "[2,5]"),
            interval(new int[] {1,2,3,4,5}, "(2,5]"),
            interval(new int[] {1,2,3,4,5}, "(2,5)"),
            interval(new int[] {1,2,3,4,5}, ""),
            interval(new int[] {}, "(2,5)"),
            interval(new int[] {-10, -29}, "(-30,-5)")).stream().map(Arrays::toString).forEach(System.out::println);
    }

    public static int[] interval(int[] arr, String str) {
        Matcher m = RANGE_PATTERN.matcher(str);
        if (!m.find() || arr.length == 0) return new int[]{};
        int from = Integer.parseInt(m.group(2)) + ("(".equals(m.group(1)) ? 1 : 0),
            to = Integer.parseInt(m.group(3)) - (!(")".equals(m.group(4))) ? 0 : Integer.parseInt(m.group(3)) > 0 ? 1 : -1);
        System.out.println(from + " " + to);
        return Arrays.stream(arr).filter((int i) -> i >= from && i <= to).sorted().toArray();
    }

}