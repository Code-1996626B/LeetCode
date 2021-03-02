package LeetCode;

public class LeetCode304 {

    public static void main(String[] args) {
        int arr[][] = {{3, 0, 1, 4, 2}, {5, 6, 3, 2, 1}, {1, 2, 0, 1, 5}, {4, 1, 0, 1, 7}, {1, 0, 3, 0, 5}};
        NumMatrix obj = new NumMatrix(arr);
        System.out.println(obj.sumRegion(1, 2, 2, 4));
    }


}

class NumMatrix {

    int temp[][];

    public NumMatrix(int[][] matrix) {

        int row = matrix.length;
        if (row > 0) {
            int col = matrix[0].length;
            temp = new int[row][col];
            for (int i = 0; i < row; i++) {
                for (int j = 0; j < col; j++) {
                    temp[i][j] = matrix[i][j];
                }
            }
        }

    }

    public int sumRegion(int row1, int col1, int row2, int col2) {
        int sum = 0;
        for (int i = row1; i <= row2; i++) {
            for (int j = col1; j <= col2; j++) {
                sum += temp[i][j];
            }
        }
        return sum;
    }
}