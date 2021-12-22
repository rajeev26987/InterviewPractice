package com.interview;

public class LinkedListImpl {
    public static void main(String[] args) {
        LinkedList<Integer> list = new LinkedList<>();
        list.add(1);
        list.add(2);
        list.add(3);
        list.add(4);
        list.add(5);

        list.printElemenets();
    }

    static class Node<T> {
        T data;
        Node<T> nxt;

        Node(T data){
            this.data = data;
            this.nxt = null;
        }
    }

    static class LinkedList<T>{
        Node<T> head;

        public void add(T data){
            Node<T> newNode = new Node<>(data);

            if(this.head == null){
                this.head = newNode;
            } else{
                Node<T> temp = this.head;
                while(temp.nxt != null){
                    temp = temp.nxt;
                }

                temp.nxt = newNode;
            }
        }

        public void printElemenets(){
            Node<T> head = this.head;
            while(head.nxt != null){
                System.out.println(head.data);
                head = head.nxt;
            }
        }
    }
}
