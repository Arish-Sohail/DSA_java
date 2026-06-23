package BinaryTreeInorderTraversal;
import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> inorderTraversal(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        itHelper(root,list);
        return list;
    }
    private void itHelper(TreeNode root, List<Integer> list){
        if (root!=null){
            itHelper(root.left,list);
            list.add(root.val);
            itHelper(root.right,list);
        }
    }
}



class TreeNode {     
    int val;     
    TreeNode left;     
    TreeNode right;     
    TreeNode() {}    
    TreeNode(int val) { this.val = val; }     
    TreeNode(int val, TreeNode left, TreeNode right) {         
        this.val = val;
        this.left = left;
        this.right = right;
    }
}

