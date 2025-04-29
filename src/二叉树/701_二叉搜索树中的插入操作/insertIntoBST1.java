public class insertIntoBST1 {
    public TreeNode insertIntoBST(TreeNode root, int val) {
        if(root==null) return new TreeNode(val);
        TreeNode pre = root;
        TreeNode rootone = root;
        while(root!=null){
            pre = root;
            if(root.val>val){
                root = root.left;
            }else{
                root=root.right;
            }
        }
        if(pre.val > val){
            pre.left = new TreeNode(val);
        }else{
            pre.right = new TreeNode(val);
        }
        return rootone;
    }
}
