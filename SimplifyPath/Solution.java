package SimplifyPath;
import java.util.Stack;

class Solution {
    public String simplifyPath(String path) {
        String[] file_names = path.split("/");
        Stack<String> s = new Stack<>();
        for (String a : file_names){
            if (a.equals(".") || a.isEmpty()){
                continue;
            }
            else if (a.equals("..")){
                if (!s.isEmpty()){
                    s.pop();
                }
            }
            else{
                s.push(a);
            }
        }
        path = "";
        while(!s.isEmpty()){
            path ="/" + s.pop() + path;
        }
        if (path.equals("")){
            path="/";
        }
        return path;
    }
}