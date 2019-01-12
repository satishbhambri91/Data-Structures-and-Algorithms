import java.util.*;

public class LevelOrderBT {
	public List<List<Integer>> levelOrder(TreeNode root) {
        List<List<Integer>> results = new ArrayList<>();
        if(root == null)
            return results;
        
        Queue<TreeNode> q = new LinkedList<>();
        
        q.add(root);
        q.add(null);
        
        ArrayList<Integer> levelArr = new ArrayList<>();
        
        while(!q.isEmpty()) {
            TreeNode node = q.poll();
            levelArr.add(node.val);
            
            if(node.left!= null)
                q.add(node.left);
            
            if(node.right != null)
                q.add(node.right);
            
            if(q.peek() == null) {
                q.poll();
                results.add(new ArrayList<>(levelArr));
                levelArr = new ArrayList<>();
                
                if(!q.isEmpty()) {
                    q.add(null);
                }
            }
        }
        
        return results;
    }

}
