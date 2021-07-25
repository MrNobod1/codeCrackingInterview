public class Solution {

    public static void main(final String... args) {
        System.out.println(java.util.Arrays.toString(shuffle1(new int[]{2,5,1,3,4,7}, 3)));
    }

    public static int[] shuffle1(int[] nums, int n) {
        int[] result = new int[nums.length];
        for (int i = 0; i < n; i++) {
            result[2*i] = nums[i];
            result[2*i+1] = nums[i + n];
        }
        return result;
    }

}