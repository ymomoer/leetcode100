import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class permuteUnique1 {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> path = new LinkedList<>();
    boolean[] vis;
    public List<List<Integer>> permuteUnique(int[] nums) {   
        vis = new boolean[nums.length];
        Arrays.sort(nums);
        backtracking(nums);
        return res;
    }
    public void backtracking(int[] nums){
        if(path.size()==nums.length){
            res.add(new ArrayList<>(path));
            return;
        }
        for(int i= 0;i<nums.length;i++){
            if(vis[i]||i>0&&nums[i]==nums[i-1]&&!vis[i-1]) continue;
            path.add(nums[i]);
            vis[i] = true;
            backtracking(nums);
            vis[i]=false;
            path.remove(path.size()-1);
        }
    }
}
