package com.example.array;


public class ArrayList<T> {
    private int size;
    private int capacity;
    private T[] list;

    @SuppressWarnings("unchecked")
    public ArrayList(int capacity){ //Time complexity: O(1)
        this.size = 0;
        this.capacity = capacity;
        this.list = (T[]) new Object[capacity];
    }
    
    @SuppressWarnings("unchecked") //Time complexity: O(1)
    public ArrayList(){
        this.capacity = 10;
        this.size = 0;
        this.list = (T[]) new Object[capacity];
    }

    //check list attributes
    public int size(){ //Time complexity: O(1)
        return this.size;
    }
    
    public boolean isEmpty(){ //Time complexity: O(1)
        return size == 0;
    }

    //get value
    public T getAt(int index) throws IndexOutOfBoundsException{ //Time complexity: O(n)
        if (index < 0 || index >= size){
            throw new IndexOutOfBoundsException("Index " + index + " is out of bounds");
        }
        return list[index];
    }

    public boolean contains(T element){ //Time complexity: O(n)
        for (int i = 0; i < size; i++){
            if(list[i] == element){
                return true;
            }
        }
        return false;
    }

    public int indexOf(T element){ //Time complexity: O(n)
        for (int i = 0; i < size; i++){
            if (list[i] == element){
                return i;
            }
        }
        return -1;
    }
    
    //insert values
    public void add(T element){ //Time complexity: O(1)
        if(size == capacity){
            resize();
        }
        list[size] = element;
        size ++;
    }

    public void insert(int index, T element) throws IndexOutOfBoundsException { //time complexity: O(n)
        if (index < 0 || index >= size){
            throw new IndexOutOfBoundsException("Index " + index +" is out of bounds");
        }
        if(size == capacity){
            resize();
        }
        for (int i = size; i > index; i--){
            list[i] = list[i-1];
        }
        list[index] = element;
        size++;
    }

    public void setAt(int index, T element) throws IndexOutOfBoundsException { //Time complexity: O(n)
        if (index < 0 || index >= size){
            throw new IndexOutOfBoundsException("Index " + index +" is out of bounds");
        }
        list[index] = element;
    }

    //delete value
    public void deleteAt(int index) throws IndexOutOfBoundsException{
        if (index < 0 || index >= size){
            throw new IndexOutOfBoundsException("Index " + index +" is out of bounds");
        }
        for (int i = index; i < size-1; i++){
            list[index] = list[index+1];
        }
        size --;
    }
    
    public int getCapacity() {
        return capacity;
    }
    
    @SuppressWarnings("unchecked")
    private void resize(){ //Time complexity: O(n)
        capacity = capacity * 2;
        T[] newList = (T[]) new Object[capacity];
        for (int i = 0; i < capacity; i++){
            newList[i] = list[i];
        }
        list = newList;
    }

    @Override
    public String toString() {
        if (isEmpty()){
            return "[]";
        }

        String result = "[ " + list[0];
        for (int i = 1; i < size; i++){
            result += ", " + list[i];
        }
        result = result +" ]";

        return result;
    }
}
