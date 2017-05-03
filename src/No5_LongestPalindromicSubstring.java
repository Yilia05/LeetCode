/**
 * Created by YiliaZhang on 2017/8/31.
 * Given a string s, find the longest palindromic substring in s.
 * You may assume that the maximum length of s is 1000.
 */
public class No5_LongestPalindromicSubstring {
    int low = 0;
    int maxLen = 0;
    public String longestPalindrome(String s) {
        int len = s.length();
        if(len<2){
            return s;
        }
        for(int i = 0;i<len-1 ;i++){
            helpFind(s,i,i);
            helpFind(s,i,i+1);
        }
        return s.substring(low, low+maxLen);

    }

    public void helpFind(String s, int j, int k){
        while(j>=0 && k<s.length() && s.charAt(j)==s.charAt(k)){
            j--;
            k++;
        }
        if (maxLen < k - j - 1) {
            low = j + 1;
            maxLen = k - j - 1;
        }

    }

    public static void main(String[] args) {
        No5_LongestPalindromicSubstring five = new No5_LongestPalindromicSubstring();
        String s = "abbba";
        String res = five.longestPalindrome(s);
        System.out.println(res);
    }
}
