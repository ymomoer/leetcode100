class searchBST1 {
    public TreeNode searchBST(TreeNode root, int val) {
        if(root==null||root.val == val) return root;
        if(root.val>val) return searchBST(root.left,val);
        if(root.val<val) return searchBST(root.right,val);
        return null;
    }
}