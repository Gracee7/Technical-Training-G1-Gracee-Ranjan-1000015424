package LINKEDLIST;

public class RemoveNthNode {
    private class ListNode {
        int val;
        ListNode next;
        public ListNode(int val) {
          this.val = val;
          this.next = null;
        }
      }
    public ListNode removeNthFromEnd(ListNode head, int n) {
        ListNode slow = head;
        ListNode fast = head;
    
        while (n-- > 0)
          fast = fast.next;
        if (fast == null)
          return head.next;
    
        while (fast.next != null) {
          slow = slow.next;
          fast = fast.next;
        }
        slow.next = slow.next.next;
    
        return head;
      }
}
