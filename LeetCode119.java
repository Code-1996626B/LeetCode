package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode119 {

    public static void main(String[] args) {


    }

    public static List<Integer> getRow(int rowIndex) {
        List<Integer> list = new ArrayList<>();
        if (rowIndex == 0){
            list.add(1);
            return list;
        }
        for (int i = 1; i < rowIndex+1; i++) {
            List<Integer> list1 = new ArrayList<>();
            List<Integer> preList = list;
//            System.out.println(preList+" "+i);
            list1.add(1);
            for (int j = 1; j < i; j++) {
                list1.add(preList.get(j)+preList.get(j-1));
            }
            list1.add(1);
            list = list1;
//            System.out.println(list+" "+i);
        }
        return list;
    }

}
