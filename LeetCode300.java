package LeetCode;

import java.util.Comparator;

public class LeetCode300 {

    public static void main(String[] args) {
        int arr[] = {7,7,7,7,7,7,7};
        System.out.println(lengthOfLIS(arr));
    }

    public static int lengthOfLIS(int[] nums) {
        int numLen = nums.length;
        if (numLen == 0) {
            return 0;
        }
        int maxLen = 1;
        int dp[] = new int[numLen];
        dp[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            dp[i] = 1;
            for (int j = 0; j < i; j++) {
                if (nums[i] > nums[j]) {
                    if (dp[j] + 1 > dp[i]) {
                        dp[i] = dp[j] + 1;
                    }
                }
            }
            if (maxLen < dp[i]) {
                maxLen = dp[i];
            }
        }

        return maxLen;
    }
}
