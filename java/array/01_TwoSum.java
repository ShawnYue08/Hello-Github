import java.util.HashMap;
public class 01_TwoSum {
    public int[] twoSum(int[] nums, int target) {
        int[] res = new int[]{-1, -1};
        //判断边界条件
        if(nums == null || nums.length < 2) {
            return res;
        }
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0; i < nums.length; i++) {
            int complement = target - nums[i];
            if(map.containsKey(complement)) {
                res[0] = map.get(complement);
                res[1] = i;
                break;
                //一旦找到正确的下标索引，退出本层for循环
            }
            map.put(nums[i], i);
        }
        return res;
    }
}
