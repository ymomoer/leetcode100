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

public class swapPairs1 {
    public ListNode swapPairs(ListNode head) {
        ListNode dummy = new ListNode();
        dummy.next = head;
        ListNode cur = dummy;
        while(cur.next!=null && cur.next.next!=null){
            ListNode tmp = cur.next;
            ListNode tmp1 = cur.next.next.next;
            cur.next = cur.next.next;
            cur.next.next = tmp;
            tmp.next = tmp1;
            cur = cur.next.next;
        }
        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        System.out.print("Oringinal List: ");
        printList(head);

        swapPairs1 swap1 = new swapPairs1();
        ListNode swaphead = swap1.swapPairs(head);

        System.out.print("swaped List: ");
        printList(swaphead);



    }
    public static void printList(ListNode head){
        ListNode cur = head;
        while(cur!=null){
            System.out.print(cur.val+" ");
            cur = cur.next;
        }
        System.out.println();
    }
}
