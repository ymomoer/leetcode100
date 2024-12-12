class ListNode {
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

class removeNthFromEnd1 {
    public ListNode removeNthFromEnd(ListNode head,int n){
        ListNode dummy = new ListNode(0);
        dummy.next = head;
        
        ListNode fast = dummy;
        ListNode slow = dummy;

        for(int i = 0;i<=n;i++){
            fast = fast.next;
        }

        while (fast!=null) {
            fast = fast.next;
            slow = slow.next;
        }
        if(slow.next!=null){
            slow.next = slow.next.next;
        }
        return dummy.next;
    }

    public static void main(String[] args){
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next = new ListNode(3);
        head.next.next.next = new ListNode(4);
        head.next.next.next.next = new ListNode(5);

        System.out.print("Oringinal List: ");
        printList(head);

        removeNthFromEnd1 removeNth = new removeNthFromEnd1();
        ListNode removeNthhead = removeNth.removeNthFromEnd(head, 2);

        System.out.print("removeNthed List: ");
        printList(removeNthhead);
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
