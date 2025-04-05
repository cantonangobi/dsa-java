package com.example;

import com.example.linkedlist.LinkedList;
import com.example.linkedlist.Node;

public class Main {
    public static void main(String[] args) {
        int element1 = 5;
        int element2 = 6;
        int element3 = 7;
        int element4 = 8;        



        LinkedList<Integer> list = new LinkedList<>();
        System.out.println(list);
        System.out.println("Empty? " + list.isEmpty());
        System.out.println();
        
        list.add(element1);
        System.out.println(list);
        System.out.println("Empty? " + list.isEmpty());
        System.out.println();

        list.add(element2);
        System.out.println(list);
        System.out.println("Empty? " + list.isEmpty());
        System.out.println();

        list.add(element3);
        list.add(element4);
        System.out.println(list);
        System.out.println("Empty? " + list.isEmpty());
        System.out.println();



        
    }
}