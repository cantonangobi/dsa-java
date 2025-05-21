package com.example;

public class HashMap<K, V> {
    // private ArrayList<K> keys;
    private ArrayList<LinkedList<Pair<K,V>>> map;
    private int size;
    private int capacity;

    public HashMap(){
        capacity = 16;
        // keys = new ArrayList<>(capacity);
        map = new ArrayList<>(capacity);
        for (int i = 0; i < capacity; i++){
            map.add(new LinkedList<>());
        }
        size = 0;
    }

    public HashMap(int capacity){
        this.capacity = capacity;
        // keys = new ArrayList<>(capacity);
        map = new ArrayList<>(capacity);
        for (int i = 0; i < capacity; i++){
            map.add(new LinkedList<>());
        }
        size = 0;
    }

    private int getHash(K key){
        int index = key.hashCode();
        // System.out.println(index);
        return index % capacity;
    }
    
    public String toString(){
        String result = "{";

        for (int i = 0; i < map.size(); i++){
            // result = result + map.get(i) + "\n";
            LinkedList<Pair<K,V>> list = map.get(i);

            for (int j = 0; j < list.size(); j++){
                result = result + list.get(j);
                result += ",";
            }
            // if (i+1 < map.size()){
            //     result += ",";
            // }
        }
        return result + "}";
    }

    public boolean isEmpty(){

        return size == 0;
    }

    public int size(){

        return size;
    }
    
    public boolean containsKey(K key){
        int index = getHash(key);
        LinkedList<Pair<K,V>> list = map.get(index);
        for (int i = 0; i < list.size(); i++){
            if (list.get(i).getKey() == key){
                return true;
            }
        }
        return false;
        
    }   

    public boolean containsValue(V value){
        for (int i = 0; i < map.size(); i++){
            LinkedList<Pair<K,V>> list = map.get(i);
            for (int j = 0; j < list.size(); j++ ){
                if (value == list.get(j).getValue()){
                    return true;
                }
            }
        }
        return false;
    }

    public void put(K key, V value){
        int index = getHash(key);

        boolean key_exists = false;
        LinkedList<Pair<K,V>> mapped_list = map.get(index);
        for (int i = 0; i <mapped_list.size(); i++){
            if (mapped_list.get(i).getKey() == key){
                key_exists = true;
                mapped_list.get(i).setValue(value);
                break;
            }
        }
        if (!key_exists){
            mapped_list.addLast(new Pair<>(key,value));
            size += 1;
        }


    }

    public V get(K key){
        int index = getHash(key);
        LinkedList<Pair<K,V>> list = map.get(index);
        for (int i = 0; i < list.size(); i++){
            if (list.get(i).getKey() == key){
                return list.get(i).getValue();
            }
        }
        return null;
    }

    public ArrayList<K> keySet(){
        ArrayList<K> keys = new ArrayList<>();
        for (int i = 0; i < map.size(); i++){
            LinkedList<Pair<K,V>> list = map.get(i);
            for (int j = 0; j < list.size(); j++){
                keys.addLast(list.get(j).getKey());
            }
        }

        return keys;

    }
    public ArrayList<V> values(){
        ArrayList<V> values = new ArrayList<>();
        for (int i = 0; i < map.size(); i++){
            LinkedList<Pair<K,V>> list = map.get(i);
            for (int j = 0; j < list.size(); j++){
                values.addLast(list.get(j).getValue());
            }
        }

        return values;

    }

    public V remove(K key){
        int index = getHash(key);
        LinkedList<Pair<K,V>> list = map.get(index);
        for (int i = 0; i < list.size(); i++){
            if (key == list.get(i).getKey()){
                Pair<K,V> pair = list.get(i);
                list.remove(i);
                size --;
                return pair.getValue();
            }
        }
        return null;
    }

    public void clear(){
        map = new ArrayList<>(capacity);
        for (int i = 0; i < capacity; i++){
            map.add(new LinkedList<>());
        }
        size = 0;
    }

}
