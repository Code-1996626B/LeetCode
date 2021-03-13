package LeetCode;

import java.util.ArrayList;
import java.util.List;

public class LeetCode705 {

    public static void main(String[] args) {

    }
}

class MyHashSet {

    List<Integer> list;

    /**
     * Initialize your data structure here.
     */
    public MyHashSet() {
        list = new ArrayList<>();
    }

    public void add(int key) {
        if (!list.contains(key)) {
            list.add(key);
        }
    }

    public void remove(int key) {
        if (list.contains(key)) {
            list.remove(new Integer(key));
        }
    }

    /**
     * Returns true if this set contains the specified element
     */
    public boolean contains(int key) {
        return list.contains(key);
    }
}
