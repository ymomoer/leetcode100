package 二叉树.前序遍历;

import java.util.ArrayList;
import java.util.List;

class TreeNode {
    int val;
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
public class preorderTraversal1 {
    public List<Integer> preorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        preorder(root,res);
        return res;

    }

    public void preorder(TreeNode root,List<Integer> res){
        if(root==null){
            return;
        }
        res.add(root.val);
        preorder(root.left,res);
        preorder(root.right,res);
    }
    public static void main(String[] args) {
        // 创建二叉树
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

       
        preorderTraversal1 solution = new preorderTraversal1();

       
        List<Integer> result = solution.preorderTraversal(root);

        System.out.println("前序遍历结果: " + result);
    }
}