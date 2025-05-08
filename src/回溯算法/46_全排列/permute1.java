import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class permute1 {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> path = new LinkedList<>();
    public List<List<Integer>> permute(int[] nums) {
        backtracking(nums);
        return res;
    }
    public void backtracking(int[] nums){
        if(path.size()==nums.length){
            res.add(new ArrayList<>(path));
            return;
        }
        for(int i=0;i<nums.length;i++){
            if(path.contains(nums[i])) continue;
            path.add(nums[i]);
            backtracking(nums);
            path.remove(path.size()-1);
        }
    }
}
