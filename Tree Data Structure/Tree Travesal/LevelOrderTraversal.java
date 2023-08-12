
class Node{
    int key;
    Node left,right;
    public Node(int item){
        key =  item;
        left = right = null;
    }
}
public class LevelOrderTraversal {
    Node root;
    LevelOrderTraversal(){
        root = null;
    }
    void levelOrder(){
        int h = height(root);
        int i;
        for(i=0; i<=h; i++){
            printCurrentLevel(root,i);
        }
    }
    int height(Node root){
        if(root == null){
            return 0;
        }
        else{
            int lheight = height(root.left);
            int rheight = height(root.right);
            if(lheight > rheight){
                return (lheight+1);
            }
            else{
                return (rheight+1);
            }
        }
    }
    void printCurrentLevel(Node root,int level){
        if(root == null)
            return;
        if(level == 1)
            System.out.print(root.key + " ");
        if(level > 1){
            printCurrentLevel(root.left, level-1);
            printCurrentLevel(root.right, level-1);
        }
    }
    public static void main(String[] args){
        LevelOrderTraversal tree = new LevelOrderTraversal();
        tree.root = new Node(1);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);

        tree.levelOrder();
    }
}
