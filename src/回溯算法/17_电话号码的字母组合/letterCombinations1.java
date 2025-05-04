import java.util.ArrayList;
import java.util.List;

public class letterCombinations1 {
    List< String> res = new ArrayList<>();
    StringBuilder s = new StringBuilder();
    public List<String> letterCombinations(String digits) {
        if(digits==null||digits.length()==0) return res;
        String[] string = {"","","abc","def","ghi","jkl","mno","pqrs","tuv","wxyz"};
        bfs(digits,string,0);
        return res;
    }
    public void bfs(String digits,String[] string,int index){
        if(index==digits.length()){
            res.add(s.toString());
            return;
        }
        String str = string[digits.charAt(index)-'0'];
        for(int i=0;i<str.length();i++){
            s.append(str.charAt(i));
            bfs(digits,string,index+1);
            s.deleteCharAt(s.length()-1);
        }
    }

}
