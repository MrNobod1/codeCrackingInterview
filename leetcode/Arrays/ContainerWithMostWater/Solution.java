public class Solution {

    public static void main(final String... args) {
        System.out.println(maxArea(new int[]{1,2,1}));
    }

    // 117-119 ms.
    public static int maxArea(int[] height) {
        int result = 0;
        for (int i = 0; i < height.length; i++) {
            int j = height.length;
            while (--j > i && height[i] > height[j]) {
                int temp = Math.min(height[i], height[j]) * (j - i);
                result = temp > result ? temp : result;
            }
            int temp = Math.min(height[i], height[j]) * (j - i);
            result = temp > result ? temp : result;
        }
        return result;
    }

    // this is the fastest... 3ms
    public static void int maxArea1(int[] height) {
        int result = 0;
        int low = 0;
        int high = height.length-1;
        while (low < high) {
            result = Math.max(result, Math.min(height[low], height[high]) * (high - low));
            if (height[low] < height[high]) low++;
            else if (height[low] > height[high]) high--;
            else if (height[low] == height[high]) { low++; high--; }
        }
        return result;
    }

}