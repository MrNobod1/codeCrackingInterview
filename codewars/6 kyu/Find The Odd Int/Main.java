import java.util.HashSet;
import java.util.Set;

public class Main {
    
    public static void main(final String... args) {
        System.out.println(findIt(new int[]{20,1,-1,2,-2,3,3,5,5,1,2,4,20,4,-1,-2,5}));
        System.out.println(findIt(new int[]{1,1,2,-2,5,2,4,4,-1,-2,5}));
    }

    // first approach would be a hashMap.
    public static int findIt(int[] a) {
        Set<Integer> set = new HashSet<Integer>();
        for (int c = 0; c < a.length; c++) {
            if (set.contains(a[c])) set.remove(a[c]);
            else set.add(a[c]);
        }
        return set.stream().findFirst().get();
    }

    public static int findIt_1(int[] a) {
        int result = 0;
        for (int i = 0; i < a.length; i++) {
            result ^= a[i];
        }
        return result;
    }

}
