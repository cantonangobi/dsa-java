package com.example;

public class LinkedList<T> {
    private Node<T> first;
    private int size;

    public LinkedList(){
        first = null;
        size = 0;
    }

    public String toString(){ //O(n)
        String str = "[";
        if (!isEmpty()){
            str += String.valueOf(first); 
        }
        str += "]";
        return str;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public int size(){
        return size;
    }

    public void add(T element){ //O(n)
        // Node<T> newNode = new Node<T>(element);
        // if (head == null){
        //     head = newNode;
        // }
        // else{
        //     Node<T> currentNode = head;
        //     while (currentNode.getNext() != null){
        //         currentNode = currentNode.getNext();
        //     }
        //     currentNode.setNext(newNode);
        // }
        // size += 1;
        addLast(element);
    }

    public void add(int index, T element){ //O(n)
        if (index < 0 || index > size){
            throw new IndexOutOfBoundsException("index: " + index + ", size: " + size);
        }
        Node<T> newNode = new Node<T>(element);
        if (first == null){
            first = newNode;
        }
        else if (index == 0){
            newNode.setNext(first);
            first = newNode;
        }
        else{
            Node<T> currentNode = first;
            for (int i = 0; i < index-1; i++){
                currentNode = currentNode.getNext();
            }
            newNode.setNext(currentNode.getNext());
            currentNode.setNext(newNode);
        }
        size += 1;
        
    }

    public void addFirst(T element){ //O(1)
        add(0, element);
    }

    public void addLast(T element){ //O(n)
        add(size, element);
    }

    public boolean contains(T element){ //O(n)
        Node<T> currentNode = first;
        while (currentNode != null){
            if (element.equals(currentNode.getElement())){
                return true;
            }
            currentNode = currentNode.getNext();
        }

        return false;
    }

    public int indexOf(T element){ //O(n)
        int index = 0;

        Node<T> currentNode = first;
        while (currentNode != null){
            if (element.equals(currentNode.getElement())){
                return index;
            }
            index += 1;
            currentNode = currentNode.getNext();
        }

        return -1;
    }

    public int lastIndexOf(T element){ //O(n)
        int index = 0;
        int last_index = -1;

        Node<T> currentNode = first;
        while (currentNode != null){
            if (element == currentNode.getElement()){
                last_index = index;
            }
            index += 1;
            currentNode = currentNode.getNext();
        }

        return last_index;
    }

    public T get(int index){ //O(n)
        if (index < 0 || index >= size){
            throw new IndexOutOfBoundsException("index: " + index + ", size: " + size);
        }
        
        Node<T> currentNode = first;
        for (int i = 0; i < index; i++){
            currentNode = currentNode.getNext();
        }
        return currentNode.getElement();
    }
    
    public T getFirst(){ //O(1)
        return first.getElement();
    }
    
    public T getLast(){ //O(n)
        return get(size-1);
    }

    public void set(int index, T element){ //O(n)
        if (index < 0 || index >= size){
            throw new IndexOutOfBoundsException();
        }
        int counter = 0;
        Node<T> currentNode = first;
        while (counter < index){
            counter += 1;
            currentNode = currentNode.getNext();
        }
        currentNode.setElement(element);
    }

    public LinkedList<T> reversed(){ //O(n)
        LinkedList<T> result = new LinkedList<>();

        Node<T> currentNode = first;

        while (currentNode != null){
            result.addFirst(currentNode.getElement());
            currentNode = currentNode.getNext();
        }

        return result;
    }

    public LinkedList<T> reverseInPlace(){ //O(n)
        

        //loop through the list
        //keep track of the previous element
        //for each element, make it point to the previous element

        if (size > 1){
            Node<T> currentNode = first.getNext();
            Node<T> previousNode = first;
            while (currentNode != null){
                Node<T> nextNode = currentNode.getNext();
                currentNode.setNext(previousNode);
                previousNode = currentNode;
                first = currentNode;
                currentNode = nextNode;
            }
            
        }
        
        return this;
    }

    public T remove(int index){ //O(n)
        if (index < 0 || index >= size){
            throw new IndexOutOfBoundsException();
        }
        T result = first.getElement();
        if (size == 1){
            first = null;
        }
        else if (index == 0){
            first = first.getNext();
        }
        else{
            // Node<T> previousNode = null;
            Node<T> currentNode = first;
            for (int i = 0; i < index-1; i++){
                // previousNode = currentNode;
                currentNode = currentNode.getNext();
            }
            result = currentNode.getNext().getElement();
            currentNode.setNext(currentNode.getNext().getNext());

        } 
        size -= 1;
        return result;
    }

    public T removeFirst(){ //O(1)
        return remove(0);
    }
    
    public T removeLast(){ //O(n)
        return remove(size-1);
    }

    public void clear(){ //O(1)
        first = null;
        size = 0;
    }

}
