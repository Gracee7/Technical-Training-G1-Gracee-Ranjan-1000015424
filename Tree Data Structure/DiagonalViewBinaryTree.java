/*Name:- Gracee Ranjan
 * Sap I'D:- 1000015424
 * Roll No.:- 200102443
 * Technical Training Group:- G1
 */
import java.util.*;

class Node {
	int data;
	Node left, right;
}

class DiagonalViewBinaryTree {

	public static List<Integer> diagonal(Node root)
	{
		List<Integer> diagonalVals = new ArrayList<>();
		if (root == null)
			return diagonalVals;
		Queue<Node> leftQueue = new LinkedList<>();
		Node node = root;

		while (node != null) {

			diagonalVals.add(node.data);
			if (node.left != null)
				leftQueue.add(node.left);
			if (node.right != null)
				node = node.right;
			else {
				if (!leftQueue.isEmpty()) {
					node = leftQueue.peek();
					leftQueue.remove();
				}
				else {
				 	node = null;
				}
			}
		}
		return diagonalVals;
	}
	public static Node newNode(int data)
	{
		Node node = new Node();
		node.data = data;
		node.left = node.right = null;
		return node;
	}
	public static void main(String[] args)
	{
		Node root = newNode(1);
		root.left = newNode(2);
		root.right = newNode(3);
		root.left.left = newNode(9);
		root.left.right = newNode(6);
		root.right.left = newNode(4);
		root.right.right = newNode(5);
		root.right.left.right = newNode(7);
		root.right.left.left = newNode(12);
		root.left.right.left = newNode(11);
		root.left.left.right = newNode(10);

		List<Integer> diagonalValues = diagonal(root);
		for (int i = 0; i < diagonalValues.size(); i++)
        {
			System.out.print(diagonalValues.get(i) + " ");
		}
		System.out.println();
	}
}



