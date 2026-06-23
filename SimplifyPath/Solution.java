package SimplifyPath;
import java.util.ArrayDeque;
import java.util.Deque;

// class Solution {
//     public String simplifyPath(String path) {
//         Stack<String> s = new Stack<>();
//         String fn = "";
//         for (int i=0;i<path.length();i++){
//             if (path.charAt(i)!='/'){
//                 fn += path.charAt(i);
//             }
//             else if (path.charAt(i)=='/'){
//                 if (fn.equals(".")||fn.equals("")){
//                 }
//                 else if (fn.equals("..")){
//                     if (!s.isEmpty()){
//                         s.pop();
//                     }
//                 }
//                 else{
//                     s.push(fn);
//                 }
//                 fn="";
//             }
//             if (i==path.length()-1){
//                 if (fn.equals(".")||fn.equals("")){
//                 }
//                 else if (fn.equals("..")){
//                     if (!s.isEmpty()){
//                         s.pop();
//                     }
//                 }
//                 else{
//                     s.push(fn);
//                 }
//             }
//         }
//         path = "";
//         while(!s.isEmpty()){
//             path ="/" + s.pop() + path;
//         }
//         if (path.equals("")){
//             path="/";
//         }
//         return path;
//     }
// }

class Solution {
    public String simplifyPath(String path) {
        StringBuilder sb = new StringBuilder();
        String[] file_names = path.split("/");
        Deque<String> s = new ArrayDeque<>();
        for (String a : file_names){
            if (a.equals(".") || a.isEmpty()){
            }
            else if (a.equals("..")){
                if (!s.isEmpty()){
                    s.removeLast();
                }
            }
            else{
                s.addLast(a);
            }
        }
        
        for (String str : s){
            sb.append("/"+str);
        }
        if (sb.isEmpty()){
            sb.append("/");
        }
        return sb.toString();
    }
}