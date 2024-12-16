import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

class threeSum1 {
    public List<List<Integer>> threeSum(int[] nums){
        List<List<Integer>> result = new ArrayList<>();
        Arrays.sort(nums);
        for(int i = 0;i<nums.length;i++){
            if(nums[i]>0){
                return result;
            }
            if(i>0&&nums[i]==nums[i-1]){
                continue;
            }
            int left=i+1;
            int right = nums.length-1;
            while (right>left) {
                int sum = nums[i]+nums[left]+nums[right];
                if(sum>0){
                    right--;
                }else if(sum<0){
                    left++;
                } else {
                    result.add(Arrays.asList(nums[i],nums[left],nums[right]));
                    while(right>left&&nums[right]==nums[right-1]) right--;
                    while(right>left&&nums[left]==nums[left+1]) left++;
                    
                    right--;
                    left++;
                    
                }
            }
        }
        return  result;
    }
    
    public static void main(String[] args) {
        threeSum1 ts = new threeSum1();
        int[] nums1 = {-1,0,1,2,-1,-4};
        System.out.println("Test case:"+ts.threeSum(nums1));
    }
}
