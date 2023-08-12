public class CloneALinkedList {
    static class Node {
        int data;
        Node next;
        
        public Node(int head){
            this.data = head;
            this.next = null;
        }
    }

    static Node Clone(Node head){
        Node newlist = null;
        Node newnode = null;
        Node tmp = head;
        while(tmp!=null){
            if(newnode==null){
                newnode = new Node(tmp.data);
                newlist = newnode;
                tmp = tmp.next;
            }else{
                newnode.next = new Node(tmp.data);
                newnode = newnode.next;
                tmp = tmp.next;
            }
        }
        return newlist;
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
        //System.out.println(">>>>>>>>>>>>");
        Node copy = Clone(node);
        while(copy!=null){
            System.out.print(copy.data+" -> ");
            copy=copy.next;
        }
    }
}
