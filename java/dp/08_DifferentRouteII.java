public class 08_DifferentRouteII {
    public int uniquePathsWithObstacles(int[][] array) {
        //1、f[i][j]数组代表当前[i,j]位置有多少种路径，初始化二位数组默认值为0
        int n = array.length;
        int m = array[0].length;
        int[][] f = new int[n][m];
        for(int i = 0; i < n; i++) {
            for(int j = 0; j < m; j++) {
                //2、如果有障碍物，那么就跳过，则此路不同，f[i][j]还是0，并且影响了后面的f[i][j++]
                if(array[i][j] == 1) continue;
                if(i == 0 && j == 0) f[i][j] = 1;
                if(i > 0) {
                    //3、非第一行元素
                    f[i][j] += f[i-1][j];
                }
                if(j > 0) {
                    //4、非第一列元素
                    f[i][j] += f[i][j-1];
                }
            }
        }
        return f[n-1][m-1];
    }
}
