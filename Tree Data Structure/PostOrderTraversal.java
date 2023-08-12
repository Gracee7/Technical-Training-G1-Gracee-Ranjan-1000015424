/* Name:- Gracee Ranjan
 * Sap I'D:- 1000015424
 * Roll No.:- 200102443
 * Group:- G1
 */

import java.util.Stack;

class Node
{
    int data;
    Node left, right;
 
    Node(int item)
    {
        data = item;
        left = right;
    }
}
 
class PostOrderTraversal
{
    Node root;
    private void postOrderIterative(Node root) {
        Stack<Node> stack = new Stack<>();
        while(true) {
            while(root != null) {
                stack.push(root);
                stack.push(root);
                root = root.left;
            }
            if(stack.empty()) return;
            root = stack.pop();
             
            if(!stack.empty() && stack.peek() == root) root = root.right;
             
            else {
                 
                System.out.print(root.data + " "); root = null;
            }
        }
    }

    public static void main(String args[])
    {
    PostOrderTraversal tree = new PostOrderTraversal();
    
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        System.out.println("Post order traversal of binary tree using Iteration is :");
        tree.postOrderIterative(tree.root);
    }
}