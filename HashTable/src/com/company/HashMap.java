package com.company;
import java.util.ArrayList;
public class HashMap <V>{

    public Node<V> hashTable[];
    //capacity of our array list
    public int numberofElements;
    //current size at any time
    public int capacity;

    public HashMap(int size){
        this.capacity = 0;
        this.numberofElements = size;
        this.hashTable = new Node[this.numberofElements];
        for (int i = 0 ; i <this.numberofElements;i++){
            hashTable[i] = null;
        }
    }
    public int getHash(int key){
        return key%numberofElements;
    }
    public void add(int key,V value) {
        int index = getHash(key);
        Node<V> HeadNode = hashTable[index];
        if (HeadNode == null) {
            HeadNode = new Node<V>(key,value);
            hashTable[index] = HeadNode;

        }else {
            Node<V> NewNode ;
            while (HeadNode.next != null){
                HeadNode = HeadNode.next;
            }
            NewNode = new Node<>(key,value);
            NewNode = HeadNode.next;



        }
        capacity++;
    }
    public V getValue(int key){
        int index = getHash(key);
        Node<V> HeadNode = hashTable[index];
        while (HeadNode != null){
            if (HeadNode.key == key)
                return HeadNode.value;
            HeadNode = HeadNode.next;

        }


        return null;
    }
    public int getCurrentsize(){
        return capacity;
    }
    public void Remove(int key)
    {
        int hashIndex = getHash(key);
        Node<V> currentNode = hashTable[hashIndex];
        if (currentNode != null){
            currentNode = null;
            hashTable[hashIndex] = currentNode;
        }


    }
    public void showHashMap(){
        for (int i = 0 ; i <capacity;i++){

            System.out.println(this.hashTable[i].key);
            System.out.println(this.hashTable[i].value);
        }
    }






    }











