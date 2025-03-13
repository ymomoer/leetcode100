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

public class isBalanced1 {
    public boolean isBalanced(TreeNode root) {
        int treeHeight = getHeight(root);
        return treeHeight!=1;
    }

    private int getHeight(TreeNode root){
        if(root==null){
            return 0;
        }
        int leftHeight=getHeight(root.left);
        if(leftHeight==-1){
            return -1;
        }

        int rightHeight=getHeight(root.right);
        if(leftHeight==-1){
            return -1;
        }

        if(Math.abs(leftHeight-rightHeight)>1){
            return -1;
        }

        return Math.max(leftHeight, rightHeight)+1;
    }

    public static void main(String[] args) {
        // 创建二叉树
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

       
        isBalanced1 solution = new isBalanced1();

        boolean result = solution.isBalanced(root);

        System.out.println(result);
    }
}
