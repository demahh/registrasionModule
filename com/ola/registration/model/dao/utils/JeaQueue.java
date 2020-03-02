package com.ola.registration.model.dao.utils;

import java.util.LinkedList;

public class  JeaQueue <T>{

int maxSize;
LinkedList <T> items;

public JeaQueue(int maxSize){

    this.items=new LinkedList<T>();
    this.maxSize=maxSize;
}

public void enQueue(T items){

    if(isfull()){
        throw new RuntimeException("you cant enqueue it is full"); }

    this.items.addFirst(items);
}

    public T deQueue(){
    if (isempty()){
        throw new RuntimeException("empty queue");
    }
    T item =this.items.getLast();
    this.items.removeLast();
    return item;
}

public int size(){
    return this.items.size();
    }

    public boolean isfull() {

        return this.items.size()>=this.maxSize;
}

    public boolean isempty() {
    return this.items.size()==0;
}
}
