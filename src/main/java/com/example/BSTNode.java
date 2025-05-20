package com.example;

public class BSTNode {
    private int element;
    private BSTNode left;
    private BSTNode right;


    public BSTNode(int element) {
        this.element = element;
    }


    public void add(int element){
        if (element < this.element){
            if (left == null){
                left = new BSTNode(element);
            }
            else{
                left.add(element);
            }
        }
        else{
            if (right == null){
                right = new BSTNode(element);
            }
            else{
                right.add(element);
            }
        }
    }

    public boolean contains(int element){
        if (element == this.element) {
            return true;
        }
        else if (element < this.element) {
            if (left == null){
                return false;
            }
            return left.contains(element);
        }
        else{
            if (right == null){
                return false;
            }
            return right.contains(element);
        }

        
    }

    public void printPreOrder(){
        
        System.out.println(element);
        if (left != null){
            left.printPreOrder();
        }
        if (right != null){
            right.printPreOrder();
        }
        
    }
    
    public void printInOrder(){
        
        if (left != null){
            left.printInOrder();
        }
        System.out.println(element);
        if (right != null){
            right.printInOrder();
        }
        
    }
    public void printPostOrder(){
        if (left != null){
            left.printPostOrder();
        }
        if (right != null){
            right.printPostOrder();
        }
        System.out.println(element);
        
    }

    

    public String toStringPreOrder(){
        String result = String.valueOf(element) + " ";

        if (left != null){
            result += left.toStringPreOrder();
        }
        if (right != null){
            result += right.toStringPreOrder();
        }
        return result;
    }

    public String toStringInOrder(){
        String result = "";

        if (left != null){
            result += left.toStringInOrder();
        }
        result = result + String.valueOf(element) + " ";
        if (right != null){
            result += right.toStringInOrder();
        }
        return result;
    }
    public String toStringPostOrder(){
        String result = "";

        if (left != null){
            result += left.toStringPostOrder();
        }
        if (right != null){
            result += right.toStringPostOrder();
        }
        result = result + String.valueOf(element) + " ";
        return result;
    }


    
    public int getElement() {
        return element;
    }
    public void setElement(int element) {
        this.element = element;
    }
    public BSTNode getLeft() {
        return left;
    }
    public void setLeft(BSTNode left) {
        this.left = left;
    }
    public BSTNode getRight() {
        return right;
    }
    public void setRight(BSTNode right) {
        this.right = right;
    }
    
}
