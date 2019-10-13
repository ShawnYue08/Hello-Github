public class 12_EditDistance {
    public int minDistance(String word1, String word2) {
        int n = word1.length(), m = word2.length();
        int[][] f = new int[n+1][m+1]; //一般用来处理边界情况
        //删除word1的前n个字母，f[4][0]将word1的前四个字符删除变为word2
        for(int i = 0; i <= n; i++) f[i][0] = i;
        //添加word2的前m个字母，f[0][4]将word1的前0个字符添加变为word2
        for(int j = 0; j <= m; j++) f[0][j] = j;
        
        //最后一步操作为：（将word1前i个字母变为word2的前j个字母）
        //insert:f[i][j] = f[i][j-1] + 1
        //delete:f[i][j] = f[i-1][j] + 1
        //replace:f[i][j] = f[i-1][j-1] + (word1[i] == word2[j] ? 0 : 1);
        for(int i = 1; i <= n; i++) 
            for(int j = 1; j <= m; j++) {
                f[i][j] = Math.min(f[i][j-1], f[i-1][j]) + 1;
                f[i][j] = Math.min(f[i][j], f[i-1][j-1] + (word1.charAt(i-1) == word2.charAt(j-1) ? 0 : 1));
            }
        return f[n][m];
    }
}
