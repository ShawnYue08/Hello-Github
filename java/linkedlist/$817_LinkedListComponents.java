import java.util.HashSet;

public class $817_LinkedListComponents {
    public int linkedListComponents(ListNode head, int[] G) {
        if(head == null) { return 0; }
        //返回的是数组中链表组件的个数
        HashSet<Integer> hashSet = new HashSet<>();
        for(int i = 0; i < G.length; i++) {
            hashSet.add(G[i]);
        }
        LinkedList current = head;
        int count = 0;
        while(current != null) {
            if(hashSet.contains(current.val)) {
                count++;
                while(hashSet.contains(current.val) && current.next != null) {
                    current = current.next;
                }
            }
            current = current.next;
        }
        return count;
    }
}
