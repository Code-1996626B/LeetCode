package LeetCode;

import java.util.Arrays;

public class LeetCode561 {

    public static void main(String[] args) {
        int arr[] = {6,2,6,5,1,2};
        System.out.println(arrayPairSum(arr));
    }

    public static int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int maxSum = 0;
        for (int i = 0; i < nums.length; i += 2) {
            maxSum += nums[i];
        }
        return maxSum;
    }
}


