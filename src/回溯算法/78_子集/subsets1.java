import java.util.ArrayList;
import java.util.List;

public class subsets1 {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> path = new ArrayList<>();
    public List<List<Integer>> subsets(int[] nums) {
       backtracking(nums,0);
       return res;
    }

    public void backtracking(int[] nums,int start){
        res.add(new ArrayList<>(path));
        if(start>=nums.length){
            return;
        }
        for(int i=start;i<nums.length;i++){
            path.add(nums[i]);
            backtracking(nums,i+1);
            path.removeLast();
        }
    }
}
