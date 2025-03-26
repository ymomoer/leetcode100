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
 
class getMinimumDifference1 {
    TreeNode pre;
    int result = Integer.MAX_VALUE;
    public int getMinimumDifference(TreeNode root) {
        if(root==null){
            return 0;
        }
        traversal(root);
        return result;
    }

    public void traversal(TreeNode root){
        if(root==null){
            return;
        }
        traversal(root.left);
        if(pre!=null){
            result=Math.min(result,root.val-pre.val);
        }
        pre=root;
        traversal(root.right);
       
    }

    public static void main(String[] args) {
        getMinimumDifference1 solution =new getMinimumDifference1();
        TreeNode root1 = new TreeNode(4,
                new TreeNode(2,
                        new TreeNode(1),
                        new TreeNode(3)),
                new TreeNode(6));
        System.out.println("Test Case 1: " + solution.getMinimumDifference(root1));
    }
}
