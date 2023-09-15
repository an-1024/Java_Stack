package com.anzhi.hashmapvshashtable;

import lombok.extern.slf4j.Slf4j;

import java.util.Hashtable;
import java.util.Map;

@Slf4j
public class HashtableDemo {
    public static void main(String[] args) {
        Map<String,String> table = new Hashtable<>();
        int size = table.size();
        log.info("table.size={}", size);
        table.put("null", "null");
    }
}
