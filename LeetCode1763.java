package LeetCode;

import java.util.HashSet;
import java.util.Set;

public class LeetCode1763 {

    public static void main(String[] args) {
        String s = "dDzeE";
        System.out.println(longestNiceSubstring(s));
    }

    public static String longestNiceSubstring(String s) {
        String res = "";
        if (s.length() == 1) {
            return res;
        }

        int temp = 0;
        for (int i = 0; i < s.length()-1; i++) {
            Set<Integer> containSet = new HashSet<>();
            Set<Integer> numSet = new HashSet<>();
            for (int j = i; j < s.length() ; j++) {
                temp = s.charAt(j) - 0;
                // 大写字母
                if (temp <= 90) {
                    //没找到对应的小写字母，把大写字母存入其中
                    if (!containSet.contains(temp + 32)) {
                        // 把大写字母存入其中
                        numSet.add(temp);
                    } else {
                        // 把大写字母从中删除
                        numSet.remove(temp);
                    }
                } else {
                    // 小写字母
                    if (!containSet.contains(temp - 32)) {
                        // 没有找到大写字母,把大写字母存入其中
                        numSet.add(temp - 32);
                    } else {
                        // 找到了大写字母，从中删除
                        numSet.remove(temp - 32);
                    }
                }
                // 都需要把字母存入其中
                containSet.add(temp);
                if (numSet.size() == 0) {
                    //说明其是一个完美字符串
                    if (res.length() < j - i + 1) {
                        res = s.substring(i, j + 1);
                    }
                }
            }


        }

        return res;
    }
}
