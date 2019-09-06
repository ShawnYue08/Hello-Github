public class $147_InsertionSortList {
    public ListNode insertionSortList(ListNode head) {
        //对链表进行插入排序
        if(head == null || head.next == null) { return head; }
        //假如是要插入head节点的前面，所以必须有一个dummy节点
        ListNode dummy = new ListNode(-1), pre;
        dummy.next = head;
        while(head != null && head.next != null) {
            if(head.val < head.next.val) {
                //如果前一个节点小于后一个节点
                head = head.next;
                continue;
            }
            //否则就需要将将head.next节点进行移动
            pre = dummy;
            while(pre.next.val < head.next.val) { pre = pre.next; }
            //直到找到pre.next节点大于head.next节点，直接在pre节点之后插入head.next节点，这里一定要先保存head.next节点
            ListNode next = head.next;
            head.next = next.next;
            next.next = pre.next;
            pre.next = next;
            //这是已经将head.next移动到了head前面，而head.next也已经变了，所以不需要移动head指针
        }
        return dummy.next;
    }
}
