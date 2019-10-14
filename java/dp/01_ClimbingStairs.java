public class ClimbingStairs {
    public int climbStairs(int n) {
        //最后一步:爬一阶台阶f[i] = f[i-1],爬两阶台阶f[i] = f[i-2],
        //f[i] = f[i-1] + f[i-2]
        int[] f = new int[n+1];
        f[0] = f[1] = 1;
        for(int i = 2; i <= n; i++)
            f[i] = f[i-1] + f[i-2];
        return f[n];
    }
}
