class removeElementSolution{
    public int removeElement(int[] nums,int val){
        int size = nums.length;
        for(int i=0;i<size;i++){
            if(nums[i]==val){
                for(int j = i+1;j<size;j++){
                    nums[j-1]=nums[j];
                }
                i--;
                size--;
            }
        }
        return size;
    }

    public static void main(String[] args) {
        removeElementSolution solution = new removeElementSolution();

        // Test case 1
        int[] nums1 = {3, 2, 2, 3};
        int val1 = 3;
        int newSize1 = solution.removeElement(nums1, val1);
        System.out.println("New size: " + newSize1 + "\nRemaining elements: ");
        for (int i = 0; i < newSize1; i++) {
            System.out.print(nums1[i] + " ");
        }
        System.out.println();

    }
}