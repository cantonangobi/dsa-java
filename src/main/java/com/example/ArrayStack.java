package com.example;

import java.util.EmptyStackException;

public class ArrayStack<T> {
    ArrayList<T> list;

    public ArrayStack(){
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

    public void push(T element){
        list.add(element);
    }

    public T peek(){
        if (isEmpty()){
            throw new EmptyStackException();
        }
        return list.getLast();
    }

    public T pop(){
        if (list.isEmpty()){
            throw new EmptyStackException();
        }
        return list.removeLast();
    }

}
