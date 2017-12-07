import java.lang.reflect.Array;
import java.util.HashMap;

/**
 * Created by yzhang46 on 2017/12/7.
 * Given a pattern and a string str, find if str follows the same pattern.
 * Example: pattern = "abba", str = "dog cat cat dog" should return true.
 *
 * You may assume pattern contains only lowercase letters,
 * and str contains lowercase letters separated by a single space.
 */
public class No290_WordPattern {
    public boolean wordPattern(String pattern, String str) {
        String[] strs = str.split(" ");
        if(pattern.length() != strs.length)
            return false;

        HashMap map = new HashMap<>();
        for(int i = 0; i<pattern.length(); i++){
            if (map.putIfAbsent(pattern.charAt(i), i) != map.putIfAbsent(strs[i], i))
                return false;
        }
        return true;
    }
}
