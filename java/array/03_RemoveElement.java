public class 03_RemoveElement {
    public int removeElement(int[] nums, int val) {
        //删除数组中nums[i]==val的元素，双指针，j指针只是探路的
        int i = 0, j = 0;
        while(j < nums.length) {
            //当j指针探好了路，i再向前走
            if(nums[j] != val) {
                nums[i++] = nums[j++];
            } else {
                j++;
            }
        }
        return i;
    }
}
