package com.example;

public class Node<T> {
    private T element;
    private Node<T> next;
    
    public Node(T element) {
        this.element = element;
    }

    public String toString(){
        String string = String.valueOf(element);

        if (next != null){
            string = string + ", " + next;
        }
        return  string;
    }

    public T getElement() {
        return element;
    }

    public void setElement(T element) {
        this.element = element;
    }

    public Node<T> getNext() {
        return next;
    }

    public void setNext(Node<T> next) {
        this.next = next;
    }

    
}
