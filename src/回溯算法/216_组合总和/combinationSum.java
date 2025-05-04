import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class combinationSum {
    List<List<Integer>> res = new ArrayList<>();
    List<Integer> path = new LinkedList<>();
    public List<List<Integer>> combinationSum3(int k, int n) {
       bfs(n,0,k,1);
       return res;
    }
    public void bfs(int targetSum,int sum,int k,int startIndex){
        if(targetSum<sum) return;
        if(path.size()==k){
            if(targetSum==sum){
                res.add(new ArrayList<>(path));
            }
            return;
        }
        for(int i=startIndex;i<=9-(k-path.size())+1;i++){
            sum = sum+i;
            path.add(i);
            bfs(targetSum,sum,k,i+1);
            path.removeLast();
            sum = sum-i;
        }
    }
}
