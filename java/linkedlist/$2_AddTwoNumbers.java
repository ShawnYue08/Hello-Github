public class $2_AddTwoNumbers {
	public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        ListNode res = new ListNode(-1);
        ListNode p = l1, q = l2, current = res;
        int carry = 0; //进位
        int sum = 0;
	/*
	两数之和，while(p != null || q != null) 归并两条链表，while(p != null && q != null)
	两数之和：两条链表某条链表可以为null，值val=0即可，归并两条链表：两条链表每一条都不能为null，否则无法比较，退出while循环时，
	直接将某条链表链接到res链表上
	*/
        while(p != null || q != null) {
            int m = p != null ? p.val : 0;
            int n = q != null ? q.val : 0;
            sum = m + n + carry;
            //因为是计算两数之和，所以不能简单的current.next = p || q，而是需要new ListNode(sum % 10);
            current.next = new ListNode(sum % 10);
            carry = sum / 10;
            if(p != null) { p = p.next; }
            if(q != null) { q = q.next; }
            current = current.next;
        }
        //当p和q的链表都只有一个数时，比如 5 + 5 ，这时current指向val=0的节点
        if(carry != 0) {
            current.next = new ListNode(carry);
        }
        return res.next; //返回第一个节点
    }
}
