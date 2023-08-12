package LINKEDLIST;

import java.util.*;
public class NodeFromEnd {
    static NodeFromEnd head = null;
    static NodeFromEnd tail = null;
    static NodeFromEnd temp = null;
    NodeFromEnd next;
    NodeFromEnd find;
    int data;
    public static NodeFromEnd CreateNode(){
        NodeFromEnd node = new NodeFromEnd();  
        return node;
    }

    public static void insertNode(int data1){
        NodeFromEnd newNode = CreateNode();
        newNode.data = data1;
        if(head == null && tail == null){
            head = tail = newNode;
        }
        else{
            temp = tail;
            tail = newNode;
            temp.next = tail;
        }
    }

    public static void findNode(int find1){
        int len = 0;
        temp = head;
 
        // 1) count the number of nodes in Linked List
        while (temp != null) {
            temp = temp.next;
            len++;
        }
 
        // check if value of N is not more than length of
        // the linked list
        if (len < find1)
            return;
 
        temp = head;
 
        // 2) get the (len-N+1)th node from the beginning
        for (int i = 1; i < len - find1 + 1; i++)
            temp = temp.next;
 
        System.out.println(temp.data);
    }

    public static void display(){
        temp = head;
        while(temp != null){
            System.out.println(temp.data+" ");
            temp = temp.next;
        }
    }
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        insertNode(1); 
        insertNode(2);
        insertNode(3);
        insertNode(4);
        insertNode(5);
        display();
        System.out.println("Enter the Node you want to search from last : ");
        int find = sc.nextInt();
        System.out.println("Node from the last is : ");
        findNode(find);
           
        sc.close();
        
    }
}
