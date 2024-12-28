import java.util.Stack;

class isValid1 {
    public boolean isValid(String s){
        if(s.length()%2!=0) return false;
        Stack<Character> stack = new Stack<>();
        for(int i = 0;i<s.length();i++){
            if(s.charAt(i)=='('){
                stack.push(')');
            }else if(s.charAt(i)=='['){
                stack.push(']');
            }else if(s.charAt(i)=='{'){
                stack.push('}');
            }else if(stack.empty()||s.charAt(i)!=stack.pop()){
                return false;
            }
        }
        return stack.isEmpty();
    }
    public static void main(String[] args) {
        isValid1 res = new isValid1();
        System.out.println(res.isValid("({[]})"));
        System.out.println(res.isValid("({[])"));
    }

}
