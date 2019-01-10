 class TreeNode {
     int val;
      TreeNode left;
      TreeNode right;
      TreeNode(int x) { val = x; }
  }

public class SymmetricBT {
	public boolean isSymmetric(TreeNode root) {
        if(root == null){
            return true;
        }
        
        return symmetricUtil(root.left, root.right);
        
    }
    
    boolean symmetricUtil(TreeNode left, TreeNode right){
        if(left == null && right == null){
            return true;
        }
        else if (left == null || right == null){
            return false;
        }
        
        if(left.val != right.val){
            return false;
        }
        
        
        if(!symmetricUtil(left.left, right.right)){
            return false;
        }
        
        if(!symmetricUtil(left.right, right.left)){
            return false;
        }
        
        
        return true;
    }

}
