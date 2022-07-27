package com.tejas;
public class IDRLinkedList {

    public static void main(String[] args) {

        MyLinkedList mll = new MyLinkedList();
        mll.insert(1);
        mll.insert(2);
        mll.insert(3);

        System.out.println("before"); 

        mll.printlist();
        mll.delete(3);

        System.out.println(); 
        System.out.println("after"); 
        mll.printlist();
    } 
}

class MyLinkedList {

    Node head;
    Node tail;

    public void insert(int element) {

        if (head == null) {
            Node node = new Node(element);
            head = node;
            tail = node;
        } else {
            Node node = new Node(element);
            tail.next = node;
            tail = node;
        }
    }

    public int delete(int element) {
        
        int data = element;
        Node temp = head;

        if (temp.data == element) {
            head = temp.next;
            return data; 
        }

        while (temp.next != null) {
            if (temp.data == element) {
                temp = temp.next.next;
            }
            temp = temp.next;
        }
        return data;
    }
    public void printlist() {

        Node temp = head;

        while (temp.next != null) {
            System.out.print(temp.data + "->"); 
            temp = temp.next;
        }
        System.out.print(temp.data); 
    }
}

class Node {

    int data;
    Node next;

    public Node(int data) {
        this.data = data;
    }
}
