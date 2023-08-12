
public class SearchTries {
        static class Node{
        Node[] children;
        boolean IsTerminal;

        public Node(){
            children = new Node[25];
            for(int i=0 ; i<26; i++){
                children[i] = null;
            }
            IsTerminal = false;
        }
    }
    static Node root = new Node();

    static void insert(String word){
        Node current = root;
        for(int i=0 ;i<word.length();i++){
            int index = word.charAt(i) - 'a';
            if(current.children[index] == null){
                current.children[index] = new Node();
            }

            if( i == word.length() - 1){
                current.children[index].IsTerminal = true;
                System.out.println("Word Inserted : "+ word);
            }
            current = current.children[index];
        }
    }
    static boolean search(String  word){
        Node current = root;
        for(int i=0 ;i<word.length();i++){
            int index = word.charAt(i) - 'a';

            Node node = current.children[index];

            if(node == null){
                return false;
            }
            if( i == word.length()-1 && node.IsTerminal == false){
                System.out.println("Word dont exist");
                return false;
            }
            current = current.children[index];
        }
        return true;
    }

    public static void main(String[] agrs){
        insert("bag");
        insert("apple");
        insert("queen");
        System.out.println(search("bag"));
    }
    
}
