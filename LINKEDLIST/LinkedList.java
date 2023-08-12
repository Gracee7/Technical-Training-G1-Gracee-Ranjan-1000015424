package LINKEDLIST;

class LinkedList {
    static LinkedList head = null;
    static LinkedList tail = null;
    static LinkedList temp = null;
    LinkedList next;
    int data;
    public static LinkedList CreateNode(){
        LinkedList node = new LinkedList();
        return node;
    }
    public static void insertNode(int data1){
        LinkedList newNode = CreateNode();
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
    public static void display(){
        temp = head;
        while(temp != null){
            System.out.println(temp.data+" ");
            temp = temp.next;
        }
    }
    public static void main(String[] args){
       // LinkedList list = new LinkedList();
        insertNode(1); 
        insertNode(2);
        insertNode(3);
        insertNode(4);
        insertNode(5);       
        display();
    }
}
