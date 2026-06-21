package ValidParenthesesinanExpression;

import java.util.Stack;

public class Solution {
    public boolean isValid(String s){
        return isValidHelper(s);
    }

    private boolean isValidHelper(String s){
        Stack<Character> stack = new Stack<>();
        stack.push(s.charAt(0));
        for (int i = 1; i<s.length();i++){
            if (stack.isEmpty()){
                stack.push(s.charAt(i));
                continue;
            }
            if ((s.charAt(i)=='}' && stack.peek()=='{')||(s.charAt(i)==')' && stack.peek()=='(')||(s.charAt(i)==']' && stack.peek()=='[')){
                char p = stack.pop();
                System.out.println(p+" has been popped\n");
            }
            else{
                stack.push(s.charAt(i));
            }
        }
        return stack.isEmpty();
    }
}
