public class 04_MergeTwoSortedArray {
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        //原地修改，不开辟额外空间，从后向前归并，双指针，从后向前
        int i = m - 1, j = n - 1, k = m + n - 1;
        while(i >= 0 && j >= 0) {
            if(nums1[i] < nums2[j]) {
                //那么应该把nums[j]放到nums1数组的末尾
                nums1[k--] = nums2[j--];
            } else {
                nums1[k--] = nums1[i--];
            }
        }
        //最后，假如nums2数组还有剩余
        System.arraycopy(nums2, 0, nums1, 0, j + 1);
    }
}
