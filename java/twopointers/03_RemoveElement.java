public class 03_RemoveElement {
    public int removeElement(int[] nums, int val) {
       //移除元素：记住一个思想，前后指针(快慢指针)，j指针是探路的存在，真正记录有效元素的是i指针
       int i = 0, j = 0;
       while(j < nums.length) {
            if(nums[j] == val) {
                j++;
            } else {
                nums[i++] = nums[j++];
            }
       }
       return i;
    }
}
