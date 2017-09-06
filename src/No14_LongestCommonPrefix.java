import java.util.Arrays;

/**
 * Created by YiliaZhang on 2017/9/6.
 * Write a function to find the longest common prefix string amongst an array of strings.
 */
public class No14_LongestCommonPrefix {
    public String longestCommonPrefix(String[] strs) {
        if(strs == null || strs.length == 0){
            return "";
        }
        Arrays.sort(strs);

        String str1 = strs[0];
        String strn = strs[strs.length-1];

        int len = 0;
        for(int i = 0; i<Math.min(str1.length(),strn.length());i++){
            if(str1.charAt(i) == strn.charAt(i))
                ++len;
            else
                break;
        }
        return str1.substring(0,len);
    }

}
