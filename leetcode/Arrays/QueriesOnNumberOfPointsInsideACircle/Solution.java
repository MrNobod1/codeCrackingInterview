public class Solution {

    public static void main(final String... args) {
        System.out.println(java.util.Arrays.toString(countPoints(
            new int[][]{
                {1,1},{2,2},{3,3},{4,4},{5,5}
            },
            new int[][]{
                {1,2,2}, {2,2,2}, {4,3,2}, {4,3,3}
            }
        )));
    }

    // Math.abs(points[i][0] - queries[j][0]) <= queries[j][2] && Math.abs(points[i][1] - queries[j][1]) <= queries[j][2]
    public static int[] countPoints(int[][] points, int[][] queries) {
        int[] result = new int[queries.length];
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < queries.length; j++) {
                if (Math.pow(Math.abs(points[i][0] - queries[j][0]), 2) + 
                    Math.pow(Math.abs(points[i][1] - queries[j][1]), 2) <= Math.pow(queries[j][2], 2)) {
                        result[j]++;
                }
            }
        }
        return result;
    }

    public static int[] countPoints1(int[][] points, int[][] queries) {
        int[] result = new int[queries.length];
        for (int j = 0; j < queries.length; j++) {
            for (int i = 0; i < points.length; i++) {
                if (Math.pow(Math.abs(points[i][0] - queries[j][0]), 2) + 
                    Math.pow(Math.abs(points[i][1] - queries[j][1]), 2) <= Math.pow(queries[j][2], 2)) {
                        result[j]++;
                }
            }
        }
        return result;
    }

    // we are saving a lot of time without using Math.abs and Math.pow and saving the square of the radius in a local variable.
    public static int[] countPoints2(int[][] points, int[][] queries) {
        int[] result = new int[queries.length];
        for (int i = 0; i < queries.length; i++) {
            int square = queries[i][2] * queries[i][2];
            for (int j = 0; j < points.length; j++) {
                if ((queries[i][0] - points[j][0]) * (queries[i][0] - points[j][0])
                + (queries[i][1] - points[j][1]) * (queries[i][1] - points[j][1]) <= square) result[i]++;
            }
        }
        return result;
    }

}