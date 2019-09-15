public class $19_RemoveNthNodeFromEnd {
  /*
  删除倒数第n个节点在n有效的情况下，设置一个dummy节点指向head节点，快慢指针同时指向dummy节点，移动快指针指向第n个节点，
  同时移动fast和slow指针直到fast指向最后一个节点，即fast.next == null，此时slow指向倒数第n个节点的前一个节点，删除slow.next;
  所以就是slow.next = slow.next.next;返回头节点
  */
  public ListNode removeNthFromEnd(ListNode head, int n) {
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
