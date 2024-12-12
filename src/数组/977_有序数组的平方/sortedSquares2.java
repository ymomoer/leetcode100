// 双指针
import java.util.Arrays;

class sortedSquares2{
    public int[] sortedSquares(int[] nums){
        int[] result = new int[nums.length];
        int k = result.length-1;
        for(int i = 0,j=nums.length-1;i<=j;){
            if(nums[i]*nums[i]<nums[j]*nums[j]){
                result[k] = nums[j]*nums[j];
                k--;
                j--;
            }
            else{
                
                result[k] = nums[i]*nums[i];
                k--;
                i++;
                
            }
        }
        return result;
    }

    public static void main(String[] args) {
        sortedSquares2 solution = new sortedSquares2();
        int[] nums={-7,-3,2,3,11};
        int[] result1 = solution.sortedSquares(nums);
        System.out.println("Output: "+Arrays.toString(result1));

    }
}

