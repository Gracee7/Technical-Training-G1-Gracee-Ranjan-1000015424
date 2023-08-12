package LINKEDLIST;

public class PalindromeLinkedList {  
      
   
    class Node{  
        int data;  
        Node next;  
          
        public Node(int data) {  
            this.data = data;  
            this.next = null;  
        }  
    }  
   
    public int size;  
      
    public Node head = null;  
    public Node tail = null;  
      
    // For inserting new node  
    public void addNode(int data) {  
        
        Node newNode = new Node(data);  
          
          
        if(head == null) {  
            
            head = newNode;  
            tail = newNode;  
        }  
        else {  
             
            tail.next = newNode;  
            
            tail = newNode;  
        }  
        
        size++;  
    }  
      
    //Reverse the singly linked list and return the head of the list  
    public Node reverseList(Node temp){  
        Node current = temp;  
        Node prevNode = null, nextNode = null;  
          
       
        while(current != null){  
            nextNode = current.next;  
            current.next = prevNode;  
            prevNode = current;  
            current = nextNode;  
        }  
        return prevNode;  
    }  
      
    //Check given list is palindrome or not.  
    public void isPalindrome(){  
        Node current = head;  
        boolean flag = true;  
          
         
        int mid = (size%2 == 0)? (size/2) : ((size+1)/2);  
          
         
        for(int i=1; i<mid; i++){  
            current = current.next;  
        }  
          
       
        Node revHead = reverseList(current.next);  
   
          
        while(head != null && revHead != null){  
            if(head.data != revHead.data){  
                flag = false;  
                break;  
            }  
            head = head.next;  
            revHead = revHead.next;  
        }  
   
        if(flag)  
            System.out.println("Given singly linked list is a palindrome");  
        else  
            System.out.println("Given singly linked list is not a palindrome");  
    }  
      
    
        public void display() {  
             
            Node current = head;  
              
            if(head == null) {  
                System.out.println("List is empty");  
                return;  
            }  
            System.out.println("Nodes of singly linked list: ");  
            while(current != null) {  
                
                System.out.print(current.data + " ");  
                current = current.next;  
            }  
            System.out.println();  
    }  
          
    public static void main(String[] args) {  
          
        PalindromeLinkedList list = new PalindromeLinkedList();  
          
        
        list.addNode(1);  
        list.addNode(2);  
        list.addNode(3);  
        list.addNode(2);  
        list.addNode(1);  
          
        list.display();  
          
       
        list.isPalindrome();  
    }  
}  