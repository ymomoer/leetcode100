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

class minDepth1 {
    public int minDepth(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        int depth=0;
        if(root==null){
            return 0;
        }
        queue.add(root);
        while(!queue.isEmpty()){
            int levelSize = queue.size();
            depth++;
            for(int i=0;i<levelSize;i++){
                TreeNode node = queue.poll();
                if(node.left==null&&node.right==null){
                    return depth;
                }
                if(node.left!=null){
                    queue.add(node.left);
                }
                if(node.right!=null){
                    queue.add(node.right);
                }
            }

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

       
        minDepth1 solution = new minDepth1();

        int result = solution.minDepth(root);

        System.out.println(result);
    }
}
