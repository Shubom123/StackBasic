package com.stack;

public class MyStack {
    public static Node head;
    Node tail;
    public Node push(int data){
        Node newNode = new Node(data);
        if(head==null){
            head = newNode;
            tail = newNode;
        }else {
            Node temp = head;
            this.head = newNode;
            newNode.next = temp;
        }
        return newNode;
    }
    public Node peak(){
        System.out.println("Peak is: "+ head);
        return head;
    }
    public void print(){
        if(head==null){
            System.out.println("Linked list is empty");
        }
        else{
            Node temp = head;
            while (temp!=null){
                System.out.println(temp.data+" ");
                temp = temp.next;
            }
        }
    }
    public Node pop(){
        Node tempNode = head;
        head = head.next;
        return tempNode;
    }
}
