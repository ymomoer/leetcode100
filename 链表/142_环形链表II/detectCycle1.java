class ListNode{
    int val;
    ListNode next;
    ListNode(){}
    ListNode(int val){
        this.val = val;
    }
    ListNode(int val,ListNode next){
        this.val = val;
        this.next = next;
    }
}

public class detectCycle1 {
    public ListNode detectCycle(ListNode head){
        ListNode fast = head;
        ListNode slow = head;
        while(fast!=null&&fast.next!=null){
            slow = slow.next;
            fast = fast.next.next;
            if(fast==slow){ //链表有环
                while(head!=slow){
                    head = head.next;
                    slow = slow.next;
                }
                return slow;
            }
        }
        return null;
    }

    public static ListNode createLinkedList(int[] values, int pos) {
        if (values == null || values.length == 0) return null;

        ListNode head = new ListNode(values[0]);
        ListNode current = head;
        ListNode cycleEntry = null;

        for (int i = 1; i < values.length; i++) {
            current.next = new ListNode(values[i]);
            current = current.next;
            if (i == pos) {
                cycleEntry = current; // Remember the cycle entry point
            }
        }

        if (cycleEntry != null) {
            current.next = cycleEntry; // Create the cycle
        }

        return head;
    }
    

    public static void main(String[] args) {
        detectCycle1 detector = new detectCycle1();

        // Test case 1: List with a cycle
        int[] values1 = {3, 2, 0, -4};
        ListNode head1 = createLinkedList(values1, 1); // Cycle starts at node with value 2
        ListNode result1 = detector.detectCycle(head1);
        System.out.println(result1 != null ? result1.val : "No cycle"); // Expected output: 2

        // Test case 2: List without a cycle
        int[] values2 = {1, 2, 3};
        ListNode head2 = createLinkedList(values2, -1); // No cycle
        ListNode result2 = detector.detectCycle(head2);
        System.out.println(result2 != null ? result2.val : "No cycle"); // Expected output: No cycle

        // Test case 3: Empty list
        ListNode head3 = null;
        ListNode result3 = detector.detectCycle(head3);
        System.out.println(result3 != null ? result3.val : "No cycle"); // Expected output: No cycle

        // Test case 4: Single node with a cycle
        ListNode head4 = new ListNode(1);
        head4.next = head4; // Cycle to itself
        ListNode result4 = detector.detectCycle(head4);
        System.out.println(result4 != null ? result4.val : "No cycle"); // Expected output: 1
    }
}
