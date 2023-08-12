package LINKEDLIST;

class AddBigNumberLL {

	static Node head1, head2;

	static class Node {

		int data;
		Node next;

		Node(int d) {
			data = d;
			next = null;
		}
	}

	
	void addTwoLists(Node first, Node second) {
		Node start1 = new Node(0);
		start1.next = first;
		Node start2 = new Node(0);
		start2.next = second;

		addPrecedingZeros(start1, start2);
		Node result = new Node(0);
		if (sumTwoNodes(start1.next, start2.next, result) == 1) {
			Node node = new Node(1);
			node.next = result.next;
			result.next = node;
		}
		printList(result.next);
	}

	
	private int sumTwoNodes(Node first, Node second, Node result) {
		if (first == null) {
			return 0;
		}
		int number = first.data + second.data + sumTwoNodes(first.next, second.next, result);
		Node node = new Node(number % 10);
		node.next = result.next;
		result.next = node;
		return number / 10;
	}

	
	private void addPrecedingZeros(Node start1, Node start2) {
		Node next1 = start1.next;
		Node next2 = start2.next;
		while (next1 != null && next2 != null) {
			next1 = next1.next;
			next2 = next2.next;
		}
		if (next1 == null && next2 != null) {
			while (next2 != null) {
				Node node = new Node(0);
				node.next = start1.next;
				start1.next = node;
				next2 = next2.next;
			}
		} else if (next2 == null && next1 != null) {
			while (next1 != null) {
				Node node = new Node(0);
				node.next = start2.next;
				start2.next = node;
				next1 = next1.next;
			}
		}
	}
	
	void printList(Node head) {
		while (head != null) {
			System.out.print(head.data + " ");
			head = head.next;
		}
		System.out.println("");
	}

	
	public static void main(String[] args) {
		AddBigNumberLL list = new AddBigNumberLL();

		// creating first list
		head1 = new Node(7);
		head1.next = new Node(5);
		head1.next.next = new Node(9);
		head1.next.next.next = new Node(4);
		head1.next.next.next.next = new Node(6);
		System.out.print("First list is ");
		list.printList(head1);

		// creating second list
		head2 = new Node(8);
		head2.next = new Node(4);
		System.out.print("Second list is ");
		list.printList(head2);

		System.out.print("Resultant list is ");
		// add the two lists and see the result
		list.addTwoLists(head1, head2);
	}

}

