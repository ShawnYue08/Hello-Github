public class 07_TriangleMinLength {
    public int minimumTotal(List<List<Integer>> triangle) {
        //二维状态数组f[i][j]代表从上到下(i,j)坐标的最小和
        int n = triangle.size();
        int[][] f = new int[n][n];
        f[0][0] = triangle.get(0).get(0);
        for(int i = 1; i < n; i++) {
            for(int j = 0; j <= i; j++) { //triangle数组左下方
                f[i][j] = Integer.MAX_VALUE;
                //上一步从左上方下来，2 ---> 4
                if(j > 0) 
                    f[i][j] = Math.min(f[i][j], f[i-1][j-1] + triangle.get(i).get(j));
                //上一步从右上方下来，2 ---> 3
                if(j < i)
                    f[i][j] = Math.min(f[i][j], f[i-1][j] + triangle.get(i).get(j));         
            }
        }
        int minSum = Integer.MAX_VALUE;
        for(int k = 0; k < n; k++)
            minSum = minSum > f[n-1][k] ? f[n-1][k] : minSum;
        return minSum;
    }
}
