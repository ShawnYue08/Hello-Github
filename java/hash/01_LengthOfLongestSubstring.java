public class 01_LengthOfLongestSubstring {
    public int lengthOfLongestSubstring(String s) {
        /*
        a b c a b c b b 无重复字符的最长字串
        j = 0        
        */          
        //判断边界条件
        if(s == null || s.length() == 0) return 0;
        HashMap<Character, Integer> map = new HashMap<>();
        int res = 0;
        for(int i = 0, j = 0; i < s.length(); i++) {
            if(map.containsKey(s.charAt(i))) {
                //i遍历到s[3]的'a'时,j需要移动到s[1]的位置
                j = Math.max(j, map.get(s.charAt(i)) + 1);
            }
            map.put(s.charAt(i), i); //把新字串中的s[i]字符更新在map中
            res = Math.max(res, i - j + 1);
        }
        return res;
    }
}
