public class 09_JudgeSubsequence {
    public boolean isSubsequence(String s, String t) {
        //判断s字符串是否是t的子序列，即s字符串的每个字符在字符串t中顺序出现
        //双指针,没有使用String类的indexOf方法
        char[] s1 = s.toCharArray();
        char[] t1 = t.toCharArray();
        int i = 0, j = 0, sl = s1.length, tl = t1.length;
        while(i < sl && j < tl) {
            if(s1[i] == t1[j]) {
                i++;
                j++;
            } else {
                j++;
            }
        }
        if(i == sl && j <= tl) {
            return true;
        } else {
            return false;
        }
    }
}
