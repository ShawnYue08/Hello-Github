public class MergeTwoLists {
  /*
  合并两个链表的套路：递归 + 迭代
  1、迭代：空间复杂度while(l1 != null && l2 != null) 循环结束时假设某条链表还有剩余元素，cur.next = l1 == null ? l2 : l1;
  2、递归：时间复杂度if - else if - else 结构
  */
  
  //迭代
  public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    ListNode res = new ListNode(-1);
    ListNode cur = res;
    while(l1 != null && l2 != null) {
      if(l1.val <= l2.val) {
        cur.next = l1;
        l1 = l1.next;
      } else {
        cur.next = l2;
        l2 = l2.next;
      }
      cur = cur.next;
    }
    cur.next = l1 == null ? l2 : l1;
    return res.next;
  }
  
  //递归
  public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
    if(l1 == null) { 
      return l2;
    } else if(l2 == null) { 
      return l1; 
    } else if(l1.val <= l2.val) {
        l1.next = mergeTwoLists(l1.next, l2);
        return l1;
    } else {
        l2.next = mergeTwoLists(l1, l2.next);
        return l2;
    }
  }
}
