package com.example.linkedlist;

public class LinkedList<T> {
    private Node<T> head;
    private int size;

    public LinkedList(){
        head = null;
        size = 0;
    }

    public LinkedList(Node<T> node){
        this.head = node;
        size = 1;
    }

    public LinkedList(T data){
        // Node<T> newNode = new Node<>(data);
        head = new Node<T>(data);
        size = 1;
    }

    public boolean isEmpty(){
        if (head == null){
            return true;
        }
        return false;
    }

    public Node<T> getHead() {
        return head;
    }
    
    public void add(T data){
        Node<T> newNode = new Node<T>(data);

        if (head == null){
            head = newNode;
            return;
        }

        Node<T> currentNode = head;

        while (currentNode.getNext() != null){
            currentNode = currentNode.getNext();
        }

        currentNode.setNext(newNode);
    }

    @Override
    public String toString() {
        String result = "[ " + head + " ]";
        
        return result;
    }
}
