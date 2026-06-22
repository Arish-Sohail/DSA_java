package DeleteMiddleofaStack;
import java.util.Stack;

public class Solution {
    // Function to delete middle element of a stack.
    public void deleteMid(Stack<Integer> s) {
        // code here
        int mid = (s.size()-1)/2;
        dmHelper(s,mid);
    }
    private void dmHelper(Stack<Integer> s,int mid){
        int ti = s.pop();
        if (s.size()==mid){
            return;
        }
        dmHelper(s,mid);
        s.push(ti);
        return;
    }
}
