
class Node{
    int key;
    Node left,right;
public Node(int item){
    key = item;
    left = right = null;
}
}
public class InorderTraversal {
    Node root;
     InorderTraversal(int key){
        root = new Node(key);
    }
    InorderTraversal(){
        root = null;
    }
void Inorder(Node node){
    if(node == null){
        return;
    }
    //First recurse on left child
    Inorder(node.left);
    //Print the data on the node
    System.out.print(node.key+" ");
    //Recurse on the right child
    Inorder(node.right);
}
    public static void main(String[] args){
        InorderTraversal tree = new InorderTraversal();
        tree.root = new Node(25);
        tree.root.left = new Node(21);
        tree.root.right = new Node(4);
        tree.root.left.left = new Node(8);
        tree.root.left.right = new Node(12);
        tree.root.right.left = new Node(6);
        tree.root.left.right.left = new Node(14); 
        tree.Inorder(tree.root);
    }
}
