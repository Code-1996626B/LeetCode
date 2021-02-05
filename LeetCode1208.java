package LeetCode;

import java.lang.reflect.Array;
import java.util.Arrays;

/*
 *  1208. 尽可能使字符串相等
 * */
public class LeetCode1208 {

    public static void main(String[] args) {
        String s1 = "iktqzyazth", s2 = "havakbjzzc";
        int b = new LeetCode1208().equalSubstring(s1, s2, 78);
        System.out.println(b);
    }

    public int equalSubstring(String s, String t, int maxCost) {
        int maxLen = 0;
        int cost[] = new int[s.length()];
        for (int i = 0; i < s.length(); i++) {
            cost[i] = Math.abs(s.charAt(i) - t.charAt(i));
        }
        System.out.println(Arrays.toString(cost));
        boolean flag = false;
        for (int i = 0; i < cost.length; i++) {
            int len = 0, costSum = 0;
            for (int j = i; j < cost.length; j++) {
                costSum += cost[j];
                if (costSum > maxCost) {
                    costSum = 0;
                    len = 0;
                    flag = true;
                } else {
                    len++;
                }
                if (len > maxLen) {
                    maxLen = len;
                }
                if (flag){
                    flag = false;
                    break;
                }
            }

        }
        return maxLen;
    }

}
