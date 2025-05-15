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
    private void resizeUp(){
        capacity = capacity * 2;
        T[] new_list = (T[]) new Object[capacity];
        for (int i = 0; i < size; i++){
            new_list[i] = list[i];
        }
        list = new_list;
    }

    @SuppressWarnings("unchecked")
    private void resizeDown(){
        capacity = capacity / 2;
        T[] new_list = (T[]) new Object[capacity];
        for (int i = 0; i < size; i++){
            new_list[i] = list[i];
        }
        list = new_list;
    }

    public String toString(){
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

    public void add(int index, T element){
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

    public void add(T element){
        add(size, element);
    }

    public void addLast(T element){
        add(size, element);
    }

    public void addFirst(T element){
        add(0, element);
    }

    public boolean contains(T element){
        for (int i = 0; i < size; i ++){
            if (element.equals(list[i])){
                return true;
            }
        }
        return false;
    }

    public int indexOf(T element){
        for (int i = 0; i < size; i++){
            if (element.equals(list[i])){
                return i;
            }
        }

        return -1;
    }

    public int lastIndexOf(T element){
        int last_index = -1;

        for (int i = 0; i < size; i++){
            if (element.equals(list[i])){
                last_index = i;
            }
        }

        return last_index;
    }

    public T get(int index){
        if (index < 0 || index >= size){
            throw new IndexOutOfBoundsException("index: " + index +", size: " + size);
        }
        return list[index];
    }

    public T getFirst(){
        return list[0];
    }

    public T getLast(){
        return list[size-1];
    }
    
    public void set(int index, T element){
        if (index < 0 || index >= size){
            throw new IndexOutOfBoundsException("index: " + index + ", size: " + size);
        }
        list[index] = element;
    }

    public ArrayList<T> reversed(){
        ArrayList<T> result = new ArrayList<>(capacity);

        for (int i = size-1; i >= 0; i--){
            result.add(list[i]);
        }

        return result;
    }

    public ArrayList<T> reverseInPlace(){
        int mid = (size-1)/2;
        for (int i = 0; i <= mid; i++){
            T temp = list[i];
            list[i] = list[size-1-i];
            list[size-1-i] = temp;
        }
        return this;
    }

    public T remove(int index){
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

    public T removeFirst(){
        return remove(0);
    }
 
    public T removeLast(){
        return remove(size -1);
    }

    @SuppressWarnings("unchecked")
    public void clear(){
        capacity = 10;
        list = (T[]) new Object[capacity];
        size = 0;
    }
}
