package LINKEDLIST;


class PairWiseSwapLL {
    static PairWiseSwapLL head = null;
    static PairWiseSwapLL tail = null;
    static PairWiseSwapLL temp = null;
    PairWiseSwapLL next;
    int data;
    public static PairWiseSwapLL CreateNode(){
        PairWiseSwapLL node = new PairWiseSwapLL();
        return node;
    }
    public static void insertNode(int data1){
       PairWiseSwapLL newNode = CreateNode();
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

    void pairWiseSwap()
    {
        temp = head;
       
        while (temp != null && temp.next != null) {
          
            int k = temp.data;
            temp.data = temp.next.data;
            temp.next.data = k;
            temp = temp.next.next;
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
        PairWiseSwapLL llist = new PairWiseSwapLL();
        insertNode(1); 
        insertNode(2);
        insertNode(3);
        insertNode(4);
        insertNode(5);  
        System.out.println("Linked List before Pair Wise Swaping : ");     
        display();
        llist.pairWiseSwap();
        System.out.println("Linked List after Pair Wise Swaping : "); 
        display();
    }
}
