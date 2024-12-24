class repeatedSubstringPattern1 {
    public boolean repeatedSubstringPatter(String s){
        String ss = s+s;
        ss = ss.substring(1,ss.length()-1);
        return ss.contains(s);

    }
    public static void main(String[] args) {
        repeatedSubstringPattern1 res = new repeatedSubstringPattern1();
        System.out.println(res.repeatedSubstringPatter("ababab"));
    }
}
