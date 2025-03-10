import java.util.LinkedList;
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


public class maxDepth1 {
    public int maxDepth(TreeNode root) {
        int depth = 0;
        Queue<TreeNode> queue = new LinkedList<>();

        if(root==null){
            return 0;
        }
        queue.add(root);
        while(!queue.isEmpty()){
            int levelSize = queue.size();

            for(int i = 0;i<levelSize;i++){
                TreeNode node = queue.poll();
                if(node.left!=null){
                    queue.add(node.left);
                }
                if(node.right!=null){
                    queue.add(node.right);
                }

            }
            depth++;
        }
        return depth;
    }

    public static void main(String[] args) {
        // 创建二叉树
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(4);
        root.left.right = new TreeNode(5);

       
        maxDepth1 solution = new maxDepth1();

        int result = solution.maxDepth(root);

        System.out.println("中序遍历结果: " + result);
    }
}
