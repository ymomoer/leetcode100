import java.util.ArrayDeque;

class evalRPN1 {
    public int evalRPN(String[] tokens) {
        ArrayDeque<Integer> stack = new ArrayDeque<>();
        for (int i = 0; i < tokens.length; i++) {
            String t = tokens[i];
            if ("+".equals(t) || "-".equals(t) || "*".equals(t) || "/".equals(t)) {
                int t1 = stack.pop();
                int t2 = stack.pop();
                if ("+".equals(t)) stack.push(t2 + t1);
                else if ("-".equals(t)) stack.push(t2 - t1);
                else if ("*".equals(t)) stack.push(t2 * t1);
                else if ("/".equals(t)) stack.push(t2 / t1);
            } else {
                stack.push(Integer.valueOf(t));
            }
        }
        return stack.pop(); // 返回计算结果
    }

public static void main(String[] args) {
    evalRPN1 res = new evalRPN1();
    String[] tokens={"2", "1", "+", "3", "*"};
    System.out.println(res.evalRPN(tokens));
}
}
