
class Node{
    int key;
    Node left, right;
    Node(int item){
        key = item;
        left = right = null;
    }
}
public class PreorderTraversal {
    Node root;
    PreorderTraversal(int key){
        root = new Node(1);
    }
    PreorderTraversal(){
        root = null;
    }
    void preorderTraversal(Node node){
        if(node == null){
            return;
        }
        //Print the data on the node
        System.out.print(node.key+" ");
        //recurse on the left subtree
        preorderTraversal(node.left);
        //recurse on the right subtree
        preorderTraversal(node.right);
    }
    public static void main(String[] args){
        PreorderTraversal tree = new PreorderTraversal();
        tree.root = new Node(16);
        tree.root.left = new Node(2);
        tree.root.right = new Node(9); 
        tree.root.left.left = new Node(14);
        tree.root.right.left = new Node(15);
        tree.root.right.left.left = new Node(12);
        tree.root.right.left.right = new Node(18);
        tree.preorderTraversal(tree.root);
    }
}
