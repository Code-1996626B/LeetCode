package LeetCode;

import java.util.Arrays;

public class LeetCode503 {

    public static void main(String[] args) {
        int arr[] = {1, 2, 1};
        System.out.println(Arrays.toString(nextGreaterElements(arr)));

    }

    public static int[] nextGreaterElements(int[] nums) {
        int n = nums.length;
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            int temp = nums[i];
            int j = i +1;
            boolean flag = false;
            while (j % n!= i) {
                if (nums[j % n ] > temp) {
                    arr[i] = nums[j% n];
                    flag = true;
                }
                j++;
            }
            if (!flag) {
                arr[i] = -1;
            }
        }

        return arr;
    }
}
