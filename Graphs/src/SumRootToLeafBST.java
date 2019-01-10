
public class SumRootToLeafBST {
	 public int sumNumbers(TreeNode root) {
	        if(root == null){
	            return 0;
	        }
	        
	        return dfs(root, 0, 0);
	        
	    }
	    
	    public int dfs(TreeNode node, int num, int sum){
	        
	        if(node == null){
	            return sum;
	        }
	        
	        num = num*10 + node.val;
	        
	        //base case
	        if(node.left == null && node.right == null){
	            sum = sum + num;
	            return sum;
	        }
	        
	        sum = dfs(node.left, num, sum) + dfs(node.right, num, sum);
	        
	        return sum;
	    }

}
