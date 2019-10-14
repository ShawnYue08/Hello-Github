//相邻的房屋不能偷，会触动报警装置
public class HouseRobberI {
    
    public int houseRoober(int[] nums) {
        //f[i] = max(f[i-1], f[i-2] + nums[i])
        if(nums.length == 0) return 0;
        int n = nums.length;
        int[] f = new int[n+1];
        f[1] = nums[0];
        for(int i = 2; i <= n; i++) {
            f[i] = Math.max(f[i-1], f[i-2] + nums[i-1]);
        }
        return f[n];
    }
    
    public int houseRoober(int[] nums) {
        //根据最后一家是否偷：f[i]最后一家不偷的最大值;g[i]最后一家偷的最大值
        //f[i] = max(f[i-1], g[i-1])(当最后一家不偷时,前一家可偷可不偷)
        //g[i] = f[i-1] + nums[i](当最后一家偷时,那么就是前一家不偷 + 当前这家的金额)
        int n = nums.length;
        int[] f = new int[n+1], g = new int[n+1];
        
        //f[n]代表最后一家，f[1]代表第一家，nums[0]的情况
        for(int i = 1; i <= n; i++) {
            f[i] = Math.max(f[i-1], g[i-1]);
            g[i] = f[i-1] + nums[i-1];
        }
        return Math.max(f[n], g[n]);
    }
    
}
