public class 05_ImplementstrStr {
    public int implementStr(String hayStack, String needle) {
        if(needle == null || needle.length() == 0) {
            return 0;
        }
        int i = 0, j = 0;
        while(i < hayStack.length() - needle.length() + 1) {
            int temp = i;
            //暴力kmp算法
            while(hayStack.charAt(i) == needle.charAt(j)) {
                i++;
                j++;
                if(j == needle.length()) {
                    return i - needle.length();
                }
            }
            //没匹配到,从头重新找
            i = temp + 1;
            j = 0;
        }
        return -1;
    }
}
