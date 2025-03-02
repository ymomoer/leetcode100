package 二叉树.中序遍历;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;



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

class inorderTraversal3 {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> res = new ArrayList<Integer>();
        Stack<TreeNode> stack = new Stack<TreeNode>();
        if(root==null){
            return res;
        }
        stack.push(root);
        while(!stack.isEmpty()){
            TreeNode node = stack.peek();
            if(node!=null){
                stack.pop();
                if(node.right!=null) stack.push(node.right);
               
                stack.push(node);
                stack.push(null); 
                if(node.left!=null) stack.push(node.left);
            }else{
                stack.pop();
                node = stack.pop();
                res.add(node.val);  
            }
        }
        return res;
    }
  
     public static void main(String[] args) {
        // 创建二叉树
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

       
        inorderTraversal3 solution = new inorderTraversal3();

        List<Integer> result = solution.inorderTraversal(root);

        System.out.println("中序遍历结果: " + result);
    }
} 
    

