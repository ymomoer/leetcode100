import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class combinationSumm {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> path = new LinkedList<>();
    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        bfs(candidates,target,0,0);
        return res;
    }
    public void bfs(int[] candidates,int target,int sum,int start){
        if(sum>target) return;
        if(sum==target){
            res.add(new ArrayList<>(path));
            return;
        }
        for(int i =start;i<candidates.length;i++){
            sum=sum+candidates[i];
            path.add(candidates[i]);
            bfs(candidates,target,sum,i);
            sum=sum-candidates[i];
            path.remove(path.size()-1);
        }
    }
    public static void main(String[] args) {
        combinationSumm solution = new combinationSumm();
        int[] candidates = {2,3,6,7};
        int target=7;
        List<List<Integer>> result = solution.combinationSum(candidates, target);
        for (List<Integer> combination : result) {
            System.out.println(combination);
        }
    }
}
