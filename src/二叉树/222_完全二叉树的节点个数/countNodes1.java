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

class countNodes1{
    public int countNodes(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList<>();
        int res = 0;
        if(root==null) return res;
        queue.add(root);
        while(!queue.isEmpty()){
            int levelSize = queue.size();
            for(int i = 0;i<levelSize;i++){
                TreeNode node = queue.poll();
                res++;
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
        TreeNode root = new TreeNode(1);
         root.left = new TreeNode(2);
         root.right = new TreeNode(3);
         root.left.left = new TreeNode(4);
         root.left.right = new TreeNode(5);
 
        
        countNodes1 solution = new countNodes1();
 
        int result = solution.countNodes(root);
 
         System.out.println(result);
    }
}

