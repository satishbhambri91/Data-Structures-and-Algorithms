public class LCA2noParent extends BinaryTreeChild {

    //Some error in the code : it gives StackOverflow error
    /*This method checks for if the values are equal to the root or if the root is null and calls the recursive function calls on the left subtree and the right subtree of the Binary tree*/
    public Node locateLCA(Node node, int v1, int v2){
        if(root == null){
            return null;
        }

        if(root.key == v1 || root.key == v2){
            return root;
        }

        Node leftside = locateLCA(root.left, v1, v2);
        Node rightside = locateLCA(root.right, v1, v2);

        if(leftside != null && rightside != null){
            return root;
        }
        else if(leftside == null && rightside == null){
            return null;
        }
        else {
            return leftside == null?rightside:leftside;
        }

    }

    public static void main(String[] args) {
        LCA2noParent tree = new LCA2noParent();
        tree.root = new Node(10);
        tree.root.left = new Node(20);
        tree.root.right = new Node(30);
        tree.root.left.left = new Node(40);
        tree.root.left.right = new Node(50);
        tree.root.right.left = new Node(60);
        tree.root.right.right = new Node(70);

        Node n = tree.locateLCA(tree.root, 40,50);

        System.out.println(n.key);
    }

}
