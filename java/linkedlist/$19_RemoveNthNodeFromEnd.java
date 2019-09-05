public class $19_RemoveNthNodeFromEnd {
  public ListNode removeNthFromEnd(ListNode head, int n) {
    //题目中说给定的N是有效的，所以暂不考虑N大于链表长度的情况
    ListNode dummy = new ListNode(-1);
    dummy.next = head;
    ListNode slow = dummy, fast = dummy;
    while(n > 0 && fast != null) {
      fast = fast.next;
      n--;
    }
    //fast指向链表的第n个位置
    while(fast.next != null) {
      slow = slow.next;
      fast = fast.next;
    }
    //fast指向链表的最后一个节点，slow指向链表的倒数第n节点的前一个节点
    slow.next = slow.next.next;
    return dummy.next;
  }
}
