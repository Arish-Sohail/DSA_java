package BuildanArrayWithStackOperations;

import java.util.ArrayList;
import java.util.List;

// 1) Binari search
// 2) List in java

public class Solution {
    public List<String> buildArray(int[] target, int n) {
        List<String> list = new ArrayList<>();
        int j = 0;
        for (int i = 1;i<=target[target.length-1];i++){
            list.add("Push");
            if (target[j]!=i){
                list.add("Pop");
                j--;
            }
            j++;
        }
        return list;
    }

    public static void main(String[] args) {
        Solution s = new Solution();
        int[] target = {1,2,4,5,6,7};
        List<String> g = s.buildArray(target, 9);
        for(String a : g){
            System.out.print(a+" ");
        }
    }
}

// public class Solution {
//     public List<String> buildArray(int[] target, int n) {
//         List<String> list = new ArrayList<>();
//         Stack<Integer> stack = new Stack<>();
//         for (int i = 1; i <= target[target.length-1];i++){
//             stack.push(i);
//             list.add("Push");
//             System.out.println(Arrays.binarySearch(target,stack.peek()));
//             if (Arrays.binarySearch(target,stack.peek())<0){
//                 stack.pop();
//                 list.add("Pop");
                
//             }
//         }
//         return list;
//     }

//     public static void main(String[] args) {
//         Solution s = new Solution();
//         int[] target = {1,2,4,5,6,7};
//         List<String> g = s.buildArray(target, 9);
//         for(String a : g){
//             System.out.print(a+" ");
//         }
//     }
// }
