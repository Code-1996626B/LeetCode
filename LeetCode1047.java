package LeetCode;

import java.util.Stack;

public class LeetCode1047 {

    public static void main(String[] args) {
        String s ="abbaca";
        System.out.println(removeDuplicates(s));
    }

    public static String removeDuplicates(String S) {
        if (S.trim().isEmpty()) {
            return S;
        }
        int strLen = S.length();
        Stack<Character> stack = new Stack<>();
        for (int i = 0; i < strLen; i++) {
            if (stack.isEmpty()) {
                stack.push(S.charAt(i));
            }else {
                if (stack.peek()!=S.charAt(i)){
                    stack.push(S.charAt(i));
                }else {
                    stack.pop();
                }
            }
        }

        char arr[] = new char[stack.size()];
        for (int i = arr.length-1; i >= 0; i--) {
            arr[i] = stack.pop();
        }
        String b = new String(arr);

        return b;
    }

}
