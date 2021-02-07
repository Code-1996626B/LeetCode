package LeetCode;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class LeetCode665 {

    public static void main(String[] args) {
        int arr[] = {4, 2, 1};
        System.out.println(new LeetCode665().checkPossibility(arr));
    }

    public boolean checkPossibility(int[] nums) {
        int arrayLen = nums.length;
        if (arrayLen <= 1) {
            return true;
        }
        for (int i = 0; i < nums.length; i++) {
            Stack<Integer> stack = new Stack<>();
            for (int j = 0; j < nums.length; j++) {
                if (j != i) {
                    if (stack.isEmpty()) {
                        stack.add(nums[j]);
                    } else {
                        if (stack.peek() <= nums[j]) {
                            stack.add(nums[j]);
                        } else {
                            break;
                        }
                    }
                }
            }
            if (stack.size() == nums.length - 1) {
                return true;
            }
        }

        return false;
    }
}
