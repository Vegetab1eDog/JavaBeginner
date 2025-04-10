package com.zxy.advanced;

import java.util.HashMap;

public class TestHashMap {
    public static void main(String[] args) {
        HashMap<Integer,String> hm = new HashMap<>();
        hm.put(1,"a");
        hm.put(2,"b");
        hm.put(3,"c");
        hm.put(4,"d");
        System.out.println(hm);
        System.out.println("\n");
        System.out.println(hm.get(1));
        System.out.println("\n");
        hm.remove(2);
        System.out.println(hm);
        System.out.println("\n");
        System.out.println(hm.size());
        System.out.println("\n");
        for(Integer i : hm.keySet()){
            System.out.println(hm.get(i));
        }
        System.out.println("\n");
        for(String str : hm.values()){
            System.out.println(str);
        }
        System.out.println("\n");
    }
}
