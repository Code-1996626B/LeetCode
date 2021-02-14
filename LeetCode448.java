package LeetCode;

import java.util.*;

public class LeetCode448 {

    public static void main(String[] args) {
        int arr[] = {4, 3, 2, 7, 8, 2, 3, 1};
        System.out.println(findDisappearedNumbers(arr));
    }

    public static List<Integer> findDisappearedNumbers(int[] nums) {
        Set<Integer> set = new TreeSet(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });

        for (int i = 0; i < nums.length; i++) {
            set.add(nums[i]);
        }

        List<Integer> list = new ArrayList<>();
        for (int i = 0; i < nums.length; i++) {
            if (!set.contains(i + 1)) {
                list.add(i + 1);
            }
        }

        return list;
    }
}
