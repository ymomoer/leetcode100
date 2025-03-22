class TreeNode {
    int val;
   TreeNode left;
   TreeNode right;
   TreeNode() {}
   TreeNode(int val) { this.val = val; }
   TreeNode(int val, TreeNode left, TreeNode right) {
       this.val = val;
       this.left = left;
       this.right = right;
    }
}
class constructMaximumBinaryTree1{
    public TreeNode constructMaximumBinaryTree(int[] nums) {
        return consTreeNode(nums,0,nums.length-1);
    }
    public TreeNode consTreeNode(int[] nums,int left,int right){
        if(left>right) return null;
        int max = left;
        for(int i=left;i<=right;i++){
            if(nums[i]>nums[max]){
                max = i;
            }
        }
        TreeNode node = new TreeNode(nums[max]);
        node.left = consTreeNode(nums,left,max-1);
        node.right=consTreeNode(nums,max+1,right);
        return node;
    } 
    public static void main(String[] args) {
        int[] nums = {3,2,1,6,0,5};
        constructMaximumBinaryTree1 solution = new constructMaximumBinaryTree1();
        TreeNode result = solution.constructMaximumBinaryTree(nums);
        printTree(result);
    }
    public static void printTree(TreeNode node) {
        if (node == null) return;
        System.out.print(node.val + " ");  // 先输出当前节点
        printTree(node.left);  // 递归打印左子树
        printTree(node.right); // 递归打印右子树
    }
   
}