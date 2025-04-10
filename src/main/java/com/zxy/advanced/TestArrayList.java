package com.zxy.advanced;

import java.util.ArrayList;
import java.util.Collections;

public class TestArrayList {
    public static void main(String[] args) {
        ArrayList<String> arrayList = new ArrayList<String>();
        arrayList.add("ddd");
        arrayList.add("ccc");
        arrayList.add("bbb");
        arrayList.add("aaa");
        System.out.println(arrayList);
        System.out.println(arrayList.get(1));
        arrayList.set(1, "aaaa");
        System.out.println(arrayList);
        arrayList.remove(1);
        System.out.println(arrayList);
        System.out.println(arrayList.size());
        for (String i : arrayList) {
            System.out.println(i);
        }
        arrayList.sort(null);
        Collections.sort(arrayList);
        System.out.println(arrayList);
    }
}
