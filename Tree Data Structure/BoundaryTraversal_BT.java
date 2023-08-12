/*Name:- Gracee Ranjan
 * Sap I'D:- 1000015424
 * Roll No.:- 200102443
 * Technical Training Group:- G1
 */
class Node {
	int data;
	Node left, right;

	Node(int item)
	{
		data = item;
		left = right = null;
	}
}

class BoundaryTraversal_BT {
	Node root;
	void printLeaves(Node node)
	{
		if (node == null)
			return;

		printLeaves(node.left);
			if (node.left == null && node.right == null)
			System.out.print(node.data + " ");
		printLeaves(node.right);
	}
	void printBoundaryLeft(Node node)
	{
		if (node == null)
			return;

		if (node.left != null) {
			System.out.print(node.data + " ");
			printBoundaryLeft(node.left);
		}
		else if (node.right != null) {
			System.out.print(node.data + " ");
			printBoundaryLeft(node.right);
		}
	}
	void printBoundaryRight(Node node)
	{
		if (node == null)
			return;

		if (node.right != null) {
			printBoundaryRight(node.right);
			System.out.print(node.data + " ");
		}
		else if (node.left != null) {
			printBoundaryRight(node.left);
			System.out.print(node.data + " ");
		}
	}
	void printBoundary(Node node)
	{
		if (node == null)
			return;

		System.out.print(node.data + " ");
		printBoundaryLeft(node.left);
		printLeaves(node.left);
		printLeaves(node.right);
		printBoundaryRight(node.right);
	}
	public static void main(String args[])
	{
		BoundaryTraversal_BT tree = new BoundaryTraversal_BT();
		tree.root = new Node(20);
		tree.root.left = new Node(6);
		tree.root.left.left = new Node(7);
		tree.root.left.right = new Node(0);
		tree.root.left.right.left = new Node(56);
		tree.root.left.right.right = new Node(23);
		tree.root.right = new Node(4);
		tree.root.right.right = new Node(9);
		tree.printBoundary(tree.root);
	}
}

