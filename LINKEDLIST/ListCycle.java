package LINKEDLIST;

public class ListCycle {
    private class ListNode {
        int val;
        ListNode next;
        public ListNode(int val) {
          this.val = val;
          this.next = null;
        }
      }
    
        public boolean hasCycle(ListNode head) {
          ListNode slow = head;
          ListNode fast = head;
      
          while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
            if (slow == fast)
              return true;
          }
      
          return false;
        }
      }
      

