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

    static String postToPre(String s) {
        // s="AB+CD-*" ----> s="*+AB-CD"
        Stack<String> stack = new Stack<>();

        return s;
    }
}
