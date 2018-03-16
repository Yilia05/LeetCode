import java.util.HashMap;

/**
 * Created by yzhang46 on 2017/11/28.
 * Given two strings s and t, write a function to determine if t is an anagram of s.
 * For example,
 * s = "anagram", t = "nagaram", return true.
 * s = "rat", t = "car", return false.
 * Note:
 * You may assume the string contains only lowercase alphabets.
 */
public class No242_ValidAnagram {
    public boolean isAnagram(String s, String t) {
        HashMap<Character,Integer> map = new HashMap<>();
        if(s.length()!=t.length()){
            return false;
        }
        if(s.length() == t.length() && s.length()==0)
            return true;
        for(int i = 0; i<s.length(); i++){
            if(map.get(s.charAt(i))==null){
                map.put(s.charAt(i),1);
            }else{
                map.put(s.charAt(i),map.get(s.charAt(i))+1);
            }
        }
        for(int j = 0; j<t.length(); j++){
            if(map.get(t.charAt(j))==null || map.get(t.charAt(j))<0){
                return false;
            }
            else{
                map.put(t.charAt(j),map.get(t.charAt(j))-1);
            }
        }

        for(int k=0;k<map.size();k++){
            if(map.get(s.charAt(k))!=0){
                return false;
            }
            return true;
        }
        return true;
    }
}
