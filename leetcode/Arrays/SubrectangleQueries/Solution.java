import java.util.Arrays;

public class Solution {

    public static void main(final String... args) {
        SubrectangleQueries sq = new SubrectangleQueries(new int[][]{
            {1,2,1}, {4,3,4}, {3,2,1}, {1,1,1}
        });
        System.out.println(sq.getValue(0, 2));
        sq.updateSubrectangle(0, 0, 3, 2, 5);
        System.out.println(Arrays.deepToString(sq.getRectangle()));
    }

    static class SubrectangleQueries {
        
        private int[][] rectangle;

        public SubrectangleQueries(int[][] rectangle) {
            this.rectangle = rectangle;
        }

        public void updateSubrectangle(int row1, int col1, int row2, int col2, int newValue) {
            for (; row1 <= row2; row1++) {
                for (int j = col1; j <= col2; j++) {
                    this.rectangle[row1][j] = newValue;
                }
            }
        }

        public int getValue(int row, int col) {
            return this.rectangle[row][col];
        }

        public int[][] getRectangle() {
            return this.rectangle;
        }

        /**
         * Your SubrectangleQueries object will be instantiated and called as such:
         * SubrectangleQueries obj = new SubrectangleQueries(rectangle);
         * obj.updateSubrectangle(row1,col1,row2,col2,newValue);
         * int param_2 = obj.getValue(row,col);
         */

    }

}