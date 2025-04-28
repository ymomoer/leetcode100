class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}

public class lowestCommonAncestor2 {
    public TreeNode lowestCommonAncestor(TreeNode root, TreeNode p, TreeNode q) {
        if(root==null) return null;
        if(root.val>p.val&&root.val>q.val) return lowestCommonAncestor(root.left,p,q);
        if(root.val<p.val&&root.val<q.val) return lowestCommonAncestor(root.right,p,q);
        return root;
    }

    public static void main(String[] args) {
        TreeNode var1 = new TreeNode(6);
        var1.left = new TreeNode(2);
        var1.right = new TreeNode(8);
        var1.left.left = new TreeNode(0);
        var1.left.right = new TreeNode(4);
        lowestCommonAncestor2 res = new lowestCommonAncestor2();
        TreeNode result = res.lowestCommonAncestor(var1, var1.left.left, var1.left.right);
        System.out.println(result.val);
    }
    
}
