import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class findItinerary1 {
    Map<String,PriorityQueue<String>> graph = new HashMap<>();
    LinkedList<String> res= new LinkedList<>();

    public List<String> findItinerary(List<List<String>> tickets) {
        for(List<String> ticket:tickets){
            graph.computeIfAbsent(ticket.get(0),k->new PriorityQueue<>()).add(ticket.get(1));
            
        }
        dfs("JFK");
        return res;
    }

    public void dfs(String from){
        PriorityQueue<String> pq = graph.get(from);
        while(pq!=null&&!pq.isEmpty()){
            String next = pq.poll();
            dfs(next);
        }
        res.addFirst(from);
    }
}
