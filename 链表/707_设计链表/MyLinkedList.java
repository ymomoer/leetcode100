class ListNode {
    int val;
    ListNode next;
    ListNode(){}
    ListNode(int val) {
        this.val=val;
    }
}
class MyLinkedList {
    int size;
    ListNode dummyhead;

    public MyLinkedList() {
        size = 0;
        dummyhead = new ListNode(0);
    }

    public int get(int index) {
        if (index < 0 || index >= size) {
            return -1;
        }
        ListNode currentNode = dummyhead;
        for (int i = 0; i <= index; i++) {
            currentNode = currentNode.next;
        }
        return currentNode.val;
    }

    public void addAtHead(int val) {
        ListNode newNode = new ListNode(val);
        newNode.next = dummyhead.next;
        dummyhead.next = newNode;
        size++;
    }

    
    public void addAtTail(int val) {
        ListNode newNode = new ListNode(val);
        ListNode cur = dummyhead;
        while (cur.next != null) {
            cur = cur.next;
        }

        cur.next = newNode;
        size++;

    }

    
    public void addAtIndex(int index, int val) {
        if (index > size) {
            return;
        }
        if (index < 0) {
            index = 0;
        }
        size++;
       
        ListNode pred = dummyhead;
        for (int i = 0; i < index; i++) {
            pred = pred.next;
        }
        ListNode toAdd = new ListNode(val);
        toAdd.next = pred.next;
        pred.next = toAdd;
    }

    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size) {
            return;
        }
        size--;
        ListNode pred = dummyhead;
        for (int i = 0; i < index ; i++) {
            pred = pred.next;
        }
        pred.next = pred.next.next;
    }

    public static void main(String[] args) {
        MyLinkedList linkedList = new MyLinkedList();

  
        linkedList.addAtHead(1);        
        linkedList.addAtTail(2);        
        linkedList.addAtHead(3);
        linkedList.addAtIndex(1, 4);    
        linkedList.addAtIndex(0, 5);    
        linkedList.addAtTail(6);       

         // 测试: 获取元素
         System.out.println(linkedList.get(0)); // 应该输出 5
         System.out.println(linkedList.get(1)); // 应该输出 3
         System.out.println(linkedList.get(2)); // 应该输出 4
         System.out.println(linkedList.get(3)); // 应该输出 1
         System.out.println(linkedList.get(4)); // 应该输出 2
         System.out.println(linkedList.get(5)); // 应该输出 6
         System.out.println(linkedList.get(6)); // 应该输出 -1 (无效索引)
     }
}

