package LINKEDLIST;

class MyLinkedList {
  private class ListNode {
      int val;
      ListNode next;
      public ListNode(int val) {
          this.val = val;
          this.next = null;
      }
  }
  //ListNode head;
  int length = 0;
  ListNode dummy;  
  public int get(int index) {
      if (index < 0 || index >= length){
          return -1;
      }        
      ListNode curr = dummy;
      for (int i = 0; i < index; ++i){            
          curr = curr.next;
      }
      return curr.val;
  }
  public void addAtHead(int val) {
      ListNode node = new ListNode(val);
      node.next = dummy;
      dummy = node;
      ++length;
  }
 public void addAtTail(int val) {
      ListNode curr = dummy;
      while (curr.next != null){
          curr = curr.next;
      }        
      curr.next = new ListNode(val);
      ++length;
  }
  public void addAtIndex(int index, int val) {
      /*if (index > length){
          System.out.println("index is in valid");
          return;
      } */     
      ListNode curr = dummy;
      for (int i = 0; i < index; ++i){
          curr = curr.next;
      }        
      ListNode cache = curr.next;
      ListNode node = new ListNode(val);
      node.next = cache;
      curr.next = node;
      ++length;
  }
//   printing LinkedList
  void print(ListNode start){
      ListNode temp = start;
      while(temp != null){
          System.out.println(temp.val);
          temp = temp.next;
      }
  }  
  public void deleteAtIndex(int index) {
      if (index < 0 || index >= length){
          return;
      }
      ListNode curr = dummy;
      for (int i = 0; i < index; ++i){
          curr = curr.next;
      }
      ListNode cache = curr.next;
       curr.next = cache.next;
      --length;
  }
  public static void main (String[] args){
    MyLinkedList obj = new MyLinkedList();
     //int param_1 = obj.get(1);
     obj.addAtHead(10);
     obj.addAtTail(20);
     obj.addAtIndex(3,30);
     //obj.deleteAtIndex(2);
     //System.out.println(param_1);
     obj.print(obj.dummy);
  }
}