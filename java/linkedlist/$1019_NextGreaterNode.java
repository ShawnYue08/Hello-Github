public class $1019_NextGreaterNode {
    public int[] nextGreaterNode(ListNode head) {
        if(head == null) { return null; }
        //从后向前给数组赋值
        ArrayList<Integer> list  = new ArrayList<>();
        while(head != null) {
            list.add(head.val);
            head = head.next;
        }
        Stack<Integer> stack = new Stack<>();
        int[] res = new int[list.size()];
        //ArrayList的作用是为了从后向前遍历链表方便
        for(int i = list.size()-1; i >= 0; i--) {
            while(!stack.empty() && stack.peek() < list.get(i)) {
                stack.pop();
            }
            res[i] = stack.empty()? 0 : stack.peek();
            stack.push(list.get(i));
        }
        return res;
    }
}
