package 二叉树.前序遍历;

public class TreeNode {
    public int val;
    TreeNode left;
    TreeNode right;
    TreeNode(){}
    TreeNode(int val){
        this.val = val;
    }
    TreeNode(int val,TreeNode left,TreeNode right){
        this.val=val;
        this.left = left;
        this.right = right;
    }
}
