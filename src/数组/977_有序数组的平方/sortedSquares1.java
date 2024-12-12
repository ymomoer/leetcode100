import java.util.Arrays;

class sortedSquares1{
    public int[] sortedSquares(int[] nums){
        for(int i=0;i<nums.length;i++){
            nums[i]=nums[i] * nums[i];
        }
        Arrays.sort(nums);
        return nums;
    }

    public static void main(String[] args) {
        sortedSquares1 solution = new sortedSquares1();
        
        int[] nums={-7,-3,2,3,11};
        int[] result1 = solution.sortedSquares(nums);
        System.out.println("Output: "+Arrays.toString(result1));

    }
}
