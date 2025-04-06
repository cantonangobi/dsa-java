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
 
    @Override
    public String toString() {
        if (head == null){
            return "[]";
        }

        String result = "[" + head + "]";
        
        return result;
    }

    //get size
    public int size(){
        return this.size;
    }

    public boolean isEmpty(){
        if (head == null){
            return true;
        }
        return false;
    }

    //insert nodes       
    public void pushBack(T data){ //O(n)
        Node<T> newNode = new Node<T>(data);

        if (head == null){
            head = newNode;
        }
        else{
            Node<T> currentNode = head;
            while (currentNode.getNext() != null){
                currentNode = currentNode.getNext();
            }
            currentNode.setNext(newNode);
        }       
        size ++;
    }

    public void pushFront(T data) { //O(n)
        Node<T> newNode = new Node<>(data);
        newNode.setNext(this.head);
        this.head = newNode;
        this.size ++;
    }

    public void insertAt(int index, T data) throws IndexOutOfBoundsException{ //O(n)
        if (index < 0 || index > size){
            throw new IndexOutOfBoundsException("Index out of Bounds");
        }
        
        if (index == 0){
            this.pushFront(data);
            return;
        }
        
        Node<T> new_node = new Node<T>(data);
        Node<T> prev_node = this.head;
        Node<T> next_node = this.head.getNext();
        for (int i = 1; i < index; i++){
            prev_node = next_node;
            next_node = next_node.getNext();
        }
        new_node.setNext(next_node);
        prev_node.setNext(new_node);
        size ++;


    }

    //change node value
    public void setAt(int index, T data) throws IndexOutOfBoundsException{
        if (index < 0 || index >= size){
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        Node<T> currentNode = head;
        for(int i = 0; i < index; i++){
            currentNode = currentNode.getNext();
        }

        currentNode.setData(data);

    }
    
    //get values
    public T getFront() {
        return head.getData();
    }

    public boolean contains(T data){ //O(n)
        Node<T> currentNode = head;
        while (currentNode != null){
            if (data.equals(currentNode.getData())){
                return true;
            }
            currentNode = currentNode.getNext();
        }
        return false;
    }

    public T getAt(int index) throws IndexOutOfBoundsException{
        if (index < 0 || index >= size){
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        Node<T> currentNode = head;
        for(int i = 0; i < index; i++){
            currentNode = currentNode.getNext();
        }

        return currentNode.getData();

    }
    
    public int indexOf(T data){
        Node<T> currNode = this.head;

        for (int i = 0; i < size; i++){
            if (data.equals(currNode.getData())){
                return i;
            }
            currNode = currNode.getNext();
        }

        return -1;
    }

    //delete
    public void deleteAt(int index) throws IndexOutOfBoundsException{
        if (index < 0 || index >= size){
            throw new IndexOutOfBoundsException("Index out of bounds");
        }

        if (index == 0){
            head = head.getNext();
        }
        else{
            Node<T> currentNode = head;
            Node<T> prevNode = currentNode;

            for (int i = 0; i < index; i++){
                prevNode = currentNode;
                currentNode = currentNode.getNext();
            }

            prevNode.setNext(currentNode.getNext());

        }

        size --;

    }

    public boolean delete(T data){
        if (data.equals(head.getData())){
            head = head.getNext();
            size --;
            return true;
        }

        Node<T> prev_node = this.head;
        Node<T> curr_node = this.head.getNext();
        while(curr_node != null){
            if (data.equals(curr_node.getData())){
                prev_node.setNext(curr_node.getNext());
                size --;
                return true;
            }
            prev_node = curr_node;
            curr_node = curr_node.getNext();
        }
        return false;
        
    }

}
