class reverseWords1 {
    public String reverseWords(String s){
        int right = s.length()-1;
        StringBuilder res = new StringBuilder();
        for(;right>=0&&s.charAt(right)==' ';){
            right--;
        }
        int left = right;
        while(right>=0){
            for(;right>=0&&s.charAt(right)!=' ';){
                right--;
            }
            res.append(s,right+1,left+1).append(' ');
            for(;right>=0&&s.charAt(right)==' ';){
                right--;
            }
            left=right;
            
        }
        if(res.length()>0){
            return res.substring(0,res.length()-1);
        }else{
            return "";
        }
    }
    public static void main(String[] args) {
        reverseWords1 reverser = new reverseWords1();
        
        // 测试用例
        String test1 = "Hello World";
        System.out.println("Input: \"" + test1 + "\" => Output: \"" + reverser.reverseWords(test1) + "\"");
    }
}
