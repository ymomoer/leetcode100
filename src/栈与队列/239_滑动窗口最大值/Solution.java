import java.util.Deque;
import java.util.LinkedList;

class Mqueue {
    Deque<Integer> queue = new LinkedList<>();

    void pop(int val) {
        if (!queue.isEmpty() && val == queue.peek()) {
            queue.pop();
        }
    }

    void push(int val) {
        while (!queue.isEmpty() && queue.getLast() < val) {
            queue.removeLast();
        }
        queue.add(val);
    }

    int peek() {
        return queue.peek();
    }
}

class Solution {
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums.length == 0) {
            return new int[0];
        }

        if (nums.length == 1) {
            return nums;
        }
        int number = nums.length - k + 1;
        int[] result = new int[number];
        int num = 0;
        Mqueue queue = new Mqueue();
        for (int i = 0; i < k; i++) {
            queue.push(nums[i]);
        }
        result[num++] = queue.peek();
        for (int i = k; i < nums.length; i++) {
            queue.pop(nums[i - k]);
            queue.push(nums[i]);
            result[num++] = queue.peek();
        }
        return result;
    }
    
    public static void main(String[] args) {
        Solution test = new Solution();
        int[] nums1 = {1, 3, -1, -3, 5, 3, 6, 7};
        int k1 = 3;
        int[] result1 = test.maxSlidingWindow(nums1, k1);
        System.out.println("Test Case 1: " + java.util.Arrays.toString(result1));
        
    }
}
