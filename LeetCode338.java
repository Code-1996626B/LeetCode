package LeetCode;

import java.util.Arrays;

public class LeetCode338 {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(countBits(5)));
    }


    public static int[] countBits(int num) {
        int[] bits = new int[num + 1];
        int highBit = 0;
        for (int i = 1; i <= num; i++) {
            if ((i & (i - 1)) == 0) {
                highBit = i;
            }
            bits[i] = bits[i - highBit] + 1;
        }
        return bits;
    }
//    public static int[] countBits(int num) {
//        int arr[] = new int[num + 1];
//        for (int i = 0; i < num + 1; i++) {
//            arr[i] = getBinaryOneCount(i);
//        }
//        return arr;
//    }
//
//    public static int getBinaryOneCount(int num) {
//        int one = 0;
//        while (num > 0) {
//            num &= (num-1);
//            one++;
//        }
//        return one;
//    }
}
