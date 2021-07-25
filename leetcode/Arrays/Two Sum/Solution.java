import java.util.HashMap;

public class Solution {

    public static void main(final String... args) {
        assert twoSumBruteForce(new int[]{2, 7, 11, 15}, 9) == new int[]{0, 1};
        System.out.println(twoSum(new int[]{3, 2, 4}, 6));
    }
    
    /**
     * it is O(n2) because we are looping the array two times in the worst case.
     */
    public static int[] twoSumBruteForce(int[] nums, int target) {
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] + nums[j] == target) return new int[]{i, j};
            }
        }
        // the problem say that there are always a solution, so this statement is not contempled.
        return null;
    }

    public static int[] twoSum(int[] nums, int target) {
        // <value of the rest, position in the array>
        HashMap<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < nums.length; i++) {
            if (map.containsKey(nums[i])) {
                return new int[]{map.get(nums[i]), i};
            }
            map.put(target - nums[i], i);
        }
        // the problem say that there are always a solution, so this statement is not conemplated.
        return null;
    }

}