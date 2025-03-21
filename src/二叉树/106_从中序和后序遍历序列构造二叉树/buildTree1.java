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
class buildTree1 {
    Map<Integer,Integer> map =  new HashMap<>();
    public TreeNode buildTree(int[] inorder, int[] postorder) {
        
        for(int i = 0;i<inorder.length;i++){
            map.put(inorder[i],i);
        }
        int len = inorder.length;
        return buildTreeone(inorder,0,len-1,postorder,0,len-1);
    }
    public TreeNode buildTreeone(int[] inorder,int inBegin,int inEnd,int[] postorder,int postBegin,int postEnd){
        if(inBegin>inEnd||postBegin>postEnd) return null;

        int rootVal=postorder[postEnd];
        TreeNode root = new TreeNode(rootVal);

        int rootIndex = map.get(root.val);
        int leftsize = rootIndex-inBegin;
        root.left = buildTreeone(inorder,inBegin,rootIndex-1,postorder,postBegin,postBegin+leftsize-1);
        root.right = buildTreeone(inorder,rootIndex+1,inEnd,postorder,postBegin+leftsize,postEnd-1);
        return root;
    }

    public static void main(String[] args) {
        int[] inorder = {9,3,15,20,7};
        int[] postorder = {9,15,7,20,3};

        buildTree1 solution = new buildTree1();
        TreeNode root = solution.buildTree(inorder, postorder);
        printPreOrder(root);
    }
    public static void printPreOrder(TreeNode root) {
        if (root == null) {
            return;
        }
        System.out.print(root.val + " ");
        printPreOrder(root.left);
        printPreOrder(root.right);
    }
}
