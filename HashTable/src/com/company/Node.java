package com.company;

public class Node <V>{
    public int key;
    public Node next;
    public V value;
    public Node(int key,V value){
        this.key = key;
        this.value = value;
        this.next = null;
    }
    public Node(){
        this.next = null;
    }
    public int getKey(){
        return this.key;
    }
    public V getValue(){
        return this.value;
    }





}
