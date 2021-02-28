package LeetCode;

public class LeetCode896 {

    public static void main(String[] args) {
        int arr[] = {1,3,2};
        System.out.println(isMonotonic(arr));
    }

    public static boolean isMonotonic(int[] A) {
        int temp = A[0], flag = 0;
        for (int i = 1; i < A.length; i++) {
            if (flag == 0) {
                if (temp < A[i]) {
                    flag = 1;
                    temp = A[i];
                }
                if (temp > A[i]) {
                    flag = 2;
                    temp = A[i];
                }
            } else if (flag == 1) {
                if (temp > A[i]) {
                    return false;
                } else {
                    temp = A[i];
                }
            } else if (flag == 2){
                if (temp < A[i]) {
                    return false;
                } else {
                    temp = A[i];
                }
            }


        }
        return true;
    }
}
