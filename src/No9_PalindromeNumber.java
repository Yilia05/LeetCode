/**
 * Created by YiliaZhang on 2017/5/5.
 * compare half of the digits in x, so don't need to deal with overflow.
 */
public class No9_PalindromeNumber {
    public boolean isPalindrome(int x) {
        if(x<0 || (x>0 && x%10==0))
            return false;
        int mod = 0;
        while(x>mod){
            mod = x%10 + mod*10;
            x = x/10;
        }
        return x == mod || x == mod/10;

    }
}
