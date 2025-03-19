class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
 
    TreeNode() {
    }
 
    TreeNode(int var1) {
       this.val = var1;
    }
 
    TreeNode(int var1, TreeNode var2, TreeNode var3) {
       this.val = var1;
       this.left = var2;
       this.right = var3;
    }
} 

public class hasPathSum1{
    public boolean hasPathSum(TreeNode root, int targetSum) {
        if(root==null) return false;
        targetSum = targetSum-root.val;
        if(root.left==null&&root.right==null) return targetSum == 0;
        if(root.left!=null){
            
            boolean left = hasPathSum(root.left,targetSum);
            if(left){
                return true;
            }
        }
        if(root.right!=null){
            boolean right = hasPathSum(root.right,targetSum);
            if(right){
                return true;
            }
        }
        return false;
    }
    public static void main(String[] args) {
        TreeNode var1 = new TreeNode(1);
        var1.left = new TreeNode(2);
        var1.right = new TreeNode(3);
        var1.left.left = new TreeNode(4);
        var1.left.right = new TreeNode(5);
        hasPathSum1 res = new hasPathSum1();
        boolean result = res.hasPathSum(var1,4);
       System.out.println(result);
    }
}
