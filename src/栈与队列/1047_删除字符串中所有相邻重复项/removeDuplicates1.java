import java.util.ArrayDeque;

class removeDuplicates1 {
    public String removeDuplicates(String s) {
        ArrayDeque<Character> stack = new ArrayDeque<>();
        char t;
        for (int i = 0; i < s.length(); i++) {
            t = s.charAt(i);
            if (stack.isEmpty() || stack.peek() != t) {
                stack.push(t);
            } else {
                stack.pop();
            }
        }

        StringBuilder result = new StringBuilder();
        while (!stack.isEmpty()) {
            result.append(stack.pop());
        }
        return result.reverse().toString();
    }

    public static void main(String[] args) {
        removeDuplicates1 test  = new removeDuplicates1();
        System.out.println(test.removeDuplicates("azxxzy"));
    }
}
