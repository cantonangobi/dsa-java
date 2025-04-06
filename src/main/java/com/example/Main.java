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
        System.out.println("Size: " + list.size());
        System.out.println("Empty? " + list.isEmpty());
        System.out.println();
        
        list.pushBack(element1);
        System.out.println(list);
        System.out.println("Size: " + list.size());
        System.out.println("Empty? " + list.isEmpty());
        System.out.println();

        list.pushBack(element2);
        System.out.println(list);
        System.out.println("Size: " + list.size());
        System.out.println("Empty? " + list.isEmpty());
        System.out.println();

        list.pushBack(element3);
        list.pushBack(element4);
        System.out.println(list);
        System.out.println("Size: " + list.size());
        System.out.println("Empty? " + list.isEmpty());
        System.out.println();

        int num = 4;
        System.out.println("Is " + num + " present? " + list.contains(num));
        
        num = 5;
        System.out.println("Is " + num + " present? " + list.contains(num));

        
        num = 6;
        System.out.println("Is " + num + " present? " + list.contains(num));

        
        num = 8;
        System.out.println("Is " + num + " present? " + list.contains(num));

        
        num = 9;
        System.out.println("Is " + num + " present? " + list.contains(num));

        System.out.println();

        int index = 0;
        System.out.println("Element at " + index + " = " + list.getAt(index));

        index = 1;
        System.out.println("Element at " + index + " = " + list.getAt(index));

        index = 2;
        System.out.println("Element at " + index + " = " + list.getAt(index));

        index = 3;
        System.out.println("Element at " + index + " = " + list.getAt(index));

        System.out.println();
        index = 0;
        list.setAt(index, 9);
        System.out.println("Element at " + index + " = " + list.getAt(index));

        index = 1;
        list.setAt(index, 10);
        System.out.println("Element at " + index + " = " + list.getAt(index));

        index = 2;
        list.setAt(index, 11);
        System.out.println("Element at " + index + " = " + list.getAt(index));

        index = 3;
        list.setAt(index, 12);
        System.out.println("Element at " + index + " = " + list.getAt(index));

        System.out.println();

        System.out.println(list);
        System.out.println("Size: " + list.size());
        System.out.println("Empty? " + list.isEmpty());
        num = 11;
        System.out.println("Is " + num + " present? " + list.contains(num));
        System.out.println();

        list.deleteAt(2);
        System.out.println(list);
        System.out.println("Size: " + list.size());
        System.out.println("Empty? " + list.isEmpty());
        num = 11;
        System.out.println("Is " + num + " present? " + list.contains(num));
        System.out.println();

        list.pushBack(13);
        System.out.println(list);
        System.out.println("Size: " + list.size());
        System.out.println("Empty? " + list.isEmpty());
        System.out.println();

        list.deleteAt(0);
        System.out.println(list);
        System.out.println("Size: " + list.size());
        System.out.println("Empty? " + list.isEmpty());
        num = 13;
        System.out.println("Is " + num + " present? " + list.contains(num));
        System.out.println();

        list.deleteAt(2);
        System.out.println(list);
        System.out.println("Size: " + list.size());
        System.out.println("Empty? " + list.isEmpty());
        num = 13;
        System.out.println("Is " + num + " present? " + list.contains(num));
        System.out.println();

        System.out.println(list);
        System.out.println("Size: " + list.size());
        System.out.println();
        
        list.insertAt(0, 9);
        System.out.println(list);
        System.out.println("Size: " + list.size());
        System.out.println();

        list.insertAt(2, 11);
        System.out.println(list);
        System.out.println("Size: " + list.size());
        System.out.println();

        list.insertAt(4, 13);
        System.out.println(list);
        System.out.println("Size: " + list.size());
        System.out.println();
        
        list.delete(11);
        System.out.println(list);
        System.out.println("Size: " + list.size());

        list.delete(13);
        System.out.println(list);
        System.out.println("Size: " + list.size());

        list.insertAt(0, 8);
        list.pushFront(7);
        System.out.println(list);
        System.out.println("Size: " + list.size());

        System.out.println("Index of 7 is " + list.indexOf(7));
        System.out.println("Index of 9 is " + list.indexOf(9));
        System.out.println("Index of 10 is " + list.indexOf(10));
        System.out.println("Index of 12 is " + list.indexOf(12));
        
    }
}