import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.PriorityQueue;

class topKFrequent1{

    public int[] topKFrequent(int[] nums, int k) {
        Map<Integer,Integer> frequent  = new HashMap<Integer,Integer>();
        for(int i:nums){
             frequent.put(i,frequent.getOrDefault(i,0)+1);
        }
        PriorityQueue<int[]> dui = new PriorityQueue<>((o1,o2)->o1[1]-o2[1]);
        int result[] = new int[k];
        for(var j:frequent.entrySet()){
            int[] a = new int[2];
            a[0] = j.getKey();
            a[1]=j.getValue();
            dui.offer(a); 
            if(dui.size()>k){
            dui.poll();
        }
        }
       
        for(int i=0;i<k;i++){
            result[i]=dui.poll()[0];
        }
        return result;
 
    }
    public static void main(String[] args) {
        topKFrequent1 test = new topKFrequent1();
        int[] nums1 = {1,1,1,2,2,3};
        int k1 = 2; 
        int[] result = test.topKFrequent(nums1, k1);
        System.out.println(Arrays.toString(result));
    }
}

