package com.anzhi.arraylistvslinkedlist;

import java.util.ArrayList;

public class ArrayListDemo {

    // 从头部添加数组元素测试标志
    private static final boolean ADD_HEAD_FLAG = false;
    // 从中间位置添加元素
    private static final boolean ADD_MIDDLE_FLAG = false;

    // 从尾部位置添加元素
    private static final boolean ADD_LAST_FLAG = true;

    // API 查看 demo 标志
    private static final boolean API_INDEX_FLAG = false;

    // 插入元素
    private static final int ADD_NUM_SIZE = 5;

    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<>();
        if (API_INDEX_FLAG) {
            for (int i = 0; i < 10; i++) {
                arrayList.add("第" + i + "元素");
            }
            arrayList.remove("第5个元素");
            arrayList.remove(1);
            for (int j = 0; j < arrayList.size(); j++) {
                String nodeStr = arrayList.get(j);
                if (nodeStr.equals("第6个元素")) {
                    break;
                }
            }
        } else if (ADD_HEAD_FLAG) {
            long timeStart = System.nanoTime();
            for (int i = 0; i < ADD_NUM_SIZE; i++) {
                arrayList.add(0, "第" + i + "个元素");
            }
            System.out.println("ArrayList 从头添加" + ADD_NUM_SIZE + "个元素花费时间为：" + (System.nanoTime() - timeStart));
        } else if (ADD_MIDDLE_FLAG) {
            long timeStart = System.nanoTime();
            for (int i = 0; i < ADD_NUM_SIZE; i++) {
                arrayList.add(arrayList.size() / 2, "第" + i + "个元素");
            }
            System.out.println("ArrayList 从中间位置添加" + ADD_NUM_SIZE + "个元素花费时间为：" + (System.nanoTime() - timeStart));
        } else if (ADD_LAST_FLAG) {
            long timeStart = System.nanoTime();
            for (int i = 0; i < ADD_NUM_SIZE; i++) {
                arrayList.add("第" + i + "个元素");
            }
            System.out.println("ArrayList 从尾部位置添加" + ADD_NUM_SIZE + "个元素花费时间为：" + (System.nanoTime() - timeStart));

        }
    }
}
