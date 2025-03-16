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

class sumOfLeftLeaves1 {
    public int sumOfLeftLeaves(TreeNode root) {
        if(root==null) return 0;

        int leftSum=sumOfLeftLeaves(root.left);
        int rightSum=sumOfLeftLeaves(root.right);
        int sum1=0;
        if(root.left!=null&&root.left.left==null&&root.left.right==null) {
           sum1 = root.left.val;
        }
        int sum = sum1+leftSum+rightSum;
        return sum;
    }

    public static void main(String[] args) {
        TreeNode var1 = new TreeNode(1);
        var1.left = new TreeNode(2);
        var1.right = new TreeNode(3);
        var1.left.left = new TreeNode(4);
        var1.left.right = new TreeNode(5);
        sumOfLeftLeaves1 res = new sumOfLeftLeaves1();
        int result = res.sumOfLeftLeaves(var1);
        System.out.println(result);
    
    }
}
