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


class mergeTrees1 {
    public TreeNode mergeTrees(TreeNode root1, TreeNode root2) {
        if(root1==null) return root2;
        if(root2==null) return root1;
        
        root1.val=root1.val+root2.val;
        root1.left = mergeTrees(root1.left,root2.left);
        root1.right = mergeTrees(root1.right,root2.right);
        return root1;
    }

    public static void main(String[] args) {
        TreeNode root1 = new TreeNode(1);
        root1.left = new TreeNode(2);
        root1.right = new TreeNode(3);

        TreeNode root2=new TreeNode(1);
        root2.left = new TreeNode(2);
        root2.right = new TreeNode(3);

        mergeTrees1 solution = new mergeTrees1();
        TreeNode result = solution.mergeTrees(root1, root2);
        printTree(result);
    }
    public static void printTree(TreeNode root){
        if(root==null) return;
        System.out.print(root.val+" ");
        printTree(root.left);
        printTree(root.right);

    }
}
