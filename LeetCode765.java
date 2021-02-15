package LeetCode;

public class LeetCode765 {

    public static void main(String[] args) {

    }

    public static int minSwapsCouples(int[] row) {
        int ans = 0;
        int[] pos = new int[row.length];

        for (int i = 0; i < pos.length; i++) {
            pos[row[i]] = i;  //每个人对应的位置
        }

        for (int i = 0; i < pos.length; i += 2) {
            int pairPerson = row[i] ^ 0x1;  //i号位置的情侣应该是谁
            if (row[i + 1] == pairPerson) {
                continue;  //右边是情侣，直接继续处理下一个。
            }

            int nextPerson = row[i + 1]; //右边不是情侣，得到右边的人是谁
            int changePos = pos[pairPerson]; //得到情侣的位置在哪

            row[changePos] = nextPerson; //交换后，情侣位置坐上了右边的人nextPerson
            pos[nextPerson] = changePos; //交换后，右边人nextPerson的位置发生了改变，记录下来。
            ans++;
        }

        return ans;

    }
}
