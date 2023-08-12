package LINKEDLIST;


class FlatteningLL {
	Node head; 
	class Node {
		int data;
		Node right, down;
		Node(int data)
		{
			this.data = data;
			right = null;
			down = null;
		}
	}
	Node merge(Node a, Node b)
	{
	
		if (a == null)
			return b;

		if (b == null)
			return a;


		Node result;

		if (a.data < b.data) {
			result = a;
			result.down = merge(a.down, b);
		}

		else {
			result = b;
			result.down = merge(a, b.down);
		}

		result.right = null;
		return result;
	}

	Node flatten(Node root)
	{

		if (root == null || root.right == null)
			return root;

		root.right = flatten(root.right);

		root = merge(root, root.right);

			return root;
	}

	Node push(Node head_ref, int data)
	{
	
		Node new_node = new Node(data);

		new_node.down = head_ref;
		head_ref = new_node;
		return head_ref;
	}

	void printList()
	{
		Node temp = head;
		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.down;
		}
		System.out.println();
	}

	public static void main(String args[])
	{
		FlatteningLL L = new FlatteningLL();

		/* Let us create the following linked list
			1 -> 2 -> 3 -> 4
			| |	 |	 |
			V V	 V	 V
			5 6 7 8
			|		 |	 |
			V		 V	 V
			9		 10 11
			|			 |
			V			 V
			12			 13
		*/

		L.head = L.push(L.head, 12);
		L.head = L.push(L.head, 9);
		L.head = L.push(L.head, 5);
		L.head = L.push(L.head, 1);

		L.head.right = L.push(L.head.right, 4);
		L.head.right = L.push(L.head.right, 2);

		L.head.right.right = L.push(L.head.right.right, 10);
		L.head.right.right = L.push(L.head.right.right, 7);
		L.head.right.right = L.push(L.head.right.right, 3);

		L.head.right.right.right = L.push(L.head.right.right.right, 13);
		L.head.right.right.right = L.push(L.head.right.right.right, 11);
		L.head.right.right.right = L.push(L.head.right.right.right, 8);
		L.head.right.right.right = L.push(L.head.right.right.right, 6);
 
		L.head = L.flatten(L.head);

		L.printList();
	}
} 
