package com.example;

public class ArrayQueue<T> {
    
    ArrayList<T> list;

    public ArrayQueue(){
        list = new ArrayList<>();
    }

    public String toString(){
        return String.valueOf(list);
    }

    public boolean isEmpty(){
        return list.isEmpty();
    }

    public int size(){
        return list.size();
    }

    public void add(T element){
        list.add(element);
    }

    public T peek(){
        return list.getFirst();
    }

    public T poll(){
        return list.removeFirst();
    }

}
