package com.example;

public class Queue<T> {
    private LinkedList<T> list;

    public Queue(){
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

    public void add(T element){
        list.addLast(element);
    }

    public T peek(){
        return list.getFirst();
    }

    public T poll(){
        return list.removeFirst();
    }
}
