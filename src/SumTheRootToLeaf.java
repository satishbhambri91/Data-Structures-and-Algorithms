public class SumTheRootToLeaf extends BinaryTreeChild {

    public int sumRoottoLeaf( Node nd){
        return sumMethod(nd, 0);
    }

    public int sumMethod(Node nd, int calcSum){

        if(nd == null){
            return 0;
        }

        calcSum = 10*calcSum + nd.key;

        if(nd.left == null && nd.right == null){
            return calcSum;
        }

        return sumMethod(nd.left , calcSum) + sumMethod(nd.right , calcSum);
    }

    public static void main(String[] args) {

        SumTheRootToLeaf tree = new SumTheRootToLeaf();
        tree.root = new Node(5);
        tree.root.left = new Node(2);
        tree.root.right = new Node(3);
        tree.root.left.left = new Node(4);
        tree.root.left.right = new Node(5);
        tree.root.right.left = new Node(6);
        tree.root.right.right = new Node(7);

        int result = tree.sumRoottoLeaf(tree.root);

        System.out.println(result);

    }

}
