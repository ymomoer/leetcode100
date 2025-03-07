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

public class averageOfLevels1 {
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> res = new ArrayList<Double>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();

        if(root==null){
            return res;
        }
        queue.add(root);
        
        while(!queue.isEmpty()){
            int levelSize = queue.size();
            double levelSum = 0.0;
            for(int i = 0;i<levelSize;i++){
                TreeNode node = queue.poll();
                levelSum= levelSum+node.val;
                if(node.left!=null){
                    queue.add(node.left);
                }
                if(node.right!=null){
                    queue.add(node.right);
                }
                
            }
            res.add(levelSum/levelSize);
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
 
        
         averageOfLevels1 solution = new averageOfLevels1();
 
         List<Double> result = solution.averageOfLevels(root);
 
         System.out.println("二叉树的层平均值:" + result);
    }
}
