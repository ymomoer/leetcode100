import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class partition1 {
    List<List<String>> res = new ArrayList<>();
    List<String> path = new LinkedList<>();
    public List<List<String>> partition(String s) {
        backtracking(s,0);
        return res;
    }
    private void backtracking(String s, int start) {
        if(start>=s.length()){
            res.add(new ArrayList<>(path));
            return;
        }
        for(int i= start;i<s.length();i++){
            if(ishuiwen(s,start,i)){
                String sub = s.substring(start, i+1);
                path.add(sub);
                backtracking(s, i+1);
                path.remove(path.size()-1);
            }
        }

        
    }
    private boolean ishuiwen(String s, int i, int j) {
        while (i<j) {
            if(s.charAt(i)!=s.charAt(j)){
                return false;
            }
            i++;
            j--;
        }
       return true;
    }
    public static void main(String[] args) {
        partition1 solution = new partition1();

        // 测试用例 1
        String s1 = "aab";
        System.out.println("Input: " + s1);
        System.out.println("Output: " + solution.partition(s1));
    }
}
