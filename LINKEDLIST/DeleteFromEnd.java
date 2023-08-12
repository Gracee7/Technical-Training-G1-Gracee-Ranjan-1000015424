package LINKEDLIST;

class DeleteFromEnd {
    static DeleteFromEnd head = null;
    static DeleteFromEnd tail = null;
    static DeleteFromEnd temp = null;
    DeleteFromEnd next;
    int data;
    public static DeleteFromEnd CreateNode(){
        DeleteFromEnd node = new DeleteFromEnd();
        return node;
    }
    public static void insertNode(int data1){
        DeleteFromEnd newNode = CreateNode();
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

    static int length(DeleteFromEnd head)
  {
    temp = head;
    int count = 0;
    while (temp != null) {
      count++;
      temp = temp.next;
    }
    return count;
  }

    static DeleteFromEnd deleteNthNodeFromEnd(DeleteFromEnd head, int n)
  {
    int Length = length(head);
    int nodeFromBeginning = Length - n + 1;
    DeleteFromEnd prev = null;
    temp = head;
    for (int i = 1; i < nodeFromBeginning; i++) {
      prev = temp;
      temp = temp.next;
    }
    if (prev == null) {
      head = head.next;
      return head;
    }
    else {
      prev.next = prev.next.next;
      return head;
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
       
        insertNode(1); 
        insertNode(2);
        insertNode(3);
        insertNode(4);
        insertNode(5);  
        System.out.println("Linked List before Deletion:");     
        display();

        head = deleteNthNodeFromEnd(head, 4);

        System.out.println("Linked List after Deletion:");
        display();
    }
}