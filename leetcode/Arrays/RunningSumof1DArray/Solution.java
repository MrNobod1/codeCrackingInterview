public class Solution {

    public static void main(final String... args) {
        System.out.println(java.util.Arrays.toString(runningSum(new int[]{1,1,1,1,1})));
    }

    public static int[] runningSum(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            nums[i] += nums[i-1];
        }
        return nums;
    }

}