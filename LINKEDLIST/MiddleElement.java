package LINKEDLIST;

class MiddleElement {
    static MiddleElement head = null;
    static MiddleElement tail = null;
    static MiddleElement temp = null;
    static MiddleElement temp1;
    MiddleElement next;
    int data;
    public static MiddleElement CreateNode(){
        MiddleElement node = new MiddleElement();
        return node;
    }
    public static void insertNode(int data1){
        MiddleElement newNode = CreateNode();
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
    public static MiddleElement findMiddle(){
        int count =0;
        temp = head;
        while(temp != null){
            temp = temp.next;
            count ++;
        }
        temp = head;
        int middle = count/2;
        for(int i=0;i<middle;i++){
           temp = temp.next;
        }
       // System.out.println(temp.data);
       //temp1 = temp;
        return temp; 
    }

    public static void insertInMiddle(int element){
        MiddleElement middletemp = new MiddleElement();
        MiddleElement newNode = CreateNode();
        middletemp = findMiddle();
       //System.out.println(middletemp.data);
        newNode.data = element;
        temp = middletemp;
        newNode.next = temp.next;  
        temp.next=newNode;
    }
    public static void display(){
        temp = head;
        while(temp != null){
            System.out.println(temp.data+" ");
            temp = temp.next;
        }
    }
    public static void main(String[] args){
       
        insertNode(1); 
        insertNode(2);
        insertNode(3);
        insertNode(4);
        insertNode(5);       
        display();
        //System.out.println("The Middle Element in the List is : ");
        System.out.println("New List with Middle element :- ");
        insertInMiddle(0);
        display();
    }
}
