import java.util.ArrayList;
import java.util.List;

public class LCAnoParent extends BinaryTreeChild {
    private List<Integer> list1 = new ArrayList<>();
    private List<Integer> list2 = new ArrayList<>();

    int locateLCA(int n1, int n2){
        list1.clear();
        list2.clear();

        return findLCA(root, n1, n2);
    }

    int findLCA(Node root, int n1, int n2){

        if(!findPath(root, n1, list1) || !findPath(root, n2, list2)) {

            System.out.println((list1.size() > 0) ? "First number/node is present" : "First number/node is missing");

            System.out.println((list2.size() > 0 ? "Second number/node is present" : "Second number/node is missing"));

            return -1;
        }
        int j;

        for(j = 0; j < list1.size() && j < list2.size(); j++){
            if(!list1.get(j).equals(list2.get(j))){
                break;
            }
        }
            return list1.get(j -1);

    }

    // Therefore findPath method returns true when the element being searched for in the binary tree is added.
    //If not found it returns false or returns false if the root is null

    private boolean findPath(Node root, int n, List<Integer> path){
        if(root == null){
            return false;
        }

        path.add(root.key);
        if(root.key == n){
            return true;

        }

        if(root.left != null && findPath(root.left, n, path)){
            return true;
        }

        if(root.right != null && findPath(root.right, n, path)){
            return true;
        }


        return false;
    }

    public static void main(String[] args) {
        LCAnoParent LCAtree = new LCAnoParent();
        LCAtree.root = new Node(10);
        LCAtree.root.left = new Node(20);
        LCAtree.root.right = new Node(30);
        LCAtree.root.left.left = new Node(40);
        LCAtree.root.left.right = new Node(50);
        LCAtree.root.right.left = new Node(60);
        LCAtree.root.right.right = new Node(70);

        System.out.println("LCA(4, 5): " + LCAtree.locateLCA(40,50));
        System.out.println("LCA(4, 6): " + LCAtree.locateLCA(40,60));
        System.out.println("LCA(3, 4): " + LCAtree.locateLCA(30,40));
        System.out.println("LCA(2, 4): " + LCAtree.locateLCA(20,4));
    }

}
