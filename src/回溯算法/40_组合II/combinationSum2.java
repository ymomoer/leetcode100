import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class combinationSum2 {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> path = new ArrayList<>();
    boolean[] used;
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        used = new boolean[candidates.length];
        Arrays.fill(used,false);
        Arrays.sort(candidates);
        backtracking(candidates,target,0,0);
        return res;
    }

    public void backtracking(int[] candidates,int target,int sum,int startIndex){
        if(target ==sum){
            res.add(new ArrayList<>(path));
        }
        for(int i = startIndex;i<candidates.length&&sum+candidates[i]<=target;i++){
            if(i>0&&candidates[i]==candidates[i-1]&&used[i-1]==false){
                continue;
            }
            used[i]=true;
            sum = sum+candidates[i];
            path.add(candidates[i]);
            backtracking(candidates,target,sum,i+1);
            used[i]=false;
            sum = sum -candidates[i];
            path.remove(path.size()-1);
        }
    }
}