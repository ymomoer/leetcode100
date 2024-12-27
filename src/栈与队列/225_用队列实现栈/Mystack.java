import java.util.LinkedList;
import java.util.Queue;
class Mystack {
    Queue<Integer> queue;
    public Mystack() {
        queue = new LinkedList<Integer>();
    }
    
    public void push(int x) {
        queue.offer(x);
        int n = queue.size()-1;
        for(int i = 0;i<n;i++){
            queue.offer(queue.poll());
        }
    }
    
    public int pop() {
        return queue.poll();
    }
    
    public int top() {
        return queue.peek();
    }
    
    public boolean empty() {
        return queue.isEmpty();
    }
    public static void main(String[] args){
        Mystack obj = new Mystack();
        obj.push(1);
        obj.push(2);
        System.out.println(obj.pop());
    }
    
}

