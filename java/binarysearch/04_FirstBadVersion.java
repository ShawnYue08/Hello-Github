public class 04_FirstBadVersion {
    public int findBadVersion(int n) {
        //根据isBadVersion()函数将区间划分为左区间，正确版本，右区间，错误版本，查找右区间的最左边界，使用二分查找的模板1
        int l = 1, r = n;
        while(l < r) {
            int mid = l + (r - l) / 2;
            if(isBadVersion(mid)) {
                //mid满足右侧性质时
                r = mid;
            } else {
                //mid满足左侧性质时
                l = mid + 1;
            }
        }
        return l;
    }
}
