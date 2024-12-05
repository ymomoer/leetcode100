
// Definition for singly-linked list.
class ListNode {
        int val;
        ListNode next;
        ListNode(int x) {
            val = x;
            next = null;
     }
 }
 
public class IntersectList {
    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
       if(headA == null || headB == null){
             return null;
       }
       ListNode pA = headA;
       ListNode pB = headB;
       while(pA!= pB)  {
            pA = pA == null ? headB : pA.next;
            pB = pB == null ? headA : pB.next;
       }
       return pA;
    }

    public static void main(String[] args) {
        // 创建链表A: 1 -> 2 -> 3
        ListNode headA = new ListNode(1);
        headA.next = new ListNode(2);
        headA.next.next = new ListNode(3);

        // 创建链表B: 4 -> 5
        ListNode headB = new ListNode(4);
        headB.next = new ListNode(5);

        // 创建交点: 6
        ListNode intersection = new ListNode(6);
        headA.next.next.next = intersection; // 3 -> 6
        headB.next.next = intersection;       // 5 -> 6

        // 调用方法并输出结果
        IntersectList intersectList = new IntersectList();
        ListNode result = intersectList.getIntersectionNode(headA, headB);

        if (result != null) {
            System.out.println("交点的值: " + result.val); // 输出交点的值
        } else {
            System.out.println("没有交点.");
        }
    }
}