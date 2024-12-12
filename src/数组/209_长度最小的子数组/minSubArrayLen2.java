// 滑动窗口
public class minSubArrayLen2 {
    public int minSubArrayLen(int target, int[] nums) {
        int left = 0;
        int sum = 0;
        int result = Integer.MAX_VALUE;
        for(int right = 0;right<nums.length;right++){
            sum = sum+nums[right];
            while(sum>=target){
                result = Math.min(result,right-left+1);
                sum = sum-nums[left];
                left++;
            }
        }
        return result ==Integer.MAX_VALUE ? 0:result;
    }

    public static void main(String[] args) {
        minSubArrayLen2 solution = new minSubArrayLen2();
        
        // 测试用例
        int s = 7;
        int[] nums = {2, 3, 1, 2, 4, 3};
        int result = solution.minSubArrayLen(s, nums);
        System.out.println("最短子数组长度: " + result); // 输出：2 (子数组 [4, 3])       
    }
}
