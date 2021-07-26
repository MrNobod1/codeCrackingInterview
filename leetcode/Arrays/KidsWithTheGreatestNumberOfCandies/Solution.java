import java.util.List;
import java.util.ArrayList;

public class Solution {

    public static void main(final String... args) {
        kidsWithCandies(new int[]{4,2,1,1,2}, 1).forEach(System.out::println);
    }

    public static List<Boolean> kidsWithCandies(int[] candies, int extraCandies) {
        List<Boolean> result = new ArrayList<Boolean>(candies.length);
        int max = 0;
        for (int i = 0; i < candies.length; i++) if (candies[i] > max) max = candies[i];
        for (int i = 0; i < candies.length; i++) result.add(candies[i] + extraCandies >= max);
        return result;
    }

}