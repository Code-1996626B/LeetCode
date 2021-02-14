package LeetCode;

import java.lang.reflect.Array;
import java.util.*;

public class LeetCode567 {

    public static void main(String[] args) {
        String s1 = "adc", s2 = "dcda";
        System.out.println(checkInclusion(s1, s2));
    }

    public static boolean checkInclusion(String s1, String s2) {
        char arr[] = s1.toCharArray();
        Set<Integer> set = new TreeSet<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        });
        for (int i = 0; i < arr.length; i++) {
            int objIndex = s2.indexOf(arr[i]);
            if (objIndex == -1) {
                return false;
            }
            set.add(objIndex);
            delIndexChar(s2, objIndex);
        }
        Integer setTempArray[] = new Integer[set.size()];
        Integer setArray[] = set.toArray(setTempArray);
        System.out.println(Arrays.toString(setArray));
        int temp = setArray[0];

        for (int i = 1; i < setArray.length; i++) {
            if (setArray[i] - temp != 1) {
                return false;
            } else {
                temp = setArray[i];
            }
        }

        return true;
    }

    public static String delIndexChar(String s, int index) {
        String res = "";
        char arr[] = s.toCharArray();
        for (int i = 0; i < arr.length; i++) {
            if (i != index) {
                res += arr[i];
            }
        }
        return res;
    }
}
