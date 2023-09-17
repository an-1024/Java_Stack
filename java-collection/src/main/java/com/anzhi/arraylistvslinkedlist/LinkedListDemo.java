package com.anzhi.arraylistvslinkedlist;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;

public class LinkedListDemo {

    // 从头部添加数组元素测试标志
    private static final boolean ADD_HEAD_FLAG = false;

    // 从中间位置添加元素
    private static final boolean ADD_MIDDLE_FLAG = true;

    // API 查看 demo 标志
    private static final boolean API_INDEX_FLAG = false;

    // 插入元素
    private static final int ADD_NUM_SIZE = 10000;

    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>();
        if (API_INDEX_FLAG) {
            for (int i = 0; i < 10; i++) {
                linkedList.add("第" + i + "个元素");
            }
            for (int j = 0; j < linkedList.size(); j++) {
                String nodeStr = linkedList.get(j);
                if (nodeStr.equals("第6个元素")) {
                    break;
                }
            }

            linkedList.add(6, "插入一个元素在下标为6的数据之前");

            Iterator<String> iterator = linkedList.iterator();
            while (iterator.hasNext()) {
                String nodeStr = iterator.next();
                if (nodeStr.equals("第6个元素")) {
                    break;
                }
            }
        } else if (ADD_HEAD_FLAG) {
            long timeEnd = System.currentTimeMillis();
            for (int i = 0; i < ADD_NUM_SIZE; i++) {
                linkedList.addFirst("第" + i + "个元素");
            }
            System.out.println("LinkedList 从头添加" + ADD_NUM_SIZE + "个元素花费时间为：" + (System.currentTimeMillis() - timeEnd));
        } else if (ADD_MIDDLE_FLAG) {
            long timeEnd = System.currentTimeMillis();
            for (int i = 0; i < ADD_NUM_SIZE; i++) {
                linkedList.add(linkedList.size()/2, "第" + i + "个元素");
            }
            System.out.println("LinkedList 从中间添加" + ADD_NUM_SIZE + "个元素花费时间为：" + (System.currentTimeMillis() - timeEnd));
        }
    }

}


