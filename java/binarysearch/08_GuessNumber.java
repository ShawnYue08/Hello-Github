public class 08_GuessNumber {
    public int guessNumber(int n) {
        //pick是挑选的数，guess(num)函数返回-1 : 我的数字比较小，pick比较小;guess(num)函数返回1 ：我的数字比较大，pick比较大
        //将[1,n]分为根据guess(num)分为两段性，左侧小于pick，右侧大于等于pick
        int i = 1, j = n;
        while(i < j) {
            int mid = i + (j - i) / 2; // i + j >> 1一直超时
            if(guess(mid) > 0) {
                //pick > mid，所以mid满足左侧性质
                i = mid + 1;
            } else {
                //mid满足右侧性质，guess(mid) <= 0 ，pick <= mid 等价于满足右侧性质
                j = mid;
            }
        }
        return i;
    }
}
