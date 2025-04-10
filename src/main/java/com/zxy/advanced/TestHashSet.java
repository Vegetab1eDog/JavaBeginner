package com.zxy.advanced;

import java.util.HashSet;

public class TestHashSet {
    public static void main(String[] args) {
        HashSet<String> hashSet = new HashSet<String>();
        hashSet.add("a");
        hashSet.add("b");
        hashSet.add("c");
        hashSet.add("d");
        hashSet.add("e");
        hashSet.add("a");
        System.out.println(hashSet);
        System.out.println("\n");
        System.out.println(hashSet.contains("a"));
        System.out.println("\n");
        System.out.println(hashSet.contains("aa"));
        System.out.println("\n");
        for (String str : hashSet) {
            System.out.println(str);
        }
        System.out.println("\n");
    }
}
