import java.util.LinkedList;
import java.util.Queue;

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
 
    TreeNode() {
    }
 
    TreeNode(int var1) {
       this.val = var1;
    }
 
    TreeNode(int var1, TreeNode var2, TreeNode var3) {
       this.val = var1;
       this.left = var2;
       this.right = var3;
    }
}
 public class findBottomLeftValue1 {
    public int findBottomLeftValue(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        int res = 0;
        queue.add(root);
        while(!queue.isEmpty()){
            int size = queue.size();
            for(int i = 0;i<size;i++){
                TreeNode node = queue.poll();
                if(i==0){
                    res = node.val;
                }
                if(node.left!=null){
                    queue.add(node.left);
                }
                if(node.right!=null){
                    queue.add(node.right);
                }
                
            }
        }
        return res;
    }
    public static void main(String[] args) {
        TreeNode var1 = new TreeNode(1);
        var1.left = new TreeNode(2);
        var1.right = new TreeNode(3);
        var1.left.left = new TreeNode(4);
        var1.left.right = new TreeNode(5);
        findBottomLeftValue1 res = new findBottomLeftValue1();
        int result = res.findBottomLeftValue(var1);
        System.out.println(result);
    }
}