package com.anzhi.hashmapvshashtable;

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {
        Map<Object,String> map = new HashMap<>();
        for (int i=0; i<2; i++) {
            map.put(i, "存放第" + i + "个元素");
        }
        for (int binCount = 0;;++binCount) {
            if (binCount >= 8 - 1) {
                System.out.printf("111111111111= %d", binCount);
                break;
            }
        }
    }
}
