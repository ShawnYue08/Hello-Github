public class $23_MergeKLists {
  public ListNode mergeKLists(ListNode[] lists) {
    if(lists == null || lists.length == 0) { return null; }
    return merge(lists, 0, lists.length - 1);
  }
  
  public ListNode merge(ListNode[] lists, int left, int right) {
      if(left == right) { return lists[left]; }
      int mid = left + (right - left) / 2;
      ListNode p = merge(lists, 0 , mid);
      ListNode q = merge(lists, mid + 1, right);
      return mergeTwoLists(p, q);
  }
  
  //合并两条链表
  public ListNode mergeTwoLists(ListNode p, ListNode q) {
    if(p == null) {
      return q;
    } else if(q == null) {
      return p;
    } else if(p.val <= q.val) {
      p.next = mergeTwoLists(p.next, q);
      return p;
    } else{
      q.next = mergeTwoLists(p, q.next);
      return q;
    }
  }
}
