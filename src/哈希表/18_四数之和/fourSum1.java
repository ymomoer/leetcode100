import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class fourSum1 {
    public List<List<Integer>> fourSum(int[] nums,int target){
        Arrays.sort(nums);
        List<List<Integer>> result = new ArrayList<>();
        for(int k = 0;k<nums.length;k++){
            if(nums[k]>target&&nums[k]>=0){
                break;
            }
            if(k>0&&nums[k]==nums[k-1]){
                continue;
            }
            for(int i=k+1;i<nums.length;i++){
                if(nums[k]+nums[i]>target&&nums[k]+nums[i]>=0){
                    break;
                }
                if(i>k+1&&nums[i]==nums[i-1]){
                    continue;
                }
                int left = i+1;
                int right = nums.length-1;
                while(right>left){
                    long sum = nums[k]+nums[i]+nums[left]+nums[right];
                    if(sum>target){
                        right--;
                    }else if(sum<target){
                        left++;
                    }else{
                        result.add(Arrays.asList(nums[k],nums[i],nums[left],nums[right]));
                        while(right>left&&nums[right]==nums[right-1]) right--;
                        while(right>left&&nums[left]==nums[left+1]) left++;
                        right--;
                        left++;
                    }
                }
            }
        }
        return result;
        
    }
    public static void main(String[] args) {
       fourSum1 solution = new fourSum1();
        int[] nums = {1, 0, -1, 0, -2, 2};
        int target = 0;
        List<List<Integer>> results = solution.fourSum(nums, target);
        for (List<Integer> result : results) {
            System.out.println(result);
        }
    }
}
