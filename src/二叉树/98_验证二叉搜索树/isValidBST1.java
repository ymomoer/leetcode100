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

class isValidBST1{
    TreeNode max;
    public boolean isValidBST(TreeNode root) {
        
        if(root==null) return true;
        boolean left = isValidBST(root.left);
        if(!left)  return false;
        if(max!=null&&root.val<=max.val)  return false;
        max = root;
        boolean right = isValidBST(root.right);
        return right;
    }

    public static void main(String[] args) {
        isValidBST1 solution = new isValidBST1();
        TreeNode root1 = new TreeNode(5,
                new TreeNode(1),
                new TreeNode(6,
                        new TreeNode(4),
                        new TreeNode(7)));
        System.out.println("Test Case 1 (Valid BST): " + solution.isValidBST(root1)); 
    }
}