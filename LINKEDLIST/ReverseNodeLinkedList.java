package LINKEDLIST;

class ReverseNodeLinkedList {
    static ReverseNodeLinkedList head = null;
    static ReverseNodeLinkedList tail = null;
    static ReverseNodeLinkedList temp = null;
    ReverseNodeLinkedList next;
    int data;
    public static ReverseNodeLinkedList CreateNode(){
        ReverseNodeLinkedList node = new ReverseNodeLinkedList();
        return node;
    }
    public static void insertNode(int data1){
        ReverseNodeLinkedList newNode = CreateNode();
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
    ReverseNodeLinkedList reverse(ReverseNodeLinkedList node)
    {
        ReverseNodeLinkedList prev = null;
        ReverseNodeLinkedList current = node;
        next = null;
        while (current != null) {
            next = current.next;
            current.next = prev;
            prev = current;
            current = next;
        }
        node = prev;
        return node;
    }
    public static void display(){
        temp = head;
        while(temp != null){
            System.out.println(temp.data+" ");
            temp = temp.next;
        }
    }
    public static void main(String[] args){
        ReverseNodeLinkedList list = new ReverseNodeLinkedList();
        insertNode(1); 
        insertNode(2);
        insertNode(3);
        insertNode(4);
        insertNode(5); 
        System.out.println("LinkedList before reversing : ");      
        display();
        System.out.println("LinkedList after reversing : ");
        head = list.reverse(head);
        display();
    }
}
