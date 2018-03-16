/**
 * Created by yzhang46 on 2017/11/30.
 * Given a non-negative integer num, repeatedly add all its digits until the result has only one digit.
 * For example:
 * Given num = 38, the process is like: 3 + 8 = 11, 1 + 1 = 2. Since 2 has only one digit, return it.
 * Follow up:
 * Could you do it without any loop/recursion in O(1) runtime?
 */
public class No258_AddDigits {
    public int addDigits(int num) {
        while (num/10 != 0){
            num = num/10 + num%10;
        }
        return num;
    }

    // method 2
    //dr(n) = 1 + (n - 1) % 9
    public int addDigits2(int num) {
        return num%9;
    }
}
