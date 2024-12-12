class BinarySearch {
    public static int search(int[] nums, int target) {
        if(target<nums[0]||target>nums[nums.length-1]){
            return -1;
        }
        int left=0,right=nums.length-1;
        while(left<=right){
            int mid = left+((right-left)>>1);
            if(target==nums[mid]){
                return mid;
            }
            else if(target<nums[mid]){
                right = mid - 1;
            }
            else{
                left = mid + 1;
            }
        }
        return -1;
    }

    public static void main(String[] args){
        int[] nums = { 1,2,3,4,5,6,7,8,9,10};
        int target = 6;
        int result =  BinarySearch.search(nums,target);
        if (result!=-1){
            System.out.println("目标值"+target+"的索引是"+result);
        }else{
            System.out.println("目标值"+target+"不在数组中");
        }

    }
}