/**
 * Created by yzhang46 on 2017/11/6.
 * Given an integer n, return the number of trailing zeroes in n!.
 */
public class No172_FactorialTrailingZeroes {
    public int trailingZeroes(int n) {
        int r = 0;
        while (n > 0) {
            n /= 5;
            r += n;
        }
        return r;
    }
}
