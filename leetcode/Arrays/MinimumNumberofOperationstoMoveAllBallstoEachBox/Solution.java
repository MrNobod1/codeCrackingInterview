import java.util.Arrays;
import java.util.List;
import java.util.ArrayList;

public class Solution {
    
    public static void main(final String... args) {
        System.out.println(Arrays.toString(minOperations("001011")));
    }

    public static int[] minOperations(String boxes) {
        int[] result = new int[boxes.length()];
        List<Integer> x = new ArrayList<Integer>();
        for (int i = 0; i < boxes.length(); i++)
            if (boxes.charAt(i) == '1') x.add(i);
        for (int i = 0; i < boxes.length(); i++) {
            for (int j = 0; j < x.size(); j++) {
                result[i] += Math.abs(i - x.get(j));
            }
        }
        return result;
    }

}