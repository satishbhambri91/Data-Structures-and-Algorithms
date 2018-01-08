public class SymmetricCheck {

    public static void main(String[] args){
        SymmetricBinaryTree tree = new SymmetricBinaryTree();
        tree.root = new Node(10);
        tree.root.left = new Node(20);
        tree.root.right = new Node(20);
        tree.root.left.left = new Node(30);
        tree.root.left.right = new Node(40);
        tree.root.right.left = new Node(40);
        tree.root.right.right = new Node(30);


        boolean check = tree.isMirrorImage(tree.root);

        if(check){
            System.out.println("The tree is Symmetric !");
        }
        else
            System.out.println(" The tree is not Symmetric !");

    }

}

class SymmetricBinaryTree extends BinaryTreeChild{
    boolean isMirrorImage(Node nd1, Node nd2){

        if(nd1 == null && nd2 == null){
            return true;
        }

        if(nd1 != null && nd2 != null && nd1.key == nd2.key){
            return (isMirrorImage(nd1.left, nd2.right) && isMirrorImage(nd1.right, nd2.left));
        }

        /* Since only if the left subtree of first node and right subtree of second node are mirror images and right subtree of first node and left subtree second node are mirror images only then can a binary tree be a mirror image */


        return false;
    }

    boolean isMirrorImage(Node node){
        return isMirrorImage(node, node);
    }
}
