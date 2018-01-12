import java.util.ArrayList;
import java.util.List;

//Improve on the code

class extendedNode
{
    int key;
    extendedNode left, right, parent;

    public extendedNode(int item){
        key = item;
        left = null;
        right = null;
//        previous = null;
        parent = null;
    }

}

public class InorderTraversalWithConstantSpace extends extendedNode{

    public InorderTraversalWithConstantSpace(int item){
        super(item);
    }

    public List<Integer> inorderTraversal( extendedNode root){
    List<Integer> result = new ArrayList<>();
    extendedNode previous = null;
    extendedNode current = root;
    extendedNode next;
    while (current!= null){
        if(current.parent == previous){
            // So we keep a check of if we are moving down the tree
            if(current.left != null){
                //We go to the left child of the node
                next = current.left;
            }
            else
            {
                // So since no more left child hence we add the data to the list, since inorder traversal
                result.add(current.key);
                //Now if right is not null we go to right or if it's null we go to the parent

                next = (current.right != null)? current.right : current.parent;
            }
        }
        else if(current.left == previous){ // Now if we are coming to the parent from the left child, ie, we are climbing up the tree
            result.add(current.key);
            // Now having done with the left, we go to the right if the right is there else back up the tree
            next = (current.right != null)? current.right : current.parent;
        }
        else {// This case represents having done with both the children so we go up
            next = current.parent;
        }

        previous = current;
        current = next;
    }

    return result;

    }


}
