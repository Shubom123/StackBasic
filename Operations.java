package com.stack;

public class Operations {
    public static void pushing() {
        MyStack linkedList = new MyStack();
        linkedList.push(70);
        linkedList.push(30);
        linkedList.push(56);
        linkedList.print();
        linkedList.peak();
    }
}
