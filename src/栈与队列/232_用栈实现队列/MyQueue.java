import java.util.Stack;

public class MyQueue {
    Stack<Integer> stackIn;
    Stack<Integer> stackOut;

    public MyQueue(){
        stackIn = new Stack<>();
        stackOut = new Stack<>();
    }
    public void push(int x){
        stackIn.push(x);
    }
    public int pop(){
        satckWith();
        return stackOut.pop();
    }
    public int peek(){
        satckWith();
        return stackOut.peek();
    }

    public boolean empty(){
        return stackIn.isEmpty()&&stackOut.isEmpty();
    }

    private void satckWith(){
        if(!stackOut.isEmpty()) return;
        while(!stackIn.isEmpty()){
            stackOut.push(stackIn.pop());
        }
    }
    public static void main(String[] args) {
        MyQueue res = new MyQueue();
        res.push(1);
        res.push(2);
        System.out.println(res.peek());
        res.push(3);
        res.push(4);
        System.out.print(res.pop()) ;
    }
}
