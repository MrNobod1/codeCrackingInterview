public class Solution {

    public static void main(final String... args) {
        System.out.println(removeDuplicates(new int[]{0,0,1,1,1,2,2,3,3,4}));
    }

    public static int removeDuplicates(int[] nums) {
        if (nums.length == 0) return 0;
        int pos = 0;
        for (int i = 1; i < nums.length; i++) {
            if (nums[pos] != nums[i]) {
                nums[++pos] = nums[i];
            }
        }
        System.out.println(java.util.Arrays.toString(nums));
        return pos+1;
    }

}