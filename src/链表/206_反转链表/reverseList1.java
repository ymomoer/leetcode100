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
public class reverseList1 {
    public ListNode reverseList(ListNode head){
        ListNode pre = null;
        ListNode cur = head;
        while (cur!=null) {
            ListNode next = cur.next;
            cur.next = pre;
            pre = cur;
            cur = next;
        }
        return pre;
    }

    public static void main(String[] args){
        ListNode head = new ListNode(1);
        head.next = new ListNode(2);
        head.next.next=new ListNode(3);
        head.next.next.next=new ListNode(4);
        head.next.next.next.next=new ListNode(5);

        System.out.print("Original List:");
        printList(head);

        reverseList1 reverser = new reverseList1();
        ListNode reversedhead = reverser.reverseList(head);

        System.out.print("Reversed List:");
        printList(reversedhead);
    }

    public static void printList(ListNode head){
        
        ListNode curr = head;
        while (curr!=null) {
            System.out.print(curr.val+" ");
            curr = curr.next;
            
        }
        System.out.println();
    }
}
