import java.util.Arrays;

public class Solution {

    public static void main(final String... args) {
        System.out.println(Arrays.toString(smallerNumbersThanCurrent1(new int[] {8,1,2,2,3})));
    }

    // 3x times faster, because we are using extra memory to save them in an array.
    public static int[] smallerNumbersThanCurrent1(int[] nums) {
        int[] storage = new int[101];
        for (int i = 0; i < storage.length; i++) {
            storage[i] = -1;
        }
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            if (storage[nums[i]] != -1) result[i] = storage[nums[i]];
            else {
                for (int j = 0; j < nums.length; j++) {
                    if (nums[i] > nums[j]) result[i]++;
                }
                storage[nums[i]] = result[i];
            }
        }
        return result;
    }

    public static int[] smallerNumbersThanCurrent(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums.length; j++) {
                if (nums[i] > nums[j]) result[i] ++;
            }
        }
        return result;
    }

}