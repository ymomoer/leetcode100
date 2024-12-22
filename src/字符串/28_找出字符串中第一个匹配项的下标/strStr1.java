class strStr1 {
    public int strStr(String haystack,String needle){
        if(haystack==null||needle==null){
            return -1;
        }
        if(needle.length()==0){
            return 0;
        }
        char[] s=haystack.toCharArray();
        char[] t = needle.toCharArray();
        int[] next = getNext(needle);
        int i= 0;
        int j= 0;
        while(i<s.length&&j<t.length) {
            if(s[i]==t[j]){
                i++;
                j++;
            }else{
                if(j>0){
                    j = next[j-1]+1;
                }else{
                    i++;
                }
            }
        }
        return j==t.length?i-j:-1;
    }

    public int[] getNext(String needle){
        char[] t1 = needle.toCharArray();
        int[] next = new int[t1.length];
        next[0]=-1;
        int j=0;
        for(int i=1;i<t1.length;i++){
            while(j>0&&t1[i]!=t1[j]){
                j = next[j-1]+1;
            }
            if(t1[i]==t1[j]){
                j++;
            }
            next[i]=j-1;
        }
        return next;
    }
    public static void main(String[] args) {
        strStr1 solution = new strStr1();

        // 测试用例
     
        System.out.println(solution.strStr("leetcode", "leeto"));
    }
}

