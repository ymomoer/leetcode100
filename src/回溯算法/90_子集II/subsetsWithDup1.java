import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class subsetsWithDup1 {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> path = new ArrayList<>();
    public List<List<Integer>> subsetsWithDup(int[] nums) {
       Arrays.sort(nums);
       backtracking(nums,0);
       return res;
    }

    public void backtracking(int[] nums,int start){
        res.add(new ArrayList<>(path));
        if(start>=nums.length){
            return;
        }
        for(int i=start;i<nums.length;i++){
            if(i>start&&nums[i-1]==nums[i]) continue;
            path.add(nums[i]);
            backtracking(nums,i+1);
            path.removeLast();
        }
    }
}