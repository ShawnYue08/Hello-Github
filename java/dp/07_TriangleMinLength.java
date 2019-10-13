public class 07_TriangleMinLength {
    public int minimumTotal(List<List<Integer>> triangle) {
        //1、初始化二维状态数组f，根据参数triangle进行赋值
        int n = triangle.size();
        int[][] f = new int[n][n];
        f[0][0] = triangle.get(0).get(0);
        for(int i = 1; i < n; i++) {
            for(int j = 0; j <= i; j++) {
                //2、只需要对triangle数组的一半进行操作
                f[i][j] = Integer.MAX_VALUE;
                //3、上一步从左上方向来，只要满足j > 0
                if(j > 0) {
                    f[i][j] = Math.min(f[i][j], f[i-1][j-1] + triangle.get(i).get(j)); 
                }
                //4、上一步从右上方向来，只要满足j < i，对角线的左下侧，不包含对角线部分
                if(j < i) {
                    f[i][j] = Math.min(f[i][j], f[i-1][j] + triangle.get(i).get(j));
                }
            }
        }
        //6、比较二维数组f的最后一行，判断那条路径和最小
        int resMin = Integer.MAX_VALUE;
        for(int k = 0; k < n; k++) {
            resMin = Math.min(resMin, f[n-1][k]);
        }
        return resMin;
    }
}
