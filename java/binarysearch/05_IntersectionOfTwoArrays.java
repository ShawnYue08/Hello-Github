public class 05_IntersectionOfTwoArrays {
    public int[] intersection(int[] nums1, int[] nums2) {
        //两个数组的交集，先去重，哈希表
        Set<Integer> set1 = new HashSet<>();
        Set<Integer> set2 = new HashSet<>();
        for(int num : nums1) {
            set1.add(num);
        }
        for(int num1 : nums2) {
            set2.add(num1);
        }
        int[] res = new int[Math.min(set1.size(), set2.size())];
        int index = 0;
        //遍历较小的Set集合
        for(Integer temp : set2) {
            if(set1.contains(temp)) {
                res[index++] = temp;
            }
        }
        return Arrays.copyOf(res, index);
    }
}
