import java.util.ArrayList;
import java.util.Stack;

/**
 * Created by yzhang46 on 2017/9/14.
 * Given a string containing just the characters '(' and ')',
 * find the length of the longest valid (well-formed) parentheses substring.
 * NOTE:substring,it's important
 * For "(()", the longest valid parentheses substring is "()", which has length = 2.
 * Another example is ")()())", where the longest valid parentheses substring is "()()",
 * which has length = 4.
 */
public class No32_LongestValidParentheses {
    public int longestValidParentheses(String s) {
        Stack<Integer> stack = new Stack<>();
        int sum = 0;
        int max = 0;
        int n = s.length();
        for(int i = 0; i<s.length();i++){
            if(stack.isEmpty() && s.charAt(i)==')')
                continue;
            else if(s.charAt(i)=='(') {
                stack.add(i);
            }
            else if(!stack.isEmpty() && s.charAt(i)==')'){
                stack.pop();
            }
        }
        if(stack.empty())
            return n;
        else{
            for(int i = n;!stack.empty();){
                int temp = stack.peek();
                max = Math.max(max,i-stack.pop()-1);
                i = temp;
                if(stack.empty()){
                    max = Math.max(max,i);
                }
            }
            return max;
        }


    }
}
