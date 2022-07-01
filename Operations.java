package com.stack;

public class Operations {
    public static void pushing() {
        MyStack stack = new MyStack();
        stack.push(70);
        stack.push(30);
        stack.push(56);
        stack.print();
        stack.peak();
    }
    public static void popping(){
        MyStack stack = new MyStack();
        stack.push(70);
        stack.push(30);
        stack.push(56);
        stack.print();
        while (MyStack.head!=null){
            stack.peak();
            stack.pop();
        }
    }
}
