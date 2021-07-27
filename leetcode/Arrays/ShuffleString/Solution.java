public class Solution {

    public static void main(final String... args) {
        System.out.println(restoreString("aiohn", new int[] {3,1,4,2,0} ));
    }
    
    public static String restoreString(String s, int[] indices) {
        char[] r = new char[indices.length];
        for (int i = 0; i < indices.length; i++) {
            r[indices[i]] = s.charAt(i);
        }
        return String.valueOf(r);
    }

}