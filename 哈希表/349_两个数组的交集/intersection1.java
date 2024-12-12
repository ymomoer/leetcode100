import java.util.HashSet;
import java.util.Set;

public class intersection1 {
    public int[] intersection(int[] nums1,int[] nums2){
        if(nums1==null||nums1.length == 0||nums2==null||nums2.length==0){
            return new int[0];
        }
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> resSet = new HashSet<>();

        for(int i: nums1){
            set1.add(i);
        }
        for(int i : nums2){
            if(set1.contains(i)){
                resSet.add(i);
            }
        }

        return resSet.stream().mapToInt(x->x).toArray();
    }

    public static void main(String[] args) {
        int[] nums1 = {1,2,2,1};
        int[] nums2 = {2,2};
        intersection1 inter = new intersection1();
        int[] result = inter.intersection(nums1, nums2);
        System.out.print("Test case:");
        for(int num:result){
            System.out.print(num+" ");
        }
        System.out.println();

        int[] nums5 = {};
        int[] nums6 = {1, 2, 3};
        int[] result2 = inter.intersection(nums5, nums6);
        System.out.print("Test Case: ");
        for (int num : result2) {
            System.out.print(num + " ");  // 预期输出: (无)
        }
        System.out.println();
    }
}
