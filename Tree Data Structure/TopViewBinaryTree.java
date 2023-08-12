/*Name:- Gracee Ranjan
 * Sap I'D:- 1000015424
 * Roll No.:- 200102443
 * Technical Training Group:- G1
 */
import java.util.*;

class TopViewBinaryTree {
	static class Node {
		Node left;
		Node right;
		int data;
	}

	static class pair {
		int first, second;

		pair() {}
		pair(int i, int j)
		{
			first = i;
			second = j;
		}
	}
	static TreeMap<Integer, pair> map = new TreeMap<>();
	static Node newNode(int key)
	{
		Node node = new Node();
		node.left = node.right = null;
		node.data = key;
		return node;
	}
	static void fillMap(Node root, int d, int l)
	{
		if (root == null)
			return;

		if (map.get(d) == null) {
			map.put(d, new pair(root.data, l));
		}
		else if (map.get(d).second > l) {
			map.put(d, new pair(root.data, l));
		}

		fillMap(root.left, d - 1, l + 1);
		fillMap(root.right, d + 1, l + 1);
	}
	static void topView(Node root)
	{
		fillMap(root, 0, 0);

		for (Map.Entry<Integer, pair> entry :
			map.entrySet()) {
			System.out.print(entry.getValue().first + " ");
		}
	}

	public static void main(String args[])
	{
		Node root = newNode(45);
		root.left = newNode(14);
		root.right = newNode(90);
		root.left.right = newNode(13);
        root.left.left = newNode(45);
		root.left.right.right = newNode(22);
		root.left.right.right.right = newNode(7);
		System.out.println("Top view of the Binary Tree is as Follow : ");
		topView(root);
	}
}


