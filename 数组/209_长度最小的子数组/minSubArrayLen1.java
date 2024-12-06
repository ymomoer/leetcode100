public class minSubArrayLen1 {
    public int minSubArrayLen(int target, int[] nums) {
        int result = Integer.MAX_VALUE;
        int sum;
        int subLength;

        for(int i=0;i<nums.length;i++){
            sum = 0;
            for(int j = i;j<nums.length;j++){
                sum = sum+nums[j];
                if(sum>=target){
                    subLength = j-i+1;
                    result = Math.min(result,subLength);
                    break;
                }
            }

        }
        return result == Integer.MAX_VALUE?0 : result;
    }

    public static void main(String[] args) {
        minSubArrayLen1 solution = new minSubArrayLen1();
        
        // 测试用例
        int s = 7;
        int[] nums = {2, 3, 1, 2, 4, 3};
        int result = solution.minSubArrayLen(s, nums);
        System.out.println("最短子数组长度: " + result); // 输出：2 (子数组 [4, 3])       
    }
}
