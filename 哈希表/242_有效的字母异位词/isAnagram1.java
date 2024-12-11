class isAnagram1 {
    public boolean isAnagram(String s,String t){
        int [] record = new int[26];

        for(int i = 0;i<s.length();i++){
            record[s.charAt(i)-'a']++;
        }

        for(int i = 0;i<t.length();i++){
            record[t.charAt(i)-'a']--;
        }
        for(int count:record){
            if(count!=0){
                return false;
            }
        }
        return true;
    }

    public static void main(String[] args) {
        isAnagram1 result = new isAnagram1();
        String s = "anagram";
        String t = "nagaram";
        System.out.print(result.isAnagram(s, t));
    }
}
