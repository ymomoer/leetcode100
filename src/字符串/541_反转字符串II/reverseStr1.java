class reverseStr1 {
    public String reverseStr(String s,int k){
        char[] ch = s.toCharArray();
        for(int i=0;i<ch.length;i=i+2*k){
            int start = i;
            int end=Math.min(ch.length-1,start+k-1);
            while (start<end) {
                char temp = ch[start];
                ch[start] = ch[end];
                ch[end] = temp;
                start++;
                end--;
            }
        }
        return new String(ch);
    }

    public static void main(String[] args) {
        reverseStr1 solution = new reverseStr1();
        String result = solution.reverseStr("abcdefg", 2);
        System.out.println("test case:"+result);
    }
}
