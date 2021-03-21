package LeetCode;

import java.util.*;

public class LeetCode73 {

    public static void main(String[] args) {
        int arr[][] = {{0, 1, 2, 0}, {3, 4, 5, 2}, {1, 3, 1, 5}};
        System.out.println(Arrays.deepToString(setZeroes(arr)));
    }

    public static int[][] setZeroes(int[][] matrix) {
        int row = matrix.length, col = matrix[0].length;
        Map<Integer, List<Integer>> map = new HashMap<>();
        List<Integer> list;
        for (int i = 0; i < row; i++) {
            list = new ArrayList<>();
            for (int j = 0; j < col; j++) {
                if (matrix[i][j] == 0) {
                    list.add(j);
                }
            }
            if (list.size() > 0) {
                map.put(i, list);
            }
        }
        Set<Integer> set = map.keySet();
        for (Integer integer : set) {
            int k = 0;
            // 同一行变成0
            while (k < col) {
                matrix[integer][k++] = 0;
            }
            for (Integer val : map.get(integer)) {
                k = 0;
                // 同一列变成0
                while (k < row) {
                    matrix[k++][val] = 0;
                }
            }
        }

        return matrix;
    }
}
