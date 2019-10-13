public class 09_DecodeMethod {
    public int numDecodings(String s) {
        //状态数组f[i]:最后一个字母由一个数字解码f[i-1] + 最后一个字母由两个数字解码f[i-2]
        int n = s.length();
        int[] f = new int[n+1];
        f[0] = 1;
        for(int i = 1; i <= n; i++) {
            //最后一个字母由一个数字解码
            if(s.charAt(i-1) != '0')  f[i] += f[i-1];
            //最后一个字母由两个数字解码
            if(i >= 2) {
                int t = (s.charAt(i-2) - '0') * 10 + (s.charAt(i-1) - '0');
                if(t >= 10 && t <= 26)
                    f[i] += f[i-2];
            }
        }        
        return f[n]; 
        //空数字数组，返回""空串，一种解码方式
    }
}
