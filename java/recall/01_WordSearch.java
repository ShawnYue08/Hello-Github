public class 01_WordSearch {
    int n, m;
    int[] dx = {-1, 0, 1, 0}, dy = {0, -1, 0, 1}; //上 左 下 右
    public boolean exist(char[][] board, String word) {
        if(board.length == 0 || board[0].length == 0) { return false; }
        n = board.length; m = board[0].length;
        //枚举起点
        for(int i = 0; i < n; i++) 
            for(int j = 0; j < m; j++) 
                if(dfs(board, i, j, word, 0)) //0代表word测试到第几位了
                    return true;
        return false;
    }
    
    public boolean dfs(char[][] board, int x, int y, String word, int u) {
        if(board[x][y] != word.charAt(u)) return false;
        if(u == word.length() - 1) return true;
        
        //board[x][y] == word.charAt(u) && u != word.length() - 1
        //标记
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
