package com.zxy.advanced;

import java.util.ArrayList;
import java.util.Iterator;

public class TestIterator {
    public static void main(String[] args) {
        // 创建集合
        ArrayList<Integer> sites = new ArrayList<Integer>();
        sites.add(111);
        sites.add(222);
        sites.add(333);
        sites.add(444);
        sites.add(555);
        sites.add(666);

        // 获取迭代器
        Iterator<Integer> it = sites.iterator();

        // 输出集合中的第一个元素
        System.out.println(it.next());
        System.out.println("\n");

        while(it.hasNext()) {
            Integer next = it.next();
            System.out.println(next);
            if(next<333){
                it.remove();
            }
        }
        System.out.println("\n");
        System.out.println(sites);
    }
}
