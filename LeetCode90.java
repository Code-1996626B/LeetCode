package LeetCode;

import java.util.*;

public class LeetCode90 {

    public static Set<List<Integer>> set = new HashSet<>();

/*    public static void main(String[] args) {
        int arr[] = {0};
        System.out.println(subsetsWithDup(arr));
    }*/

    public static List<List<Integer>> subsetsWithDup(int[] nums) {
        List<List<Integer>> lists = new ArrayList<>();
        List<Integer> list = new ArrayList<>();
        Arrays.sort(nums);
        reCall(nums, 0, list);
        for (List<Integer> subList : set) {
            lists.add(subList);
        }
        return lists;
    }

    public static void reCall(int[] nums, int index, List<Integer> list) {
        set.add(new ArrayList<>(list));
        for (int i = index; i < nums.length; i++) {
            list.add(nums[i]);
            reCall(nums, i + 1, list);
            list.remove(list.size() - 1);
        }
    }
}
