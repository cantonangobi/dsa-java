package com.example;

// import java.util.ArrayList;
// import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public abstract class Tests {   
    
    public static void testArrayList(){
        System.out.println("Testing Array List:\n");

        //testing constructor, isEmpty, size and toString functions
        System.out.println("//testing constructor, isEmpty, size and toString functions...\n");
        ArrayList<Integer> list = new ArrayList<>();
        System.out.println("Is the list Empty? " + list.isEmpty());
        System.out.println("Size: " + list.size());
        System.out.println(list);
        System.out.println();

        //testing add, isEmpty and size functions
        System.out.println("//testing add, isEmpty and size functions...\n");
        list.add(3);
        System.out.println("Is the list Empty? " + list.isEmpty());
        System.out.println("Size: " + list.size());
        System.out.println(list);
        System.out.println();

        list.add(4);
        System.out.println("Is the list Empty? " + list.isEmpty());
        System.out.println("Size: " + list.size());
        System.out.println(list);
        System.out.println();

        list.add(5);
        list.add(6);
        list.add(7);
        list.add(8);
        list.add(9);
        list.add(2);
        list.add(8);
        System.out.println("Is the list Empty? " + list.isEmpty());
        System.out.println("Size: " + list.size());
        System.out.println(list);
        System.out.println();

        // list.add(10,8);
        // System.out.println("Is the list Empty? " + list.isEmpty());
        // System.out.println("Size: " + list.size());
        // System.out.println(list);
        // System.out.println();

        //testing addFirst function
        System.out.println("//testing addFirst function...\n");
        list.addFirst(2);
        System.out.println("Is the list Empty? " + list.isEmpty());
        System.out.println("Size: " + list.size());
        System.out.println(list);
        System.out.println();

        //testing addLast function
        System.out.println("//testing addLast function...\n");
        list.addLast(10);
        System.out.println("Is the list Empty? " + list.isEmpty());
        System.out.println("Size: " + list.size());
        System.out.println(list);
        System.out.println();

        //testing add at index function
        System.out.println("//testing add at index function...\n");
        list.add(4,11);
        System.out.println("Is the list Empty? " + list.isEmpty());
        System.out.println("Size: " + list.size());
        System.out.println(list);
        System.out.println();
        
        //testing contains function
        System.out.println("//testing contains function...\n");
        System.out.println("Does List contain 1? " + list.contains(1));
        System.out.println("Does List contain 2? " + list.contains(2));
        System.out.println("Does List contain 5? " + list.contains(5));
        System.out.println("Does List contain 8? " + list.contains(8));
        System.out.println("Does List contain 10? " + list.contains(10));
        System.out.println("Does List contain 12? " + list.contains(12));
        System.out.println();

        //testing indexof function
        System.out.println("//testing indexof function...\n");
        System.out.println("Index of 1: " + list.indexOf(1));
        System.out.println("Index of 2: " + list.indexOf(2));
        System.out.println("Index of 5: " + list.indexOf(5));
        System.out.println("Index of 8: " + list.indexOf(8));
        System.out.println("Index of 10: " + list.indexOf(10));
        System.out.println("Index of 12: " + list.indexOf(12));
        System.out.println();

        //testing set function
        System.out.println("//testing set function...\n");
        list.set(11,5);
        System.out.println("Is the list Empty? " + list.isEmpty());
        System.out.println("Size: " + list.size());
        System.out.println(list);
        System.out.println();

        //testing indexof function
        System.out.println("//testing indexof function...\n");
        System.out.println("Index of 1: " + list.indexOf(1));
        System.out.println("Index of 2: " + list.indexOf(2));
        System.out.println("Index of 5: " + list.indexOf(5));
        System.out.println("Index of 8: " + list.indexOf(8));
        System.out.println("Index of 10: " + list.indexOf(10));
        System.out.println("Index of 12: " + list.indexOf(12));
        System.out.println();
        
        //testing lastindexof function
        System.out.println("//testing lastindexof function...\n");
        System.out.println("Last Index of 1: " + list.lastIndexOf(1));
        System.out.println("Last Index of 2: " + list.lastIndexOf(2));
        System.out.println("Last Index of 5: " + list.lastIndexOf(5));
        System.out.println("Last Index of 8: " + list.lastIndexOf(8));
        System.out.println("Last Index of 10: " + list.lastIndexOf(10));
        System.out.println("Last Index of 12: " + list.lastIndexOf(12));
        System.out.println();

        //testing get, getfirst and getlast functions
        System.out.println("//testing get, getfirst and getlast functions...\n");
        // System.out.println("Value of index -1: " + list.get(-1));
        System.out.println("Value of index of 0: " + list.get(0));
        System.out.println("Value of index of 3: " + list.get(3));
        System.out.println("Value of index of 7: " + list.get(7));
        System.out.println("Value of index of 11: " + list.get(11));
        // System.out.println("Value of index of 12: " + list.get(12));
        System.out.println("First Element: " + list.getFirst());
        System.out.println("Last Element: " + list.getLast());
        System.out.println();
        
        //testing the set function
        System.out.println("//testing the set function...\n");
        list.set(0, 12);
        list.set(5, 13);
        list.set(8, 14);
        list.set(11, 15);
        System.out.println("Is the list Empty? " + list.isEmpty());
        System.out.println("Size: " + list.size());
        System.out.println(list);
        System.out.println();

        System.out.println("Does List contain 2? " + list.contains(2));
        System.out.println("Does List contain 6? " + list.contains(6));
        System.out.println("Does List contain 9? " + list.contains(9));
        System.out.println("Does List contain 12? " + list.contains(12));
        System.out.println("Does List contain 13? " + list.contains(13));
        System.out.println("Does List contain 14? " + list.contains(14));
        System.out.println("Does List contain 15? " + list.contains(15));
        System.out.println();

        //test remove function
        System.out.println("//testing remove function...\n");
        System.out.println(list);
        list.remove(5);
        System.out.println("Is the list Empty? " + list.isEmpty());
        System.out.println("Size: " + list.size());
        System.out.println(list);
        System.out.println();

        list.remove(8);
        System.out.println("Is the list Empty? " + list.isEmpty());
        System.out.println("Size: " + list.size());
        System.out.println(list);
        System.out.println();

        

        //test removeFirst function
        System.out.println("//testing removeFirst function...\n");
        list.removeFirst();
        System.out.println("Is the list Empty? " + list.isEmpty());
        System.out.println("Size: " + list.size());
        System.out.println(list);
        System.out.println();

        //test removeLast function
        System.out.println("//testing removeLast function...\n");
        list.removeLast();
        System.out.println("Is the list Empty? " + list.isEmpty());
        System.out.println("Size: " + list.size());
        System.out.println(list);
        System.out.println();

        //test reversed method
        System.out.println("//testing reversed method...\n");
        System.out.println(list.reversed());
        System.out.println();

         //test reverse in place method
         System.out.println("//testing reverse in place method...\n");
         list.reverseInPlace();
         System.out.println(list);
         System.out.println();

        //testing the clear method
        System.out.println("//testing the clear method...\n");
        list.clear();
        System.out.println("Is the list Empty? " + list.isEmpty());
        System.out.println("Size: " + list.size());
        System.out.println(list);
        System.out.println();

 
    }

    public static void testLinkedList(){
        System.out.println("Testing Linked List:\n");

        //testing constructor, isEmpty, size and toString functions
        System.out.println("//testing constructor, isEmpty, size and toString functions...\n");
        LinkedList<Integer> linked_list = new LinkedList<>();
        System.out.println("Is the list Empty? " + linked_list.isEmpty());
        System.out.println("Size: " + linked_list.size());
        System.out.println(linked_list);
        System.out.println();

        //testing add, isEmpty and size functions
        System.out.println("//testing add, isEmpty and size functions...\n");
        linked_list.add(3);
        System.out.println("Is the list Empty? " + linked_list.isEmpty());
        System.out.println("Size: " + linked_list.size());
        System.out.println(linked_list);
        System.out.println();

        linked_list.add(4);
        System.out.println("Is the list Empty? " + linked_list.isEmpty());
        System.out.println("Size: " + linked_list.size());
        System.out.println(linked_list);
        System.out.println();

        linked_list.add(5);
        linked_list.add(6);
        linked_list.add(7);
        linked_list.add(8);
        linked_list.add(9);
        linked_list.add(2);
        linked_list.add(8);
        System.out.println("Is the list Empty? " + linked_list.isEmpty());
        System.out.println("Size: " + linked_list.size());
        System.out.println(linked_list);
        System.out.println();

        //testing addLast, addFirst functions
        System.out.println("//testing addLast, addFirst functions...\n");
        linked_list.addLast(10);
        linked_list.addFirst(2);
        System.out.println("Is the list Empty? " + linked_list.isEmpty());
        System.out.println("Size: " + linked_list.size());
        System.out.println(linked_list);
        System.out.println();

        //testing add at index function
        System.out.println("//testing add at index function...\n");
        linked_list.add(4,11);
        System.out.println("Is the list Empty? " + linked_list.isEmpty());
        System.out.println("Size: " + linked_list.size());
        System.out.println(linked_list);
        System.out.println();
        
        //testing contains function
        System.out.println("//testing contains function...\n");
        System.out.println("Does List contain 1? " + linked_list.contains(1));
        System.out.println("Does List contain 2? " + linked_list.contains(2));
        System.out.println("Does List contain 5? " + linked_list.contains(5));
        System.out.println("Does List contain 8? " + linked_list.contains(8));
        System.out.println("Does List contain 10? " + linked_list.contains(10));
        System.out.println("Does List contain 12? " + linked_list.contains(12));
        System.out.println();

        //testing indexof function
        System.out.println("//testing indexof function...\n");
        System.out.println("Index of 1: " + linked_list.indexOf(1));
        System.out.println("Index of 2: " + linked_list.indexOf(2));
        System.out.println("Index of 5: " + linked_list.indexOf(5));
        System.out.println("Index of 8: " + linked_list.indexOf(8));
        System.out.println("Index of 10: " + linked_list.indexOf(10));
        System.out.println("Index of 12: " + linked_list.indexOf(12));
        System.out.println();

        //testing set function
        System.out.println("//testing set function...\n");
        linked_list.set(11,5);
        System.out.println("Is the list Empty? " + linked_list.isEmpty());
        System.out.println("Size: " + linked_list.size());
        System.out.println(linked_list);
        System.out.println();

        //testing indexof function
        System.out.println("//testing indexof function...\n");
        System.out.println("Index of 1: " + linked_list.indexOf(1));
        System.out.println("Index of 2: " + linked_list.indexOf(2));
        System.out.println("Index of 5: " + linked_list.indexOf(5));
        System.out.println("Index of 8: " + linked_list.indexOf(8));
        System.out.println("Index of 10: " + linked_list.indexOf(10));
        System.out.println("Index of 12: " + linked_list.indexOf(12));
        System.out.println();
        
        //testing lastindexof function
        System.out.println("//testing lastindexof function...\n");
        System.out.println("Last Index of 1: " + linked_list.lastIndexOf(1));
        System.out.println("Last Index of 2: " + linked_list.lastIndexOf(2));
        System.out.println("Last Index of 5: " + linked_list.lastIndexOf(5));
        System.out.println("Last Index of 8: " + linked_list.lastIndexOf(8));
        System.out.println("Last Index of 10: " + linked_list.lastIndexOf(10));
        System.out.println("Last Index of 12: " + linked_list.lastIndexOf(12));
        System.out.println();

        //testing get, getfirst and getlast functions
        System.out.println(linked_list);
        System.out.println("//testing get, getfirst and getlast functions...\n");
        // System.out.println("Value of index -1: " + linked_list.get(-1));
        System.out.println("Value of index of 0: " + linked_list.get(0));
        System.out.println("Value of index of 3: " + linked_list.get(3));
        System.out.println("Value of index of 7: " + linked_list.get(7));
        System.out.println("Value of index of 11: " + linked_list.get(11));
        // System.out.println("Value of index of 12: " + linked_list.get(5));
        System.out.println("First Element: " + linked_list.getFirst());
        System.out.println("Last Element: " + linked_list.getLast());
        System.out.println();
        
        //testing the set function
        System.out.println("//testing the set function...\n");
        linked_list.set(0, 12);
        linked_list.set(5, 13);
        linked_list.set(8, 14);
        linked_list.set(11, 15);
        System.out.println("Is the list Empty? " + linked_list.isEmpty());
        System.out.println("Size: " + linked_list.size());
        System.out.println(linked_list);
        System.out.println();

        System.out.println("Does List contain 2? " + linked_list.contains(2));
        System.out.println("Does List contain 6? " + linked_list.contains(6));
        System.out.println("Does List contain 9? " + linked_list.contains(9));
        System.out.println("Does List contain 12? " + linked_list.contains(12));
        System.out.println("Does List contain 13? " + linked_list.contains(13));
        System.out.println("Does List contain 14? " + linked_list.contains(14));
        System.out.println("Does List contain 15? " + linked_list.contains(15));
        System.out.println();

        //test remove function
        System.out.println("//testing remove function...\n");
        System.out.println(linked_list);
        linked_list.remove(8);
        System.out.println("Is the list Empty? " + linked_list.isEmpty());
        System.out.println("Size: " + linked_list.size());
        System.out.println(linked_list);
        System.out.println();

        //test removeFirst function
        System.out.println("//testing removeFirst function...\n");
        linked_list.removeFirst();
        System.out.println("Is the list Empty? " + linked_list.isEmpty());
        System.out.println("Size: " + linked_list.size());
        System.out.println(linked_list);
        System.out.println();

        //test removeLast function
        System.out.println("//testing removeLast function...\n");
        linked_list.removeLast();
        System.out.println("Is the list Empty? " + linked_list.isEmpty());
        System.out.println("Size: " + linked_list.size());
        System.out.println(linked_list);
        System.out.println();

        // //test reversed method
        // System.out.println("//testing reversed method...\n");
        // System.out.println(linked_list.reversed());
        // System.out.println();

        //test reverse in place method
        System.out.println("//testing reverse in place method...\n");
        linked_list.reverseInPlace();
        // System.out.println(linked_list);
        System.out.println(linked_list.get(0));
        System.out.println();

        //testing the clear method
        System.out.println("//testing the clear method...\n");
        linked_list.clear();
        System.out.println("Is the list Empty? " + linked_list.isEmpty());
        System.out.println("Size: " + linked_list.size());
        System.out.println(linked_list);
        System.out.println();

 
    }

    public static void testStack(){
        System.out.println("Testing Stack...\n");
        //testing the constructor, empty, size and toString methods
        System.out.println("//testing the constructor, empty, size and toString methods...\n");
        Stack<Integer> stack = new Stack<>();

        System.out.println("Is the stack empty? " + stack.isEmpty());
        System.out.println("Size: " + stack.size());
        System.out.println(stack);
        System.out.println();

        //testing push and peek
        System.out.println("//testing push and peek...\n");
        stack.push(3);
        System.out.println("Is the stack empty? " + stack.isEmpty());
        System.out.println("Size: " + stack.size());
        System.out.println(stack);
        System.out.println("On the top of the stack is: " + stack.peek());
        System.out.println();
        
        stack.push(4);
        System.out.println("Is the stack empty? " + stack.isEmpty());
        System.out.println("Size: " + stack.size());
        System.out.println(stack);
        System.out.println("On the top of the stack is: " + stack.peek());
        System.out.println();

        stack.push(5);
        stack.push(6);
        stack.push(7);
        stack.push(8);
        System.out.println("Is the stack empty? " + stack.isEmpty());
        System.out.println("Size: " + stack.size());
        System.out.println(stack);
        System.out.println("On the top of the stack is: " + stack.peek());
        System.out.println();

        //testing pop
        System.out.println("//testing pop function...\n");
        stack.pop();
        System.out.println("Is the stack empty? " + stack.isEmpty());
        System.out.println("Size: " + stack.size());
        System.out.println(stack);
        System.out.println("On the top of the stack is: " + stack.peek());
        System.out.println();

        System.out.println("Is the stack empty? " + stack.isEmpty());
        System.out.println("Size: " + stack.size());
        System.out.println(stack);
        System.out.println("On the top of the stack is: " + stack.pop());
        System.out.println("Is the stack empty? " + stack.isEmpty());
        System.out.println("Size: " + stack.size());
        System.out.println(stack);
        System.out.println("On the top of the stack is: " + stack.peek());
        System.out.println();

        stack.pop();
        stack.pop();
        stack.pop();
        System.out.println("Is the stack empty? " + stack.isEmpty());
        System.out.println("Size: " + stack.size());
        System.out.println(stack);
        System.out.println("On the top of the stack is: " + stack.pop());
        System.out.println("Is the stack empty? " + stack.isEmpty());
        System.out.println("Size: " + stack.size());
        System.out.println(stack);
        // System.out.println("On the top of the stack is: " + stack.peek());
        System.out.println();

        // stack.pop();
    }

    public static void testQueue(){
        System.out.println("Testing queue...\n");

        // //testing constructor, toString, isEmpty and size functions
        // System.out.println("//testing constructor, toString, isEmpty and size functions");
        // Queue<Integer> queue = new LinkedList<>();
        // System.out.println("is the queue empty? " + queue.isEmpty());
        // System.out.println("size: " + queue.size());
        // System.out.println(queue);


        // //testing add function
        // System.out.println("//testing add function...\n");
        // queue.add(3);
        // System.out.println("is the queue empty? " + queue.isEmpty());
        // System.out.println("size: " + queue.size());
        // System.out.println(queue);

        // queue.add(4);
        // System.out.println("is the queue empty? " + queue.isEmpty());
        // System.out.println("size: " + queue.size());
        // System.out.println(queue);

        // queue.add(5);
        // queue.add(6);
        // queue.add(7);
        // queue.add(8);
        // System.out.println("is the queue empty? " + queue.isEmpty());
        // System.out.println("size: " + queue.size());
        // System.out.println(queue);

        // //testing peek function
        // System.out.println("//testing peek function...\n");
        // System.out.println("The element in front of the queue is: " + queue.peek());
        // System.out.println();

        // //testing poll function
        // System.out.println("//testing poll function...\n");
        // System.out.println("removing " + queue.poll());
        // System.out.println("is the queue empty? " + queue.isEmpty());
        // System.out.println("size: " + queue.size());
        // System.out.println(queue);
        // System.out.println("The element in front of the queue is: " + queue.peek());
        // System.out.println();

        // System.out.println("removing " + queue.poll());
        // System.out.println("is the queue empty? " + queue.isEmpty());
        // System.out.println("size: " + queue.size());
        // System.out.println(queue);
        // System.out.println("The element in front of the queue is: " + queue.peek());
        // System.out.println();

        // queue.poll();
        // queue.poll();
        // System.out.println("removing " + queue.poll());
        // System.out.println("is the queue empty? " + queue.isEmpty());
        // System.out.println("size: " + queue.size());
        // System.out.println(queue);
        // System.out.println("The element in front of the queue is: " + queue.peek());
        // System.out.println();

        // System.out.println("removing " + queue.poll());
        // System.out.println("is the queue empty? " + queue.isEmpty());
        // System.out.println("size: " + queue.size());
        // System.out.println(queue);
        // System.out.println("The element in front of the queue is: " + queue.peek());
        // System.out.println();
        

    }

    public static void test(){
        
    }
}
