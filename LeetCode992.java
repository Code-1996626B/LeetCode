package LeetCode;

import java.util.HashSet;
import java.util.Set;

public class LeetCode992 {

    public static void main(String[] args) {
        int arr[] = {1, 2, 1, 3, 4};
        System.out.println(subarraysWithKDistinct(arr, 3));
    }


    public static int subarraysWithKDistinct(int[] A, int K) {
        Set<Integer> set = new HashSet<>();
        int res = 0;
        if (A.length < K) {
            return res;
        }
        if (A.length == K) {
            for (int i = 0; i < A.length; i++) {
                set.add(A[i]);
            }
            if (set.size() != K) {
                return res;
            } else {
                return K;
            }
        }

        for (int i = 0; i < A.length; i++) {
            for (int j = i; j < A.length; j++) {
                set.add(A[j]);
                if (set.size() == K) {
                    res++;
                }
                if (set.size() > K) {
                    break;
                }
            }
            set.clear();
        }

        return res;
    }
}
