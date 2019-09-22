public class 10_ArrangeCoins {
    public int arrange(int n) {
        //给定n个硬币，第k行排k个硬币，可以排多少完整的行，测试用例中的n = Integer.MAX_VALUE，所以sum必须为long类型
        if(n == 0) return 0;
        int i = 1;
        long sum = i;
        while(sum <= n) {
            //只要和小于等于n就可以继续i++
            i++;
            sum += i;
        }
        return i - 1;
    }
}
