import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class combine1 {
    List<List<Integer>> res= new ArrayList<>();
    List<Integer> path = new LinkedList<>();
    public List<List<Integer>> combine(int n, int k) {
        dfs(n,k,1);
        return res;
    }
    public void dfs(int n,int k,int start){
        if(path.size()==k){
            res.add(new ArrayList<>(path));
            return;
        }
        for(int i=start;i<=n;i++){
            path.add(i);
            dfs(n,k,i+1);
            path.removeLast();
        }
    }
}
