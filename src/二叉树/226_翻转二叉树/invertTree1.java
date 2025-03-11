import java.util.LinkedList;
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


public class invertTree1 {
    public TreeNode invertTree(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        if (root == null) {
            return root;
        }
        queue.add(root);
        while (!queue.isEmpty()) {
            int levelSize = queue.size();
            for (int i = 0; i < levelSize; i++) {
                TreeNode node = queue.poll();
                TreeNode temp = node.left;
                node.left = node.right;
                node.right = temp;
                if (node.left != null) {
                    queue.add(node.left);
                }
                if (node.right != null) {
                    queue.add(node.right);
                }
            }
        }
        return root;
    }
    public void printTree(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.val + " "); 
        printTree(root.left);             
        printTree(root.right);            
    }
    public static void main(String[] args) {
        TreeNode var1 = new TreeNode(1);
        var1.left = new TreeNode(2);
        var1.right = new TreeNode(3);
        var1.left.left = new TreeNode(4);
        var1.left.right = new TreeNode(5);
        invertTree1 res = new invertTree1();
        TreeNode result = res.invertTree(var1);
        res.printTree(result);
    }
}
