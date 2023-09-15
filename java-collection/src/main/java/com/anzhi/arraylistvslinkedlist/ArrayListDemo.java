package com.anzhi.arraylistvslinkedlist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {
        List<String> arrayList = new ArrayList<>();
        for (int i=0; i<10; i++) {
            arrayList.add("第" + i + "元素");
        }
        for (int j=0; j<arrayList.size(); j++) {
            String nodeStr = arrayList.get(j);
            if (nodeStr.equals("第6个元素")) {
                break;
            }
        }
    }
}
