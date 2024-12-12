class removeElementSolution1{
    public int removeElement(int[] nums,int val){
        int slowIndex = 0;
        for(int fastIndex = 0;fastIndex<nums.length;fastIndex++){
            if(nums[fastIndex]!=val){
                nums[slowIndex] = nums[fastIndex];
                slowIndex++;
            }
        }
        return slowIndex;
    }

    public static void main(String[] args) {
        removeElementSolution1 solution = new removeElementSolution1();

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