
public class BinaryTreeHeightBalanceCheck {

    public static void main(String[] args){
        BinaryTreeChild tree = new BinaryTreeChild();
        tree.root = new Node(10);
        tree.root.left = new Node(20);
        tree.root.right = new Node(30);
        tree.root.left.left = new Node(40);
        tree.root.left.right = new Node(50);

        boolean check = tree.isBalanced(tree.root);

        if(check){
            System.out.println("The tree is balanced !");
        }
        else
            System.out.println(" The tree is not balanced !");
    }

}

//The Binary Tree Child inherts from Binary Tree Class
class BinaryTreeChild extends BinaryTree{
    boolean isBalanced(Node node){
        int leftTreeHt;
        int rightTreeHt;

        if(node == null){
            return true;
        }

        leftTreeHt = computeHeight(node.left);
        rightTreeHt = computeHeight(node.right);

        if(Math.abs(leftTreeHt - rightTreeHt)<= 1 && isBalanced(node.left) && isBalanced(node.right)){
            return true;
        }
        return false;

    }

    int computeHeight(Node nd){
        if(nd == null){
            return 0;
        }
        return 1 + Math.max(computeHeight(nd.left), computeHeight(nd.right));

    }
}