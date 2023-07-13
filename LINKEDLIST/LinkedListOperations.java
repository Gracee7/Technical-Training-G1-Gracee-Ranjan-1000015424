package LINKEDLIST;

import java.util.Scanner;

// creating node
class Node<T>{
    T data;
    Node<T> next;
    Node( T data){
        this.data = data;
        this.next = null;
    }
}
//connecting nodes
public class LinkedListOperations<T>{
    Scanner scanner = new Scanner(System.in);
    Node<T> head;
    Node<T> tail;
    void add(T data){
        Node<T> newNode = new Node<>(data);
        if(head == null){
           head = newNode;
           tail = newNode;
        }
        else{
            tail.next = newNode;
            tail = newNode;
        }
      
    }
    void addPositionWise(int position, T data){
        Node<T> newNode = new Node<>(data);
        // put the new node on head
        if(position == 0){
            newNode.next = head;
            return;
        }
        int i = 1;
        Node<T> temp = head;
        while(i<position){
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }
    void print(Node<T> start){
        Node<T> temp = start;
        while(temp != null){
            System.out.println(temp.data);
            temp = temp.next;
        }
       
    }
    void deletePositionWise(int position){
        if(head == null){
            System.out.println(" LinkedList is Empty ! ");
            return;
        }
        Node<T> temp;
        Node<T> temp2 = null;
        if(position ==0){
            Node<T>temp3 = head;
            temp = head.next;
            head = temp;
            temp3.next = null;
            temp3 = null;
            return;
        }
        int i = 1;
        temp = head;
        while(i<position){
            temp2 = temp;
            temp = temp.next;
            i++;
        }
        temp2.next = temp.next.next;
    }
    public static void main(String[] args){
        LinkedListOperations<Integer> opr = new LinkedListOperations<>();
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("1. Add");
            System.out.println("2. Print");
            System.out.println("3. Add Positionwise");
            System.out.println("4. Derletem Positionwise");
            System.out.println(" Enter choice......");
            int choice = sc.nextInt();
            switch(choice){
                case 1:
                opr.add(100);
                opr.add(200);
                opr.add(300);
                opr.add(500);
                opr.add(600);
                break;
                case 2:
                opr.print(opr.head);
                case 3:
                opr.addPositionWise(2,200);
                case 4:
                opr.deletePositionWise(2);
                default:
                System.out.println("Wrong Choice.........");
            }
        }
        //opr.add(100);

       /* Node<Integer> node = new Node<> (100);
        Node<Integer> node2 = new Node<> (200);
        node.next = node2;
        LinkedListOperations<Integer> l = new LinkedListOperations<>();
        l.print(node); */
    }
    
}
