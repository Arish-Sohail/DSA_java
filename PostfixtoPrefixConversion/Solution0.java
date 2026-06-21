package PostfixtoPrefixConversion;

import java.util.Stack;

public class Solution0 {
    static boolean isOp(char c){
        switch (c) {
            case '+':
            case '-':
            case '/':
            case '^':
            case '*':
                return true;
        }
        return false;
    }

    public String postToPre(String s) {
        // s="AB+CD-*" ----> s="*+AB-CD"
        Stack<String> stack = new Stack<>();

        for (int i = 0;i<s.length();i++){

            if (isOp(s.charAt(i))){
                String opd1 = stack.pop();
                String opd2 = stack.pop();
                String op = s.charAt(i)+"";
                stack.push(op+opd2+opd1);
            }
            else{
                stack.push(s.charAt(i)+"");
            }
        }

        return stack.pop();
    }
}
