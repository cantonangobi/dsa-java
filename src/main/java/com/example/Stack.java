package com.example;

public class Stack<T> {
    ArrayList<T> stack;

    public Stack(){
        stack = new ArrayList<>();
    }

    public String toString(){
        return String.valueOf(stack);
    }

    public boolean isEmpty(){
        return stack.isEmpty();
    }

    public int size(){
        //todo: implement
        return stack.size();
    }

    public void push(T element){
        stack.add(element);
    }

    public T peek(){
        return stack.getLast();
    }

    public T pop(){
        return stack.removeLast();
    }

}
