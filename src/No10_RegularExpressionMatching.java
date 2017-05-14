/**
 * Created by yzhang46 on 2017/11/8.
 * '.' Matches any single character.
 * '*' Matches zero or more of the preceding element.
 * The matching should cover the entire input string (not partial).
 * The function prototype should be:
 * bool isMatch(const char *s, const char *p)
 * Some examples:
 * isMatch("aa","a") → false
 * isMatch("aa","aa") → true
 * isMatch("aaa","aa") → false
 * isMatch("aa", "a*") → true
 * isMatch("aa", ".*") → true
 * isMatch("ab", ".*") → true
 * isMatch("aab", "c*a*b") → true
 *
 */
public class No10_RegularExpressionMatching {
    public boolean isMatch(String s, String p) {
        for(int i = 0; i+1<s.length();  ){
            for(int j=0; j+1<p.length();  ){
                if (p.equals(".*")) {
                    return true;
                }
                else if(p.charAt(j)=='.' || s.charAt(i)==p.charAt(j)){
                    i++;
                    j++;
                }
                else if(p.charAt(j)!=s.charAt(i) && j+1<p.length() && p.charAt(++j)=='*'){
                    j+=2;
                }
                else if(j+1==p.length() && s.charAt(i)!=p.charAt(j)){
                    return false;
                }
                else if(p.charAt(j)=='.' && j+1<p.length() && p.charAt(++j)=='*'){
                    i+=2;
                    j+=2;
                }
                else if(p.charAt(j)=='*' && i<s.length() && s.charAt(i)==p.charAt(j-1)){
                    if(i+1==s.length() && j<p.length()-1){
                        if(p.charAt(j+1) == s.charAt(i)){
                            j++;
                        }
                        else{
                            return false;
                        }
                    }
                    else{
                        i++;
                    }

                }
                else if(j+1==p.length() && i+1==s.length() && (s.charAt(i)==p.charAt(j) || p.charAt(j)=='.')){
                    return true;
                }
            }
        }
        return false;
    }

    public static void main(String[] args) {
        String s = "aa";
        String p = "a";
        No10_RegularExpressionMatching No10 = new No10_RegularExpressionMatching();
        Boolean res = No10.isMatch(s,p);
        System.out.println(res);
    }

}
