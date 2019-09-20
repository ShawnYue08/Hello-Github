public class 06_IntersectionOfTwoArray2 {
        //使用哈希表实现
        HashMap<Integer,Integer> map = new HashMap<>();
        //int[] res在初始化时无法确定长度。所以使用List
        List<Integer> list = new ArrayList<>();
        //遍历nums1，将value与频次记录到map哈希表中
        for(int num : nums1) {
            if(!map.containsKey(num)) {
                map.put(num, 1);
            } else {
                map.put(num, map.get(num) + 1);
            }
        }
        //遍历nums2，如果在map键的集合中存在，就加入到list集合中
        for(int num1 : nums2) {
            if(map.containsKey(num1) && map.get(num1) > 0) {
                list.add(num1);
                map.put(num1, map.get(num1) - 1);
            }
        }
        int[] res = new int[list.size()];
        for(int i = 0; i < res.length; i++) {
            res[i] = list.get(i);
        }
        return res;
}
