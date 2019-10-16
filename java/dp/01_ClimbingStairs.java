public class ClimbingStairs {
    public int climbStairs(int n) {
        //最后一步可以由f[n-1]和f[n-2]爬一阶或者两阶而来,一维状态数组f[n] = f[n-1] + f[n-2]
        int[] f = new int[n+1];
        //f[i]代表爬到第i阶楼梯的总方法
        f[0] = f[1] = 1;
        for(int i = 2; i <= n; i++)
            f[i] = f[i-1] + f[i-2];
        return f[n];
    }
}
