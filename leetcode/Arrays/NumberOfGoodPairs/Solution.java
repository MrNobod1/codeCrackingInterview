public class Solution {

    public static void main(final String... args) {
        System.out.println(numIdenticalPairs1(new int[]{1,2,3,1,1,3}));
    }

    // O(n^2) ??
    public static int numIdenticalPairs(int[] nums) {
        int x = 0;
        for (int i = 0; i < nums.length-1; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i] == nums[j]) x++;
            }
        }
        return x;
    }

    // Better solution, because we are using O(n)
    public static int numIdenticalPairs1(int[] nums) {
        int[] arr = new int[101];
        int cont = 0;
        for (int i = 0; i < nums.length; i++) {
            cont += arr[nums[i]];
            arr[nums[i]]++;
        }
        return cont;
    }

}