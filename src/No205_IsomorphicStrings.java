/**
 * Created by yzhang46 on 2017/11/14.
 * Given "egg", "add", return true.
 * Given "foo", "bar", return false.
 * Given "paper", "title", return true.
 * All occurrences of a character must be replaced with another character while preserving the order of characters.
 * No two characters may map to the same character but a character may map to itself.
 */
public class No205_IsomorphicStrings {
    public boolean isIsomorphic(String s, String t) {
        if(s.length() != t.length()){
            return false;
        }
        int[] sarr = new int[256];
        int[] tarr = new int[256];
        for(int i=0; i<s.length(); i++){
            if (sarr[s.charAt(i)] != tarr[t.charAt(i)])
                return false;
            sarr[s.charAt(i)] = i+1;
            tarr[t.charAt(i)] = i+1;
        }
        return true;
    }
}
