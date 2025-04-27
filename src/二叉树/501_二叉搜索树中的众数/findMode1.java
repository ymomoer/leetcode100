import java.util.ArrayList;

class  findMode1{
    // 递归中序遍历
    ArrayList<Integer> res1;
    int maxCount;
    int count;
    TreeNode pre;
   

    public int[] findMode(TreeNode root) {
        res1 = new ArrayList<Integer>();
        maxCount=0;
        count=0;
        findModeone(root);
        int[] res = new int[res1.size()];
        for(int i=0;i<res1.size();i++){
            res[i] = res1.get(i);
        }
        return res;
    }

    public void findModeone(TreeNode root){
        if(root==null) return;
        findModeone(root.left);
        if(pre==null||root.val!=pre.val){
            count=1;
        }else{
            count++;
        }
        if(maxCount<count){
            res1.clear();
            res1.add(root.val);
            maxCount = count;
        }else if(maxCount==count){
            res1.add(root.val);
        }
        pre=root;

        findModeone(root.right);
    }
}
