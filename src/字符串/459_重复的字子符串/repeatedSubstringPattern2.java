class repeatedSubstringPattern2{
    public boolean repeatedSubstringPattern(String s){
        if(s.equals("")) return false;
        int l = s.length();
        s = " "+s;
        char[] s1 = s.toCharArray();
        int[] next = new int[l+1];
        for(int i=2,j=0;i<=l;i++){
            while(j>0&&s1[i]!=s1[j+1]){
                j = next[j];
            }
            if(s1[i]==s1[j+1]){
                j++;
            }
            next[i]=j;
        }
        if(next[l]>0&&l%(l-next[l])==0){
            return true;
        }
        return false;
    }
    public static void main(String[] args) {
        repeatedSubstringPattern2 res1 = new repeatedSubstringPattern2();
        System.out.println(res1.repeatedSubstringPattern("abaab"));
    }
}