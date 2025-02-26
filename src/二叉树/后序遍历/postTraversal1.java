package 二叉树.后序遍历;
import java.util.ArrayList;
import java.util.List;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(){}
    TreeNode(int val){
        this.val = val;
    }
    TreeNode(int val,TreeNode left,TreeNode right){
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
public class postTraversal1{
    public List<Integer> postTraversal(TreeNode root){
        List<Integer> res = new ArrayList<Integer>();
        postorder(root,res);
        return res;
    }
    public void postorder(TreeNode root,List<Integer> res){
        if(root==null){
            return;
        }
        postorder(root.left, res);
        postorder(root.right, res);
        res.add(root.val);
    }
    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

       
        postTraversal1 solution = new postTraversal1();

        List<Integer> result = solution.postTraversal(root);

        System.out.println("前序遍历结果: " + result);
    }
}
