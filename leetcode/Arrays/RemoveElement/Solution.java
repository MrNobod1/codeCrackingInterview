public class Solution {

    public static void main(final String... args) {
        System.out.println(removeElement(new int[]{0,1,2,2,3,0,4,2}, 2));
    }

    public static int removeElement(int[] nums, int val) {
        if (nums.length == 0) return 0;
        int len = 0;
        int i = 0;
        while (i < nums.length) {
            int j = i;
            while (j < nums.length && nums[j] == val) j++;
            int diff = j - i;
            if (diff == 0) { i++; len++;}
            int k = j;
            while (i < j && k < nums.length && diff-- > 0) {
                nums[i++] = nums[k++];
            }
            while (i < j) i++;
        }
        System.out.println(java.util.Arrays.toString(nums));
        return len;
    }

    public static int removeElement1(int[] nums, int val) {
        if (nums.length == 0) return 0;
        int pos = -1;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != val) nums[++pos] = nums[i];
        }
        return pos+1;
    }

}