import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

class TreeNode{
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(){} 
    TreeNode(int val){
        this.val=val;
    }
    TreeNode(int val,TreeNode left,TreeNode right){
        this.val = val;
        this.left = left;
        this.right = right;
    }  
}
public class rightSideView1{
    public List<Integer> rightSideView(TreeNode root){
        List<Integer> res = new ArrayList<Integer>();
        Queue<TreeNode> que = new LinkedList<TreeNode>();
        if(root == null){
            return res;
        }
        que.add(root);
        while (!que.isEmpty()) {
            int levelSize = que.size();
            
            for(int i = 0;i<levelSize;i++){
                TreeNode node = que.poll();
                if(node.left!=null){
                    que.add(node.left);
                }
                if(node.right!=null){
                    que.add(node.right);
                }
                if(i==levelSize-1){
                    res.add(node.val);
                }
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
 
        
         rightSideView1 solution = new rightSideView1();
 
        List<Integer> result = solution.rightSideView(root);
 
         System.out.println("右视图: " + result);
    }
}