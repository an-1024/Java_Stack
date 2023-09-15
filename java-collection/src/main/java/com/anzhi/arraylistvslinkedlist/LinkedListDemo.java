package com.anzhi.arraylistvslinkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {
    public static void main(String[] args) {
        List<String> linkedList = new LinkedList<>();
        for (int i=0; i<10; i++) {
            linkedList.add("第" + i + "个元素");
        }
        for (int j=0; j<linkedList.size(); j++) {
            String nodeStr = linkedList.get(j);
            if (nodeStr.equals("第6个元素")) {
                break;
            }
        }

        Iterator<String> iterator = linkedList.iterator();
        while(iterator.hasNext()) {
            String nodeStr = iterator.next();
            if (nodeStr.equals("第6个元素")) {
                break;
            }
        }
    }
}
