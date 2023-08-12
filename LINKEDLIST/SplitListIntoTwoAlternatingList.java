public class SplitListIntoTwoAlternatingList {
    static class Node {
        int data;
        Node next;
        
        public Node(int head){
            this.data = head;
            this.next = null;
        }
    }

    public static void alternatingSplitList(Node head){
        //Your code here
         Node odd = null;
         Node oddhead = null;
         Node even = null;
         Node evenhead = null;
         Node tmp = head;
         int i=1;
         while(tmp!=null){
             if(i%2==0){
                 if(even == null){
                     even = new Node(tmp.data);
                     tmp = tmp.next;
                     evenhead = even;
                     i++;
                 }else{
                     even.next = new Node(tmp.data);
                     tmp = tmp.next;
                     even = even.next;
                     i++;
                 }
             }
             else{
                 if(odd == null){
                     odd = new Node(tmp.data);
                     tmp = tmp.next;
                     oddhead = odd;
                     i++;
                 }else{
                     odd.next = new Node(tmp.data);
                     tmp = tmp.next;
                     odd = odd.next;
                     i++;
                 }
             }
         }
 
         tmp = oddhead;
         while(tmp!=null){
             System.out.print(tmp.data + " ");
             tmp = tmp.next;
         }
         
         System.out.println();
         
         tmp = evenhead;
         while(tmp!=null){
             System.out.print(tmp.data + " ");
             tmp = tmp.next;
         }
     }
    
    public static void main(String[] args) {
        
        Node head = new Node(10);
        Node node = head;
        head.next = new Node(20);
        head = head.next;
        head.next = new Node(30);
        head = head.next;
        head.next = new Node(40);
        head = head.next;
        head.next = new Node(50);
        head = head.next;
        head.next = new Node(60);
        head = head.next;

        alternatingSplitList(node);
    }
}
