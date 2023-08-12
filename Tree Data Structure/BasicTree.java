// Class containing left and right child of current node and key value
class Node {

	int key;

	Node left, right;
	public Node(int item)
	{
		key = item;
		left = right = null;
	}
}

// A Java program to introduce Binary Tree
class BasicTree {
	
	// Root of Binary Tree
	Node root;
	
	// Constructors
	BasicTree(int key) {
         root = new Node(key); 
        }
	BasicTree() {
         root = null; 
        }
	public static void main(String[] args)
	{
		BasicTree tree = new BasicTree();
		
		// Create root
		tree.root = new Node(1);
		/* Following is the tree after above statement
		1
		/ \
		null null
		*/

		tree.root.left = new Node(2);
		tree.root.right = new Node(3);
		/* 2 and 3 become left and right children of 1
			1
			/ \
			2 3
		/ \ / \
	null null null null */
		tree.root.left.left = new Node(4);
		/* 4 becomes left child of 2
			1
			/ \
			2 3
			/ \ / \
		4 null null null
		/ \
		null null
		*/
	}
}
