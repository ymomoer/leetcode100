import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;



class  Node {
    public int val;
    public List<Node> children;

    public Node(){}

    public Node(int val){
        this.val = val;
        this.children = new ArrayList<>();  
    }
    public Node(int val,List<Node> children){
        this.val = val;
        this.children = children;
    }
}

public class levelOrder1 {
    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> res = new ArrayList<>();
        Queue<Node> queue = new LinkedList<Node>();

        if(root==null){
            return res;
        }

        queue.add(root);
        while(!queue.isEmpty()){
            int levelSize = queue.size();
            List<Integer> level = new ArrayList<Integer>();
            for(int i=0;i<levelSize;i++){
                Node node = queue.poll();
                level.add(node.val);

                List<Node> childList = node.children;
                if(childList==null||childList.size()==0){
                    continue;
                }
                for(int j = 0;j<childList.size();j++){
                    Node child = childList.get(j);
                    if(child!=null){
                        queue.add(child);
                    }
                }
            }
            res.add(level);
        }

        return res;
    }

    public static void main(String[] args) {
        Node root = new Node(1);
        Node child1 = new Node(2);
        Node child2 = new Node(3);
        Node child3 = new Node(4);
        Node child4 = new Node(5);
        Node child5 = new Node(6);

        // 构建树结构
        root.children.add(child1);
        root.children.add(child2);
        root.children.add(child3);
        child1.children.add(child4);
        child1.children.add(child5);

        levelOrder1 solution = new levelOrder1();
        List<List<Integer>> result = solution.levelOrder(root);
        System.out.println(result);
    }
}