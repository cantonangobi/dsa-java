package com.example;

public class BinarySearchTree {
    private BSTNode root;

    public BinarySearchTree(){
        root = null;
    }

    public void add(int element){
        if (root == null){
            root = new BSTNode(element);
        }
        else{
            root.add(element);
        }
    }

    public boolean containsPreOrder(int element){

        return false;
    }

    public boolean containsInOrder(int element){
        
        return false;
    }

    public boolean containsPostOrder(int element){
        return false;
    }

    public String toStringPreOrder(){
        
        return "";
    }

    public String toStringInOrder(){
        
        return "";
    }
    public String toStringPostOrder(){
        
        return "";
    }
}
