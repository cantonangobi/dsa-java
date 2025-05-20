package com.example;

public class Map<K,V> {
    private ArrayList<K> keys;
    private ArrayList<V> values;

    public Map(){
        keys = new ArrayList<>(16);
        values = new ArrayList<>(16);
    }

    public Map(int capacity){
        keys = new ArrayList<>(capacity);
        values = new ArrayList<>(capacity);
    }

    public String toString(){ //O(n)
        String result = "{";

        if (!keys.isEmpty()){
            for (int i = 0; i < keys.size(); i++){
                result = result + keys.get(i) +"=" + values.get(i);

                if (i+1 < keys.size()){
                    result += ", ";
                }
            }
        
        }

        result += "}";

        return result;
    }

    public boolean isEmpty(){
        return keys.isEmpty();
    }

    public int size(){
        return keys.size();
    }
    
    public ArrayList<K> keySet(){
        return keys;
    }

    public ArrayList<V> values(){
        return values;
    }

    public boolean containsKey(K key){ //O(n)
        return keys.contains(key);
    }

    public boolean containsValue(V value){ //O(n)
        return values.contains(value);
    }

    public void put(K key, V value){ //O(n) x 2 
        int index = keys.indexOf(key); //O(n)
        if (containsKey(key)){ //O(n)
            values.set(index, value); //O(1)
        }
        else{
            keys.add(key); //O(1)
            values.add(value); //O(1)
        }
    }

    public V get(K key){ // //O(n) x 2
        int index = keys.indexOf(key); //O(n)
        if (containsKey(key)){ //O(n)
            return values.get(index); //O(1)
        }

        return null;
    }

    public V remove(K key){ //O(n) x 3
        V element = get(key);
        int index = keys.indexOf(key); //O(n)

        if (index > 0){
            keys.remove(index); //O(n)
            values.remove(index); //O(n)
        }
        
        return element;
    }

    public void clear(){ //O(1)
        keys.clear();
        values.clear();
    }




    
    
}
