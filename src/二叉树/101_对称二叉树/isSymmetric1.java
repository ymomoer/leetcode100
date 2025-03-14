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
 

class isSymmetric1 {
    public boolean isSymmetric(TreeNode root) {
        if(root==null) return true;
        boolean three= compare(root.left,root.right);
        return three;
    }

    private boolean compare(TreeNode left,TreeNode right){
        if(left!=null&&right==null) return false;
        else if(left==null&&right!=null) return false;
        else if(left==null&&right==null) return true;
        else if(left.val!=right.val) return false;

        boolean one = compare(left.left,right.right);
        boolean two = compare(left.right,right.left);
        return one && two;

    }

    public static void main(String[] args) {
        // 创建二叉树
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

       
        isSymmetric1 solution = new isSymmetric1();

        boolean result = solution.isSymmetric(root);

        System.out.println(result);
    }
}
