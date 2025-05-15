package com.example;

// import java.util.Stack;

public class Stack<T> {
    private LinkedList<T> list;

    public Stack(){
        list = new LinkedList<>();
    }

    public String toString(){
        return list.toString();
    }

    public boolean isEmpty(){
        return list.isEmpty();
    }
    
    public int size(){
        return list.size();
    }   

    public void push(T element){
        list.addFirst(element);
    }

    public T peek(){
        return list.getFirst();
    }

    public T pop(){
        return list.removeFirst();
    }
}
