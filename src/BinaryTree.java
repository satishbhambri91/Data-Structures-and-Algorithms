class Node{
    int key;
    Node left, right;

    public Node(int item){
        key = item;
        left = null;
        right = null;
    }
}
public class BinaryTree {
    Node root;
    BinaryTree(){
        root = null;
    }

    void postOrder(Node node){
        if(node == null){
            return;
        }

        postOrder(node.left);
        postOrder(node.right);
        System.out.println(node.key + " ");
    }

    void  preOrder(Node node){
        if(node == null){
            return;
        }

        System.out.println(node.key + " ");
        preOrder(node.left);
        preOrder(node.right);
    }

    void inOrder(Node node){
        if(node == null){
            return;
        }
        inOrder(node.left);
        System.out.println(node.key + " ");
        inOrder(node.right);
    }

    void postOrder(){
        System.out.println("Post Order Traversal\n");
        postOrder(root);
    }

    void preOrder(){
        System.out.println("Pre Order Traversal\n");
        preOrder(root);
    }

    void inOrder(){
        System.out.println("In Order Traversal\n");
        inOrder(root);
    }


    public static void main(String[] args){
        BinaryTree tree = new BinaryTree();
        tree.root = new Node(10);
        tree.root.left = new Node(20);
        tree.root.right = new Node(30);
        tree.root.left.left = new Node(40);
        tree.root.left.right = new Node(50);

        tree.inOrder();
        tree.preOrder();
        tree.postOrder();
    }
}
