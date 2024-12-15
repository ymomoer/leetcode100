class canConstruct3 {
    public boolean canConstruct(String ransomNote,String magazine){
        if(ransomNote.length()>magazine.length()){
            return false;
        }
        int[] record = new int[26];
        for(char c:magazine.toCharArray()){
            record[c-'a']+=1;
        }
        for(char c:ransomNote.toCharArray()){
            record[c-'a']-=1;
        }
        for(int i:record){
            if(i<0){
                return false;
            }
        }
        return true;
    }
    public static void main(String[] args) {
        canConstruct1 result = new canConstruct1();
        System.out.println(result.canConstruct("a", "b"));
        System.out.println(result.canConstruct("aa", "ab"));
        System.out.println(result.canConstruct("aa", "aab"));
    }
}
