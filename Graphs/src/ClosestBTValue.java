
public class ClosestBTValue {
		double mdiff = Double.MAX_VALUE;
		TreeNode rNode;
	    public int closestValue(TreeNode root, double target) {
	        rNode = root;
	        ParseTree(root, target);
	        
	        return rNode.val;
	    }
	    
	    void ParseTree(TreeNode root, double target){
	        if(root == null){
	            return;
	        }
	        
	        if(Math.abs(root.val - target) < mdiff){
	            mdiff = Math.abs(root.val - target);
	            rNode = root;
	        }
	        
	        
	        if(target < root.val){
	            ParseTree(root.left, target);
	        }
	        else{
	            ParseTree(root.right, target);
	        }
	    }
	}

