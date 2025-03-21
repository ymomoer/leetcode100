import java.util.HashMap;
import java.util.Map;

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
 
class buildTree2 {
    Map<Integer,Integer> map = new HashMap<>();
    public TreeNode buildTree(int[] preorder, int[] inorder) {
        for(int i=0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        return buildNodetwo(preorder, 0, preorder.length, inorder, 0, inorder.length);
    }

    public TreeNode buildNodetwo(int[] preorder,int preBegin,int preEnd,int[] inorder,int inBegin,int inEnd){
        if(preBegin>=preEnd||inBegin>=inEnd) return null;

        int rootVal = preorder[preBegin];
        TreeNode root = new TreeNode(rootVal);

        int rootIndex = map.get(rootVal);
        int leftsize = rootIndex-inBegin;
        root.left = buildNodetwo(preorder, preBegin+1, preBegin+leftsize+1, inorder, inBegin, rootIndex);
        root.right = buildNodetwo(preorder, preBegin+leftsize+1, preEnd, inorder, rootIndex+1, inEnd);

        return root;
    }

    public static void main(String[] args) {
        int[] preorder = {3,9,20,15,7};
        int[] inorder = {9,3,15,20,7};
       

        buildTree2 solution = new buildTree2();
        TreeNode root = solution.buildTree(preorder, inorder);
        printPostOrder(root);
    }
    public static void printPostOrder(TreeNode root) {
        if (root == null) {
            return;
        }
     
        printPostOrder(root.left);
        printPostOrder(root.right);
        System.out.print(root.val + " ");
    }
}