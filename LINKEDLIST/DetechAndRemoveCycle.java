package LINKEDLIST;

class DetechAndRemoveCycle {

	static Node head;

	static class Node {

		int data;
		Node next;

		Node(int d)
		{
			data = d;
			next = null;
		}
	}

	// Function that detects loop in the list
	void detectAndRemoveCycle(Node node)
	{
		if (node == null || node.next == null)
			return;

		Node slow = node, fast = node;
		slow = slow.next;
		fast = fast.next.next;

		// Search for loop using slow and fast pointers
		while (fast != null && fast.next != null) {
			if (slow == fast)
				break;

			slow = slow.next;
			fast = fast.next.next;
		}

		if (slow == fast) {
			slow = node;
			if (slow != fast) {
				while (slow.next != fast.next) {
					slow = slow.next;
					fast = fast.next;
				}
             
				fast.next = null; 
			}
		
			else {
				while(fast.next != slow) {
					fast = fast.next;
				}
				fast.next = null;
			}
		}
	}

	// Function to print the linked list
	void printList(Node node)
	{
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
	}

	// Driver code
	public static void main(String[] args)
	{
		DetechAndRemoveCycle list = new DetechAndRemoveCycle();
		head = new Node(50);
		head.next = new Node(20);
		head.next.next = new Node(15);
		head.next.next.next = new Node(4);
		head.next.next.next.next = new Node(10);

		head.next.next.next.next.next = head.next.next;
		list.detectAndRemoveCycle(head);
		System.out.println("Linked List after removing loop : ");
		list.printList(head);
	}
}


