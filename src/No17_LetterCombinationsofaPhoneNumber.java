import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

/**
 * Created by yzhang46 on 2017/9/7.
 * Given a digit string, return all possible letter combinations that the number could represent.
 * A mapping of digit to letters (just like on the telephone buttons) is given below.
 * Input:Digit string "23"
 * Output: ["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
 *
 * solution:广度优先 队列实现 FIFO
 */
public class No17_LetterCombinationsofaPhoneNumber {
    public List<String> letterCombinations(String digits) {
        List<String> res = new LinkedList<>();
        if(digits == null){
            return res;
        }

        String[] mapping = new String[] {"0", "1", "abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};
        for(int i =0; i<digits.length();i++){
            int x = Character.getNumericValue(digits.charAt(i));
            if (res.size() == 0){
                String str = "";
                for(char c : mapping[x].toCharArray())
                    res.add(str+c);
            }
            while(res.get(0).length() == i){
                String t = res.remove(0);
                    for(char s : mapping[x].toCharArray())
                    res.add(t+s);
            }
        }
        return res;
    }

    public static void main(String[] args) {
        No17_LetterCombinationsofaPhoneNumber no17 = new No17_LetterCombinationsofaPhoneNumber();
        System.out.println(no17.letterCombinations("23"));
    }
}
