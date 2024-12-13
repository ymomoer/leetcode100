// 使用Map

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

class twoSum2 {
    public int[] twoSum(int[] nums, int target) {
        Map<Integer,Integer> indexMap = new HashMap<>();
        for(int i = 0;i<nums.length;i++){
            int remain = target-nums[i];
            if(indexMap.containsKey(remain)){
                return new int []{i,indexMap.get(remain)};
            }else{
                indexMap.put(nums[i],i);
            }
        }
        return null;
    }

    public static void main(String[] args) {
        twoSum2 result = new twoSum2();
        int[] res = result.twoSum(new int[]{2,7,11,5}, 9);
        System.out.println(Arrays.toString(res));
    }
}
