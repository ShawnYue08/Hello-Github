public class 02_Sqrt(x) {
    public int sqrt(int x) {
        //搜索x的平方根，根据此性质，把左侧区间划分为平方小于等于x，右侧区间为平方大于x
        //查找左侧区间的右边界，二分模板2
        int i = 0, j = x;
        while(i < j) {
            int mid = i + j + 1 >> 1;
            if(mid <= x / mid) {
                //满足左侧区间的性质时
                i = mid;
            } else {
                //满足右侧区间的性质时
                j = mid - 1;
            }
        }
        return i;
    }
}
