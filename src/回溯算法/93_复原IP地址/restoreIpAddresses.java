import java.util.ArrayList;
import java.util.List;

class restoreIpAddresses{
    List<String> res =new ArrayList<>();
    List<String> ss = new ArrayList<>();
    public List<String> restoreIpAddressess(String s){
        if(s.length()>12) return res;
       backtracking(s,0,4);
       return res;
    }
    public void backtracking(String s,int start,int k){
        if(k==0){
            if(start==s.length()){
                res.add(String.join(".",ss));
                return;
            }
        }
        for(int i=start;i<s.length()&&i<start+3;i++){
            if(s.charAt(start)=='0'&&i>start) break;
            String segment = s.substring(start, i+1);
            int value = Integer.parseInt(segment);
            if(value>=0&&value<=255){
                ss.add(segment);
                backtracking(s, i+1, k-1);
                ss.remove(ss.size()-1);
            }
        }
    }

    public static void main(String[] args) {
        restoreIpAddresses solution = new restoreIpAddresses();

        // 输入字符串
        String input = "25525511135";

        // 调用方法
        List<String> result = solution.restoreIpAddressess(input);

        // 输出结果
        System.out.println("合法的IP地址组合有：");
        for (String ip : result) {
            System.out.println(ip);
        }
    }
}