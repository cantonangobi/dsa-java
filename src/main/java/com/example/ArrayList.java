package com.example;

public class ArrayList<T> {
    private T[] list;
    private int size;
    private int capacity;

    @SuppressWarnings("unchecked")
    public ArrayList(){
        capacity = 10;
        size = 0;
        list = (T[]) new Object[capacity];
    }

    @SuppressWarnings("unchecked")
    public ArrayList(int capacity){
        this.capacity = capacity;
        size = 0;
        list = (T[]) new Object[capacity];
    }

    @SuppressWarnings("unchecked")
    private void resizeUp(){ //O(n)
        capacity = capacity * 2;
        T[] new_list = (T[]) new Object[capacity];
        for (int i = 0; i < size; i++){
            new_list[i] = list[i];
        }
        list = new_list;
    }

    @SuppressWarnings("unchecked")
    private void resizeDown(){ //O(n)
        capacity = capacity / 2;
        T[] new_list = (T[]) new Object[capacity];
        for (int i = 0; i < size; i++){
            new_list[i] = list[i];
        }
        list = new_list;
    }

    public String toString(){ //O(n)
        String string = "[";

        for (int i = 0; i < size; i++){
            string = string + list[i];
            if (i + 1 < size){
                string += ", ";
            }
        }

        return string + "]";
    }

    public boolean isEmpty(){
        return size == 0;
    }

    public int size(){
        return size;
    }

    public void add(int index, T element){ //O(n)
        if (index < 0 || index > size){
            throw new IndexOutOfBoundsException("index: " + index + ", size: " + size);
        }
        if (size == capacity){
            resizeUp();
        }
        for (int i = size-1; i >= index; i--){
            list[i + 1] = list[i];
        }
        list[index] = element;
        size += 1;
    }

    public void add(T element){ //O(1)
        add(size, element);
    }

    public void addLast(T element){ //O(1)
        add(size, element);
    }

    public void addFirst(T element){ //O(1)
        add(0, element);
    }

    public boolean contains(T element){ //O(n)
        for (int i = 0; i < size; i ++){
            if (element.equals(list[i])){
                return true;
            }
        }
        return false;
    }

    public int indexOf(T element){ //O(n)
        for (int i = 0; i < size; i++){
            if (element.equals(list[i])){
                return i;
            }
        }

        return -1;
    }

    public int lastIndexOf(T element){ //O(n)
        int last_index = -1;

        for (int i = 0; i < size; i++){
            if (element.equals(list[i])){
                last_index = i;
            }
        }

        return last_index;
    }

    public T get(int index){ //O(1)
        if (index < 0 || index >= size){
            throw new IndexOutOfBoundsException("index: " + index +", size: " + size);
        }
        return list[index];
    }

    public T getFirst(){ //O(1)
        return list[0];
    }

    public T getLast(){ //O(1)
        return list[size-1];
    }
    
    public void set(int index, T element){ //O(1)
        if (index < 0 || index >= size){
            throw new IndexOutOfBoundsException("index: " + index + ", size: " + size);
        }
        list[index] = element;
    }

    public ArrayList<T> reversed(){ //O(n)
        ArrayList<T> result = new ArrayList<>(capacity); 

        for (int i = size-1; i >= 0; i--){
            result.add(list[i]); //O(1)
        }

        return result;
    }

    public ArrayList<T> reverseInPlace(){ //O(n)
        int mid = (size-1)/2;
        for (int i = 0; i <= mid; i++){
            T temp = list[i];
            list[i] = list[size-1-i];
            list[size-1-i] = temp;
        }
        return this;
    }

    public T remove(int index){ //O(n)
        if (index < 0 || index >= size){
            throw new IndexOutOfBoundsException("index: " + index + ", size: " + size);
        }
        T element = list[index];
        for (int i = index; i < size-1; i++){
            list[i] = list[i + 1];
        }
        size -= 1;
        if (size * 2 < capacity && capacity > 10){
            resizeDown();
        }
        return element;
    }

    public T removeFirst(){ //O(n)
        return remove(0);
    }
 
    public T removeLast(){ //O(1)
        return remove(size -1);
    }

    @SuppressWarnings("unchecked")
    public void clear(){ //O(1)
        capacity = 10;
        list = (T[]) new Object[capacity];
        size = 0;
    }
}
