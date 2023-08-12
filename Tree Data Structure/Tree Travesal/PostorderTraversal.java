
class Node{
    int key;
    Node left,right;
    public Node(int item){
        key = item;
        left = right = null;
    }
}
public class PostorderTraversal {
    Node root;
     PostorderTraversal(int key){
        root = new Node(key);
    }
    PostorderTraversal(){
        root = null;
    }
void postorder(Node node){
    if(node == null){
        return;
    }
    //First recurse on left child
    postorder(node.left);
    //Recurse on the right child
    postorder(node.right);
    //Print the data on the node
    System.out.print(node.key+" ");
}
    public static void main(String[] args){
        PostorderTraversal tree = new PostorderTraversal();
        tree.root = new Node(12);
        tree.root.left = new Node(4);
        tree.root.right = new Node(6);
        tree.root.left.left = new Node(8);
        tree.root.left.right = new Node(5);
        tree.root.right.right = new Node(1);
        tree.root.left.right.left = new Node(3);
        tree.root.left.right.left.right = new Node(9); 
        tree.postorder(tree.root);
    }
}

