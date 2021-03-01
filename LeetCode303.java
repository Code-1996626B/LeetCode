package LeetCode;

public class LeetCode303 {

    public static void main(String[] args) {
        int arr[] = {1, 2, 34, -5};
        NumArray obj = new NumArray(arr);
        System.out.println(obj.sumRange(1,2));
    }


}

class NumArray {

    int temp[];

    public NumArray(int[] nums) {
        int n = nums.length;
        temp = new int[n + 1];
        for (int i = 0; i < n; i++) {
            temp[i + 1] = temp[i] + nums[i];
        }
    }

    public int sumRange(int i, int j) {
        return temp[j + 1] - temp[i];
    }
}
