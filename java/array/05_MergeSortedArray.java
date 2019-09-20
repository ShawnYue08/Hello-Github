public class 05_MergeSortedArray {
    //额外空间
    public void mergeSortedArray1(int[] nums1, int m, int[] nums2, int n) {
        //nums1={146000} nums2={135} m=3 n=3
        int[] tempArray = new int[nums1.length];
        int i = 0, j = 0, k = 0;
        while(i < m && j < n) {
            if(nums1[i] < nums2[j]) {
                tempArray[k++] = nums1[i++]; 
            } else {
                tempArray[k++] = nums2[j++];
            }
        }
        while(i < m) {
            tempArray[k++] = nums1[i++];
        }
        while(j < n) {
            tempArray[k++] = nums2[j++];
        }
        for(int a = 0; a < nums1.length; a++) {
            nums1[a] = tempArray[a];
        }
    }
    
    //原地修改
    public void mergeSortedArray2(int[] nums1, int m, int[] nums2, int n) {
        int i = m - 1;
        int j = n - 1;
        int k = m + n - 1;
        while(i >= 0 && j >= 0) {
            if(nums1[i] > nums2[j]) {
                nums1[k--] = nums1[i--];
            } else {
                nums1[k--] = nums2[j--];
            }
        }
        System.arraycopy(nums2, 0, nums1, 0, j+1);
    }
}
