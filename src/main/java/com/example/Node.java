package com.example;

public class Node<T> {
    T element;
    Node<T> next;
    
    public Node(T element) {
        this.element = element;
    }

    public String toString(){
        //todo: implement
        return "";
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
