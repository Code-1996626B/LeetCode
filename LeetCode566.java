package LeetCode;

import java.lang.reflect.Array;
import java.util.Arrays;

public class LeetCode566 {
    public static void main(String[] args) {
        int arr[][] = {{1, 2}, {3, 4}};
        int temp[][] = matrixReshape(arr, 1, 4);
        System.out.println(temp);
    }

    public static int[][] matrixReshape(int[][] nums, int r, int c) {
        if (r * c != nums.length * nums[0].length) {
            return nums;
        }
        int temp[] = new int[r * c];
        int arr[][] = new int[r][c];
        int k = 0;
        for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                temp[k++] = nums[i][j];
            }
        }

        k = 0;
        for (int i = 0; i < r; i++) {
            for (int j = 0; j < c; j++) {
                arr[i][j] = temp[k++];
            }
        }

        return arr;
    }
}
