public class 01_WordSearch {
    int n, m;
    int[] dx = {-1, 0, 1, 0}, dy = {0, -1, 0, 1}; //上 左 下 右
    public boolean exist(char[][] board, String word) {
        //判断边界,行=0或者列=0;
        if(board.length == 0 || board[0].length == 0) { return false; }
        n = board.length; m = board[0].length;
        //枚举起点;
        for(int i = 0; i < n; i++) 
            for(int j = 0; j < m; j++) 
                //从二维数组的(0,0)开始匹配word数组的0索引;
                if(dfs(board, i, j, word, 0)) 
                    return true;
        //起点都枚举完了还没找到返回false;
        return false;
    }
    
    /**
     * u代表匹配的word字符串的索引
     */
    public boolean dfs(char[][] board, int x, int y, String word, int u) {
        //起点不匹配，返回false
        if(board[x][y] != word.charAt(u)) return false;
        //能到这句代码说明u位置是匹配的，所以是u == word.length() - 1
        if(u == word.length() - 1) return true;
        
        //board[x][y] == word.charAt(u) && u != word.length() - 1
        //标记:现在是匹配了，但是需要向前继续匹配
        board[x][y] = '.';
        for(int i = 0; i < 4; i++) {
            //枚举上下左右四个方向的技巧，定义dx[4],dy[4]
            int a = x + dx[i], b = y + dy[i];
            if(a >= 0 && a < n && b >= 0 && b < m) {
                if(dfs(board, a, b, word, u + 1)) 
                    return true;
            }
        }
        //回溯，回复初始状态
        board[x][y] = word.charAt(u);
        return false;
    }
}
