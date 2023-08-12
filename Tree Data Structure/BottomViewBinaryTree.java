/*Name:- Gracee Ranjan
 * Sap I'D:- 1000015424
 * Roll No.:- 200102443
 * Technical Training Group:- G1
 */
import java.util.*;

class BottomViewBinaryTree
{
static class Node
{
	int data;
	int horizontaldist;
	Node left, right;
	Node(int key)
	{
	data = key;
	horizontaldist = Integer.MAX_VALUE;
	left = right = null;
	}
}

static class pair {
	Node first;
	int second;
	pair(Node f, int s)
	{
	first = f;
	second = s;
	}
}

static void printBottomView(Node root)
{
	if (root == null)
	return; 
	HashMap<Integer, Integer> hash = new HashMap<>(); 
	int leftmost = 0; 
	Queue<pair> q = new ArrayDeque<>(); 
	q.add(new pair(	root, 0));
	while (!q.isEmpty()) {
	pair top = q.peek(); 
	q.remove();
	Node temp = top.first; 
	int ind = top.second; 
	hash.put(ind,temp.data);
	leftmost = Math.min(ind, leftmost);
	if (temp.left != null) {
		q.add(new pair(temp.left, ind - 1));
	}
	if (temp.right != null) {
		q.add(new pair(temp.right, ind + 1));
	} 
	}
	while (hash.containsKey(leftmost)) {
	System.out.print(
		hash.getOrDefault(leftmost++, 0) + " ");
	}
}

public static void main(String[] args)
{
	Node root = new Node(1);
	root.left = new Node(2);
	root.right = new Node(3);
	root.right.left = new Node(4);
	root.left.right = new Node(5);
	root.right.left = new Node(6);
	root.right.right = new Node(7);
	root.left.right.left = new Node(8);
	root.left.left.right = new Node(9);
	System.out.println("Bottom view of the Binary tree is as follows :");
	printBottomView(root);
}
}


