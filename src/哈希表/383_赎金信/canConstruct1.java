class canConstruct1 {
    public boolean canConstruct(String ransomNote,String magazine){
        char[] str1 = ransomNote.toCharArray();
        char[] str2 = magazine.toCharArray();
        for(int i = 0;i<str1.length;i++){
            for(int j = 0;j<str2.length;j++){
                if(str1[i]==str2[j]){
                    str1[i] = '0';
                    str2[j] = '0';
                    continue;
                }
            }
        }

        for(int i=0;i<str1.length;i++){
            if(str1[i]!='0'){
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
