package com.zxy.advanced;

import java.util.LinkedList;

public class TestLinkedList {
    public static void main(String[] args) {
        LinkedList<String> linkedList = new LinkedList<String>();
        linkedList.add("ddd");
        linkedList.add("ccc");
        linkedList.add("bbb");
        linkedList.add("aaa");
        linkedList.addFirst("eee");
        linkedList.addLast("fff");
        System.out.println(linkedList);
        System.out.println("\n");
        linkedList.removeFirst();
        linkedList.removeLast();
        System.out.println(linkedList);
        System.out.println("\n");
        System.out.println(linkedList.getFirst());
        System.out.println("\n");
        System.out.println(linkedList.getLast());
        System.out.println("\n");
        for (String i : linkedList) {
            System.out.println(i);
        }
        System.out.println("\n");
        for (int size = linkedList.size(),i=0; i<size; i++) {
            System.out.println(linkedList.get(i));
        }
        System.out.println("\n");

    }
}
