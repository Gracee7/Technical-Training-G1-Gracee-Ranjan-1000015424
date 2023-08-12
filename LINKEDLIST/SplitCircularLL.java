package LINKEDLIST;

public class SplitCircularLL {

	static Node head, head1, head2;

	static class Node {

		int data;
		Node next, prev;

		Node(int d)
		{
			data = d;
			next = prev = null;
		}
	}

	void splitList()
	{
		Node slow_ptr = head;
		Node fast_ptr = head;

		if (head == null) {
			return;
		}

	
		while (fast_ptr.next != head
			&& fast_ptr.next.next != head) {
			fast_ptr = fast_ptr.next.next;
			slow_ptr = slow_ptr.next;
		}

			if (fast_ptr.next.next == head) {
			fast_ptr = fast_ptr.next;
		}

	
		head1 = head;

		if (head.next != head) {
			head2 = slow_ptr.next;
		}

		fast_ptr.next = slow_ptr.next;

		slow_ptr.next = head;
	}

	void printList(Node node)
	{
		Node temp = node;
		if (node != null) {
			do {
				System.out.print(temp.data + " ");
				temp = temp.next;
			} while (temp != node);
		}
	}

	public static void main(String[] args)
	{
		SplitCircularLL list = new SplitCircularLL();

	    head = new Node(12);
		head.next = new Node(56);
		head.next.next = new Node(2);
		head.next.next.next = new Node(11);
		head.next.next.next.next = head;

		System.out.println("Original Circular Linked list ");
		list.printList(head);

		// Split the list
		list.splitList();
		System.out.println("");
		System.out.println("First Circular List ");
		list.printList(head1);
		System.out.println("");
		System.out.println("Second Circular List ");
		list.printList(head2);
	}
}

