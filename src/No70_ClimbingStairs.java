/**
You are climbing a stair case. It takes n steps to reach to the top.

Each time you can either climb 1 or 2 steps. In how many distinct ways can you climb to the top?

简单题目，相当于fibonacci数列问题，难点就是要会思维转换
*/


public class No70_ClimbingStairs {
    public int climbStairs(int n) {
        int[] a = new int[n+1];
        a[0] = 1;
        a[1] = 1;
        for (int i = 2; i <= n; i++)
        {
            a[i] = a[i-1] + a[i-2];
        }
        return a[n];
    }

}
