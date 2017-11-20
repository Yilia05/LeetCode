/**
 * Created by yzhang46 on 2017/11/20.
 * Given an integer, write a function to determine if it is a power of two.
 */
public class No231_PowerofTwo {
    // 这种方法速度比较快，其运算次数与输入n的大小无关，只与n中1的个数有关。
    // 如果n的二进制表示中有k个1，那么这个方法只需要循环k次即可。
    // 其原理是不断清除n的二进制表示中最右边的1，同时累加计数器，直至n为0
    // 为什么n &= (n – 1)能清除最右边的1呢？
    // 因为从二进制的角度讲，n相当于在n - 1的最低位加上1。
    // 举个例子，8（1000）= 7（0111）+ 1（0001），
    // 所以8 & 7 = （1000）&（0111）= 0（0000），
    // 清除了8最右边的1（其实就是最高位的1，因为8的二进制中只有一个1）。
    // 再比如7（0111）= 6（0110）+ 1（0001），所以7 & 6 = （0111）&（0110）= 6（0110），清除了7的二进制表示中最右边的1（也就是最低位的1）
    // the power of 2 has only one 1 in the binary
    public boolean isPowerOfTwo(int n) {
        if(n<=0) return false;
        if((n&(n-1))==0){
            return true;
        }else {
            return false;
        }
    }
}
