class ListNode{
    int val;
    ListNode next;
    ListNode() {}
    ListNode(int val) { this.val = val; }
    ListNode(int val,ListNode next){
        this.val = val;
        this.next = next;
    }
}
public class removeElements1{
    public ListNode removeElements(ListNode head,int val){
        ListNode dummy = new ListNode();
        dummy.next  =head;
        
        ListNode cur = dummy;
        while(cur.next!=null){
            if(cur.next.val==val){
                cur.next = cur.next.next;
            }else{
                cur = cur.next;
            }
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        removeElements1 solution = new removeElements1();
        
        ListNode head1 = createList(new int[]{1, 2, 6, 3, 4, 5, 6});
        ListNode result1 = solution.removeElements(head1, 6);
        printList(result1);
    }

    private static ListNode createList(int[] values) {
        ListNode dummy = new ListNode();
        ListNode current = dummy;
        for (int value : values) {
            current.next = new ListNode(value);
            current = current.next;
        }
        return dummy.next;
    }
    
    private static void printList(ListNode head) {
        ListNode current = head;
        while (current != null) {
            System.out.print(current.val + (current.next != null ? " -> " : ""));
            current = current.next;
        }
        System.out.println();
    }
}
