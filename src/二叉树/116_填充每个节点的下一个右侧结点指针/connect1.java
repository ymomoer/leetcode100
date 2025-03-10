import java.util.LinkedList;
import java.util.Queue;

class Node {
    public int val;
    public Node left;
    public Node right;
    public Node next;

    public Node() {}
    
    public Node(int _val) {
        val = _val;
    }

    public Node(int _val, Node _left, Node _right, Node _next) {
        val = _val;
        left = _left;
        right = _right;
        next = _next;
    }
};

class connect1 {
    public Node connect(Node root) {
        Queue<Node> queue = new LinkedList<>();
        if(root!=null){
            queue.add(root);
        }
        while(!queue.isEmpty()){
            int size = queue.size();
            Node cur = queue.poll();
            if(cur.left!=null){
                queue.add(cur.left);
            }
            if(cur.right!=null){
                queue.add(cur.right);
            }
            for(int i = 1;i<size;i++){
                Node next = queue.poll();

                if(next.left!=null){
                    queue.add(next.left);
                }
                if(next.right!=null){
                    queue.add(next.right);
                }
                cur.next = next;
                cur = next;
            }
           
        }
        return root;
    }

    public static void main(String[] args) {
        // 创建二叉树
        Node root = new Node(1);
        root.left = new Node(2);
        root.right = new Node(3);
        root.left.left = new Node(4);
        root.left.right = new Node(5);

       
        connect1 solution = new connect1();

        Node result = solution.connect(root);

        Node currentLevel = result;
        while (currentLevel != null) {
            Node current = currentLevel;
            while (current != null) {
                System.out.print(current.val + " ");
                current = current.next;
            }
            System.out.println();
            currentLevel = currentLevel.left;
        }
   }
}
