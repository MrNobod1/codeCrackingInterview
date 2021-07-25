public class Solution {

    public static void main(final String... args) {
        System.out.println(java.util.Arrays.toString(getConcatenation(new int[]{1,2,1})));
    }

    public static int[] getConcatenation(int[] nums) {
        int[] arr = new int[nums.length*2];
        int len = nums.length;
        for (int i = 0; i < len; i++) {
            arr[i] = nums[i];
            arr[i + len] = nums[i];
        }
        return arr;
    }

}