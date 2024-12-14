import java.util.HashMap;
import java.util.Map;

class fourSumCount1 {
    public int fourSumCount(int[] nums1,int[] nums2,int[] nums3,int[] nums4){
        int res = 0;
        Map<Integer,Integer> map = new HashMap<>();
        for(int i:nums1){
            for(int j:nums2){
                int sum = i+j;
                map.put(sum,map.getOrDefault(sum,0)+1);
            }
        }

        for(int i:nums3){
            for(int j : nums4){
                res = res+ map.getOrDefault(0-i-j,0);
            }
        }
        return res;
    }
    public static void main(String[] args) {
        fourSumCount1 solution = new fourSumCount1();
        
        // 测试用例
        int[] nums1 = {1, 2};
        int[] nums2 = {-2, -1};
        int[] nums3 = {-1, 2};
        int[] nums4 = {0, 2};

        int result = solution.fourSumCount(nums1, nums2, nums3, nums4);
        System.out.println("The number of tuples is: " + result); // 输出应为 2

        // 其他测试用例
        int[] nums1_2 = {0};
        int[] nums2_2 = {0};
        int[] nums3_2 = {0};
        int[] nums4_2 = {0};
        
        int result2 = solution.fourSumCount(nums1_2, nums2_2, nums3_2, nums4_2);
        System.out.println("The number of tuples is: " + result2); // 输出应为 1
    }
}
