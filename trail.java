
import java.util.ArrayDeque;
import java.util.Deque;


public class trail{
    public static void main(String[] args) {
        String path = "/a";
        String[] file_names = path.split("/");
        Deque<String> dq = new ArrayDeque<>();
        dq.offer("a");
        dq.offer("b");
        dq.offer("c");
        dq.offer("d");
        dq.offer("e");
        System.out.println(dq.removeLast());
        System.out.println(dq.removeLast());
        
        // for (String a:dq){
        //     System.out.println(a);
        // }
    }
}