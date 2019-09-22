public class 07_ValidPerfectSquare {
    public boolean isSquare(int num) {
        //有效的完全平方数，16 return true 14 return false
        //左侧数平方小于等于num，右侧数平方大于num，寻找左侧区间的最右边界，使用二分模板二
        int i = 1, j = num;
        while(i < j) {
            int mid = i + j + 1 >> 1;
            if(mid <= num / mid) {
                //满足左侧性质
                i = mid;
            } else {
                //满足右侧性质
                j = mid - 1;
            }
        }
        return i * i == num ? true : false;
    }
}
