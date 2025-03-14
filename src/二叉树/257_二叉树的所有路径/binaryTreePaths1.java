import java.util.ArrayList;
import java.util.List;

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


public class binaryTreePaths1 {
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> result = new ArrayList<>();
        if(root==null){
            return result;
        }
        List<Integer> path = new ArrayList<>();
        traversal(root, path, result);
        return result;
        
    }

    private void traversal(TreeNode root,List<Integer> path,List<String> result){
        path.add(root.val);
        
        if(root.left!=null){
            traversal(root.left, path, result);
            path.remove(path.size()-1);
        }

        if(root.right!=null){
            traversal(root.right, path, result);
            path.remove(path.size()-1);
        }   

        if(root.left==null&&root.right==null){
            StringBuilder tmp = new StringBuilder();
            for(int i = 0;i<path.size()-1;i++){
                tmp.append(path.get(i)).append("->");
            }
            tmp.append(path.get(path.size()-1));
            result.add(tmp.toString());
            return;
        }

    }

    public static void main(String[] args) {
        TreeNode root = new TreeNode(1);
         root.left = new TreeNode(2);
         root.right = new TreeNode(3);
         root.left.left = new TreeNode(4);
         root.left.right = new TreeNode(5);
 
        binaryTreePaths1 solution = new binaryTreePaths1();
        List<String> result1 = solution.binaryTreePaths(root);
 
         System.out.println(result1);
    }
}
