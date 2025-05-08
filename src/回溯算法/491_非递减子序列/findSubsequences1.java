import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class findSubsequences1 {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> path = new LinkedList<>();
    public List<List<Integer>> findSubsequences(int[] nums) {
        backtracking(nums,0);
        return res;
    }
    public void backtracking(int[] nums,int start){
        if(path.size()>=2){
            res.add(new ArrayList<>(path));
        }
        Map<Integer,Integer> map = new HashMap<>();
        for(int i=start;i<nums.length;i++){
            if((!path.isEmpty()&&nums[i]<path.getLast())||map.getOrDefault(nums[i],0)>0){
                continue;
            }
            map.put(nums[i],map.getOrDefault(nums[i],0)+1);
            path.add(nums[i]);
            backtracking(nums,i+1);
            path.remove(path.size()-1);
        }
    }
}
