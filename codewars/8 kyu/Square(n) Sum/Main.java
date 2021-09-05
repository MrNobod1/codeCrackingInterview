import java.util.Arrays; 
 
public class Main {

    public static void main(final String... args) {
        squareSum(new int[] {1,2,2});
    }

    public static int squareSum(int[] n) {
        return Arrays.stream(n).map((int i) -> i * i).sum();
    }

}