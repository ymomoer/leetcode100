import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

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

public class largestValues1 {
    public List<Integer> largestValues(TreeNode root) {
        List<Integer> res = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<TreeNode>();

        if(root==null){
            return res;
        };

        queue.add(root);
        while(!queue.isEmpty()){
            int levelSize = queue.size(); 
            int maxValue = Integer.MIN_VALUE;
            for(int i=0;i<levelSize;i++){
                TreeNode node = queue.poll();
                maxValue = node.val>maxValue?node.val:maxValue;
                if(node.left!=null){
                    queue.add(node.left);
                }
                if(node.right!=null){
                    queue.add(node.right);
                }
            }
            res.add(maxValue);
        }
        return res;
    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
         root.left = new TreeNode(2);
         root.right = new TreeNode(3);
         root.left.left = new TreeNode(4);
         root.left.right = new TreeNode(5);
 
        largestValues1 solution = new largestValues1();
        List<Integer> result = solution.largestValues(root);
 
         System.out.println("在每个树行中找最大值:" + result);
    }
}
