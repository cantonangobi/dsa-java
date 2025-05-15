package com.example;

public class LinkedList<T> {
    Node<T> head;
    int size;

    public LinkedList(){
        head = null;
        size = 0;
    }

    public String toString(){
        String str = "[";
        if (!isEmpty()){
            str += String.valueOf(head);
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

    public void add(T element){
        Node<T> newNode = new Node<T>(element);
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
        size += 1;
    }

    public void add(int index, T element){
        if (index < 0 || index > size){
            throw new IndexOutOfBoundsException("index: " + index + ", size: " + size);
        }
        Node<T> newNode = new Node<T>(element);
        if (head == null){
            head = newNode;
        }
        else if (index == 0){
            newNode.setNext(head);
            head = newNode;
        }
        else{
            Node<T> currentNode = head;
            for (int i = 0; i < index-1; i++){
                currentNode = currentNode.getNext();
            }
            newNode.setNext(currentNode.getNext());
            currentNode.setNext(newNode);
        }
        size += 1;
        
    }

    public void addFirst(T element){
        add(0, element);
    }

    public void addLast(T element){
        add(size, element);
    }

    public boolean contains(T element){
        Node<T> currentNode = head;
        while (currentNode != null){
            if (element.equals(currentNode.getElement())){
                return true;
            }
            currentNode = currentNode.getNext();
        }

        return false;
    }

    public int indexOf(T element){
        int index = 0;

        Node<T> currentNode = head;
        while (currentNode != null){
            if (element.equals(currentNode.getElement())){
                return index;
            }
            index += 1;
            currentNode = currentNode.getNext();
        }

        return -1;
    }

    public int lastIndexOf(T element){
        int index = 0;
        int last_index = -1;

        Node<T> currentNode = head;
        while (currentNode != null){
            if (element == currentNode.getElement()){
                last_index = index;
            }
            index += 1;
            currentNode = currentNode.getNext();
        }

        return last_index;
    }

    public T get(int index){
        if (index < 0 || index >= size){
            throw new IndexOutOfBoundsException("index: " + index + ", size: " + size);
        }
        
        Node<T> currentNode = head;
        for (int i = 0; i < index; i++){
            currentNode = currentNode.getNext();
        }
        return currentNode.getElement();
    }
    
    public T getFirst(){
        return head.getElement();
    }
    
    public T getLast(){
        return get(size-1);
    }

    public void set(int index, T element){
        if (index < 0 || index >= size){
            throw new IndexOutOfBoundsException();
        }
        int counter = 0;
        Node<T> currentNode = head;
        while (counter < index){
            counter += 1;
            currentNode = currentNode.getNext();
        }
        currentNode.setElement(element);
    }

    public LinkedList<T> reversed(){
        LinkedList<T> result = new LinkedList<>();

        Node<T> currentNode = head;

        while (currentNode != null){
            result.addFirst(currentNode.getElement());
            currentNode = currentNode.getNext();
        }

        return result;
    }

    public LinkedList<T> reverseInPlace(){
        

        //loop through the list
        //keep track of the previous element
        //for each element, make it point to the previous element

        if (size > 1){
            Node<T> currentNode = head.getNext();
            Node<T> previousNode = head;
            while (currentNode != null){
                Node<T> nextNode = currentNode.getNext();
                // System.out.println(temp);
                // System.out.println(currentNode);
                // System.out.println(previousNode.getElement());
                currentNode.setNext(previousNode);
                previousNode = currentNode;
                head = currentNode;
                currentNode = nextNode;
            }
            
        }
        
        

        return this;
    }

    public T remove(int index){
        if (index < 0 || index >= size){
            throw new IndexOutOfBoundsException();
        }
        T result = head.getElement();
        if (size == 1){
            head = null;
        }
        else if (index == 0){
            head = head.getNext();
        }
        else{
            // Node<T> previousNode = null;
            Node<T> currentNode = head;
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

    public T removeFirst(){
        return remove(0);
    }
    
    public T removeLast(){
        return remove(size-1);
    }

    public void clear(){
        head = null;
        size = 0;
    }

}
