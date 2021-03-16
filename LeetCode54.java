package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode54 {

    public static void main(String[] args) {
        int arr[][] = {{1,2,3},{4,5,6}};
        System.out.println(spiralOrder(arr));
    }

    public static List<Integer> spiralOrder(int[][] matrix) {
        List<Integer> list = new ArrayList<>();
        int n = matrix.length - 1, m = matrix[0].length - 1;
        int begRow = 0, endRow = n;
        int begCol = 0, endCol = m;
        int i = begRow, j = begCol;
        while (true) {
            if (j > endCol) {
                break;
            }
            // 从左往右
            for (; j <= endCol; j++) {
                list.add(matrix[i][j]);
            }
            begRow++;
            j--;
            // 行数减一
            i++;

            if (i > endRow) {
                break;
            }
            //从上往下
            for (; i <= endRow; i++) {
                list.add(matrix[i][j]);
            }
            i--;
            endCol--;
            // 列数减一
            j--;

            if (j < begCol) {
                break;
            }
            // 从右往左
            for (; j >= begCol; j--) {
                list.add(matrix[i][j]);
            }
            j++;
            endRow--;
            // 行数减一
            i--;

            if (i < begRow) {
                break;
            }
            //从下往上
            for (; i >= begRow; i--) {
                list.add(matrix[i][j]);
            }
            i++;
            begCol++;
            //列数加一
            j++;

        }


        return list;
    }
}
