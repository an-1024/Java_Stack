package com.anzhi.arraylistvslinkedlist;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class ArrayListDemo {

    // 从头部添加数组元素测试标志
    private static final boolean ADD_HEAD_FLAG = false;
    // 从中间位置添加元素
    private static final boolean ADD_MIDDLE_FLAG = true;

    // API 查看 demo 标志
    private static final boolean API_INDEX_FLAG = false;

    // 插入元素
    private static final int ADD_NUM_SIZE = 10000;

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        if (API_INDEX_FLAG) {
            for (int i = 0; i < 10; i++) {
                arrayList.add("第" + i + "元素");
            }
            for (int j = 0; j < arrayList.size(); j++) {
                String nodeStr = arrayList.get(j);
                if (nodeStr.equals("第6个元素")) {
                    break;
                }
            }
        } else if (ADD_HEAD_FLAG) {
            long timeEnd = System.currentTimeMillis();
            for (int i = 0; i < ADD_NUM_SIZE; i++) {
                arrayList.add(0, "第" + i +"个元素");
            }
            System.out.println("ArrayList 从头添加" + ADD_NUM_SIZE + "个元素花费时间为：" + (System.currentTimeMillis() - timeEnd));
        } else if (ADD_MIDDLE_FLAG) {
            long timeEnd = System.currentTimeMillis();
            for (int i = 0; i < ADD_NUM_SIZE; i++) {
                arrayList.add(arrayList.size()/2, "第" + i +"个元素");
            }
            System.out.println("ArrayList 从中间位置添加" + ADD_NUM_SIZE + "个元素花费时间为：" + (System.currentTimeMillis() - timeEnd));
        }
    }
}
