/*Name:- Gracee Ranjan
 * Sap I'D:- 1000015424
 * Roll No.:- 200102443
 * Technical Training Group:- G1
 */
class Node {
	int data;
	Node left, right;
	Node(int d)
	{
		data = d;
		left = right = null;
	}
}

class BalancedTree {
	Node root;
	boolean isBalanced(Node node)
	{
		int lheight; 

		int rheight; 

		if (node == null)
			return true;

		lheight = height(node.left);
		rheight = height(node.right);

		if (Math.abs(lheight - rheight) <= 1 && isBalanced(node.left)&& isBalanced(node.right))
			return true;

		return false;
	}

	int height(Node node)
	{

		if (node == null)
			return 0;

		return 1+ Math.max(height(node.left),height(node.right));
	}

	public static void main(String args[])
	{
		BalancedTree tree = new BalancedTree();
		tree.root = new Node(1);
		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		tree.root.left.left = new Node(4);
		tree.root.left.right = new Node(5);
		tree.root.left.left.left = new Node(6);

		if (tree.isBalanced(tree.root))
            System.out.println("Tree is balanced");
		else
			System.out.println("Tree is not balanced");
	}
}

