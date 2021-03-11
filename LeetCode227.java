package LeetCode;

import java.util.IllegalFormatCodePointException;
import java.util.Stack;

public class LeetCode227 {

    public static void main(String[] args) {
        String s = " 3+5 / 2 ";
        System.out.println(calculate(s));
    }

    public static int calculate(String s) {
        Stack<Integer> num = new Stack<>();
        Stack<Character> opr = new Stack<>();

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            if (c == ' ') {
                continue;
            }

            if (c >= '0' && c <= '9') {
                int number = c - '0';
                i = i + 1;
                while (i < s.length() && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                    number = number * 10 + (s.charAt(i) - '0');
                    i++;
                }
                num.push(number);
                i--;
            }

            if (c == '+' || c == '-') {
                opr.push(c);
            }

            if (c == '*' || c == '/') {
                int numStackSize = num.size(), pre = num.pop();
                while (numStackSize != num.size()) {
                    if (s.charAt(++i) != ' ') {
                        if (s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                            int number = s.charAt(i) - '0';
                            i = i + 1;
                            while (i < s.length() && s.charAt(i) >= '0' && s.charAt(i) <= '9') {
                                number = number * 10 + (s.charAt(i) - '0');
                                i++;
                            }
                            i--;
                            num.push(number);
                        }
                        int cur = num.pop();
                        int res = c == '*' ? pre * cur : pre / cur;
                        num.push(res);
                    }
                }
            }
        }
        int ans = 0;
        while (!opr.isEmpty()) {
            ans += opr.pop() == '+' ? num.pop() : num.pop() * (-1);
        }
        if (!num.isEmpty()) {
            ans += num.pop();
        }
        return ans;

    }
}