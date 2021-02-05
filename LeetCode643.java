package LeetCode;

/*
 *  643. 子数组最大平均数 I
 * */
public class LeetCode643 {

    public static void main(String[] args) {

        int arr[] = {1, 12, -5, -6, 50, 3};
        System.out.println(new LeetCode643().findMaxAverage(arr, 4));
    }

    public double findMaxAverage(int[] nums, int k) {
        double res = 0;
        int sum = 0, j = 0;
        for (int i = 0; i < k; i++) {
            sum += nums[i];
        }
        int max = sum;
        for (int i = k; i < nums.length ; i++) {
            sum  = sum + nums[i] - nums[j++];
            if (max < sum){
                max = sum;
            }
            System.out.println(max);
        }
        res = (double) max /  k;
        return res;
    }
}
