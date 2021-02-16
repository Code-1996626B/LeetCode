package LeetCode;

public class LeetCode485 {

    public static void main(String[] args) {
        int arr[] = {1, 1, 0, 1, 1, 1};
        System.out.println(findMaxConsecutiveOnes(arr));
    }

    public static int findMaxConsecutiveOnes(int[] nums) {
        int maxLen = 0, len = 0;
        boolean flag = false;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 1) {
                len++;
            } else {
                len = 0;
            }

            if (len > maxLen) {
                maxLen = len;
            }
        }
        return maxLen;
    }
}
