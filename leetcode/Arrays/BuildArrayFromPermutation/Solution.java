public class Solution {

    public static void main(final String... args) {
        buildArray1(new int[]{0,2,1,5,3,4});
    }

    public static int[] buildArray(int[] nums) {
        int[] result = new int[nums.length];
        for (int i = 0; i < nums.length; i++) {
            result[i] = nums[nums[i]];
        }
        return result;
    }

    public static int[] buildArray1(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] += nums[nums[i]] << 16;
        }
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] >> 16;
        }
        return nums;
    }

    private static void printBinaryInt(int[] arr) {
        java.util.stream.IntStream.of(arr).boxed().map(Integer::toBinaryString).forEach(System.out::println);
    }

}