public class 10_MinRouteSum {
    //最小路径和
    public int minPathSum(int[][] array) {
        //二维状态数组f[i][j]代表从左上角到(i,j)的最小路径和
        int row = array.length, col = array[0].length;
        int[][] f = new int[row][col];        
        //枚举二维数组array
        for(int i = 0; i < row; i++) {
            for(int j = 0; j < col; j++) {
                f[i][j] = Integer.MAX_VALUE;
                if(i == 0 && j == 0) f[i][j] = array[i][j]; //***最重要的一步，不然f[0][0] = Integer.MAX_VALUE;
                //上一步从上方下来
                if(i > 0)
                    f[i][j] = Math.min(f[i][j], f[i-1][j] + array[i][j]);
                //上一步从左侧过来
                if(j > 0)
                    f[i][j] = Math.min(f[i][j], f[i][j-1] + array[i][j]);
            }
        }
        return f[row-1][col-1];
    }
}
