package LeetCode;

import java.util.Stack;

public class LeetCode150 {

    public static void main(String[] args) {
        String[] arr = {"2","1","+","3","*"};
        System.out.println(evalRPN(arr));
    }

    public static int evalRPN(String[] tokens) {
        if (tokens.length == 0) {
            return 0;
        }
        Stack<Integer> num = new Stack<>();
        int res = 0, m = 0, n = 0;
        for (int i = 0; i < tokens.length; i++) {
            if (tokens[i] == "+" || tokens[i] == "*") {
                m = num.pop();
                n = num.pop();
                res = tokens[i] == "+" ? m + n : m * n;
                num.push(res);
                continue;
            } else if (tokens[i] == "-" || tokens[i] == "/") {
                m = num.pop();
                n = num.pop();
                res = tokens[i] == "-" ? n - m : n / m;
                num.push(res);
            } else {
                num.push(Integer.valueOf(tokens[i]));
            }
        }

        return num.pop();
    }
}
