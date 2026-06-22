package DeleteMiddleofaStack;

import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Solution sol = new Solution();
        Stack<Integer> s = new Stack<>();
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);
        s.push(6);
        s.push(7);
        
        sol.deleteMid(s);

        for (int i = 0; i<s.size();i++){
            System.out.print(s.get(i) + " ");
        }
    }
}
